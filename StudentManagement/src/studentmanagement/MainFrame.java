package studentmanagement;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;
import javax.swing.filechooser.*;

public class MainFrame extends JFrame {

    private final StudentManager manager;
    private final DefaultTableModel tableModel;
    private final JTable table;

    public MainFrame(StudentManager manager) {
        this.manager = manager;
        setTitle("Student Management");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Date", "Gender", "Email",}, 0);
        table = new JTable(tableModel);
        table.setDefaultEditor(Object.class, null);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        table.setRowSorter(sorter);
        sorter.setSortKeys(Arrays.asList(
                new RowSorter.SortKey(1, SortOrder.ASCENDING)
        ));
        loadTable();
        JScrollPane scrollPane = new JScrollPane(table);
        JButton btnAdd = new JButton("Add");
        JButton btnEdit = new JButton("Edit");
        JButton btnDelete = new JButton("Delete");
        JButton btnSearch = new JButton("Search");
        JButton btnSaveFile = new JButton("Save");
        JButton btnOpenFile = new JButton("Open");
        JButton btnExit = new JButton("Exit");
        JPanel panelButtons = new JPanel();
        panelButtons.add(btnAdd);
        panelButtons.add(btnEdit);
        panelButtons.add(btnDelete);
        panelButtons.add(btnSearch);
        panelButtons.add(btnSaveFile);
        panelButtons.add(btnOpenFile);
        panelButtons.add(btnExit);
        add(scrollPane, BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);

        btnAdd.addActionListener(e -> addStudent());
        btnEdit.addActionListener(e -> editStudent());
        btnDelete.addActionListener(e -> deleteStudent());
        btnSearch.addActionListener(e -> searchStudent());
        btnExit.addActionListener(e -> System.exit(0));
        btnSaveFile.addActionListener(e -> saveFile());
        btnOpenFile.addActionListener(e -> loadFile());
    }

    private void loadTable() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        tableModel.setRowCount(0);
        for (Student s : manager.getAll()) {
            tableModel.addRow(new Object[]{s.getID(), s.getFullName(), sdf.format(s.getDate()), s.getGender(), s.getEmail()});
        }
    }

    private boolean showStudentForm(Student existingStudent) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        JTextField idField = new JTextField(15);
        JTextField nameField = new JTextField(15);
        JTextField dateField = new JTextField(15);
        JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        JTextField emailField = new JTextField(15);

        if (existingStudent != null) {
            idField.setText(existingStudent.getID());
            idField.setEnabled(false);
            nameField.setText(existingStudent.getFullName());
            dateField.setText(sdf.format(existingStudent.getDate()));
            genderBox.setSelectedItem(existingStudent.getGender());
            emailField.setText(existingStudent.getEmail());
        }

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.add(new JLabel("Student ID:"));
        panel.add(idField);
        panel.add(new JLabel("Full Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Date (dd/MM/yyyy):"));
        panel.add(dateField);
        panel.add(new JLabel("Gender:"));
        panel.add(genderBox);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);

        int result = JOptionPane.showConfirmDialog(
                this, panel,
                (existingStudent == null ? "Add Student" : "Edit Student"),
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            try {
                String id = idField.getText().trim();
                String name = nameField.getText().trim();
                Date date = sdf.parse(dateField.getText().trim());
                String gender = (String) genderBox.getSelectedItem();
                String email = emailField.getText().trim();
                if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                    JOptionPane.showMessageDialog(this, "Invalid email input", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                } else {
                    if (existingStudent == null) {
                        manager.addStudent(new Student(id, name, date, gender, email));
                    } else {
                        existingStudent.setFullName(name);
                        existingStudent.setDate(date);
                        existingStudent.setGender(gender);
                        existingStudent.setEmail(email);
                    }
                }
                loadTable();
                return true;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Invalid date! Use dd/MM/yyyy", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
        return false;
    }

    private void addStudent() {
        showStudentForm(null);
    }

    private void editStudent() {
        int row = table.getSelectedRow();
        if (row >= 0) {
            int modelRow = table.convertRowIndexToModel(row);
            String id = (String) tableModel.getValueAt(modelRow, 0);
            Student s = manager.findStudent(id);
            if (s != null) {
                boolean updated = showStudentForm(s);
                if (updated) {
                    JOptionPane.showMessageDialog(this, "Updated successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Updated cancelled");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Choose a student to edit");
        }
    }

    private void deleteStudent() {
        String id = JOptionPane.showInputDialog(this, "Enter student ID to delete: ");
        if (id != null && !id.trim().isEmpty()) {
            boolean s = manager.removeStudent(id);
            if (!s) {
                JOptionPane.showMessageDialog(this, "Student not found");
            } else {
                JOptionPane.showMessageDialog(this, "Delete Successfully");
            }
        }
    }

    private void searchStudent() {
        String id = JOptionPane.showInputDialog(this, "Enter student ID to find: ");
        if (id != null && !id.trim().isEmpty()) {
            Student s = manager.findStudent(id);
            if (s != null) {
                JOptionPane.showMessageDialog(this, "Found: \n" + s);
            } else {
                JOptionPane.showMessageDialog(this, "Student not found");
            }
        }
    }

    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("TXT Files",
                "txt"));
        int res = fileChooser.showSaveDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            String fName = fileChooser.getSelectedFile().getAbsolutePath();
            if (!fName.toLowerCase().endsWith(".txt")) {
                fName += ".txt";
            }
            manager.saveToFile(fName);
            JOptionPane.showMessageDialog(this, "Saved " + fName + " successfully");
        }
    }

    private void loadFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("TXT Files",
                "txt"));

        int res = fileChooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            manager.loadFromFile(file.getAbsolutePath());
            loadTable();
            JOptionPane.showMessageDialog(this, "Loaded " + file + " successfully");
        }
    }
}
