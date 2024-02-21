import java.time.LocalDate;
import java.util.HashMap;

public class Visit {
    private final Integer visitID;
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    private final Hospital hospital;

    public Integer getVisitID() {
        return visitID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public Visit(Integer visitID, Patient patient, Doctor doctor, LocalDate date, Hospital hospital) {
        this.visitID = visitID;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.hospital = hospital;
    }

    public void makeAVisit() {
        HashMap<Integer, Visit> visits = hospital.getVisits();
        boolean canVisit = true;
        int visitCount = 0;

        for (Visit visit:visits.values()) {
            if(visit.getPatient().equals(this.patient) && visit.getDate().getYear() == LocalDate.now().getYear()) {
                visitCount++;
                if(visitCount == 3){
                    canVisit = false;
                    break;
                }
            }
        }
        if(canVisit) {
            hospital.getVisits().put(visitID,this);
        } else {
            throw new RuntimeException("Visit cannot be made");
        }
    }
}
