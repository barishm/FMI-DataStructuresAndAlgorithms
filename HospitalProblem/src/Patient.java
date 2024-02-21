import java.util.Objects;

public class Patient extends Person {

    private Integer patientID;

    protected Patient(String fullName,Integer patientID) {
        super(fullName);
        this.patientID = patientID;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

}
