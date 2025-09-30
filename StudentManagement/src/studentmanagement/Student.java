package studentmanagement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String ID;
    private String fullName;
    private Date date;
    private String gender;
    private String email;

    public Student(String ID, String fullName, Date date, String gender, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("ID: %s \n Name: %s \n Date: %s \n Gender: %s \n Email: %s",
                ID, fullName, sdf.format(date), gender, email);
    }
}
