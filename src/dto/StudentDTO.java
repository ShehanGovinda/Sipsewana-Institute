package dto;

public class StudentDTO {
    private String studentID;
    private String studentName;
    private String studentDOB;
    private String studentAddress;
    private String studentContact;
    private String studentEmail;
    private String studentGender;

    public StudentDTO() {
    }

    public StudentDTO(String studentID, String studentName, String studentDOB, String studentAddress, String studentContact, String studentEmail, String studentGender) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentAddress = studentAddress;
        this.studentContact = studentContact;
        this.studentEmail = studentEmail;
        this.studentGender = studentGender;
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

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentDOB='" + studentDOB + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentGender='" + studentGender + '\'' +
                '}';
    }
}
