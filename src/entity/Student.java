package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private String studentID;
    private String studentName;
    private String studentDOB;
    private String studentAddress;
    private String studentContact;
    private String studentEmail;
    private String studentGender;

    @ManyToMany
    private List<Programme> programmeList = new ArrayList<>();

    public Student() {
    }

    public Student(String studentID, String studentName, String studentDOB, String studentAddress, String studentContact, String studentEmail, String studentGender, List<Programme> programmeList) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentAddress = studentAddress;
        this.studentContact = studentContact;
        this.studentEmail = studentEmail;
        this.studentGender = studentGender;
        this.programmeList = programmeList;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public List<Programme> getProgrammeList() {
        return programmeList;
    }

    public void setProgrammeList(List<Programme> programmeList) {
        this.programmeList = programmeList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentDOB='" + studentDOB + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", programmeList=" + programmeList +
                '}';
    }
}
