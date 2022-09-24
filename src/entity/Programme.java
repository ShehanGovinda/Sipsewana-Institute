package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Programme {
    @Id
    private String programmeID;
    private String programmeName;
    private String programmeDuration;
    private String programmeFee;

    @ManyToMany(mappedBy = "programmeList")
    private List<Student> studentList = new ArrayList<>();

    public Programme(String programmeID, String programmeName, String programmeDuration, String programmeFee) {
    }

    public Programme(String programmeID, String programmeName, String programmeDuration, String programmeFee, List<Student> studentList) {
        this.programmeID = programmeID;
        this.programmeName = programmeName;
        this.programmeDuration = programmeDuration;
        this.programmeFee = programmeFee;
        //this.studentList = studentList;
    }

    public String getProgrammeID() {
        return programmeID;
    }

    public void setProgrammeID(String programmeID) {
        this.programmeID = programmeID;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getProgrammeDuration() {
        return programmeDuration;
    }

    public void setProgrammeDuration(String programmeDuration) {
        this.programmeDuration = programmeDuration;
    }

    public String getProgrammeFee() {
        return programmeFee;
    }

    public void setProgrammeFee(String programmeFee) {
        this.programmeFee = programmeFee;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Programme{" +
                "programmeID='" + programmeID + '\'' +
                ", programmeName='" + programmeName + '\'' +
                ", programmeDuration='" + programmeDuration + '\'' +
                ", programmeFee='" + programmeFee + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
