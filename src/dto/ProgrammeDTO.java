package dto;

public class ProgrammeDTO {
    private String programmeID;
    private String programmeName;
    private String programmeDuration;
    private String programmeFee;

    public ProgrammeDTO() {
    }

    public ProgrammeDTO(String programmeID, String programmeName, String programmeDuration, String programmeFee) {
        this.programmeID = programmeID;
        this.programmeName = programmeName;
        this.programmeDuration = programmeDuration;
        this.programmeFee = programmeFee;
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

    @Override
    public String toString() {
        return "ProgrammeDTO{" +
                "programmeID='" + programmeID + '\'' +
                ", programmeName='" + programmeName + '\'' +
                ", programmeDuration='" + programmeDuration + '\'' +
                ", programmeFee='" + programmeFee + '\'' +
                '}';
    }
}
