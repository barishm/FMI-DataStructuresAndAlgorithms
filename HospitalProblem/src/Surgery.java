
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Surgery {
    private final Integer surgeryID;
    private final Hospital hospital;
    private Patient patient;
    private final List<Doctor> doctorsInSurgery = new ArrayList<>();
    private final List<Nurse> nursesInSurgery = new ArrayList<>();
    private final List<SurgicalMaterial> surgicalMaterialList = new ArrayList<>();

    public Surgery(Integer surgeryID, Hospital hospital) {
        this.surgeryID = surgeryID;
        this.hospital = hospital;
    }

    public void addPatient(Integer patientID) {
        if(patient == null){
            patient = hospital.getPatients().get(patientID);
            if(patient == null){
                throw new IllegalArgumentException("Patient not found");
            }
        } else {
            throw new IllegalArgumentException("Patient already added");
        }
        System.out.println("Patient added");
    }

    public void addNurse(Integer employeeID){
        if (nursesInSurgery.size() < 5){
            Nurse nurse1 = hospital.getNurses().get(employeeID);
            if(nurse1 != null){
                nursesInSurgery.add(nurse1);
                System.out.println("Nurse is added");
            } else {
                throw new IllegalArgumentException("Nurses not found");
            }
        } else {
            throw new IllegalArgumentException("Cannot add more than 5 nurses to a surgery.");
        }
    }

    public void addSurger(Integer employeeID){
        Doctor doctor1 = hospital.getDoctors().get(employeeID);
        if(doctor1 != null){
            if(doctor1.isSurgeon()){
                doctorsInSurgery.add(doctor1);
                System.out.println("Doctor is added");
            } else {
                throw new IllegalArgumentException("This doctor is not Surger");
            }

        } else {
            throw new IllegalArgumentException("Doctor not found");
        }
    }

    public void addSurgicalMaterial(String name,double price, int quantity){
        SurgicalMaterial surgicalMaterial = new SurgicalMaterial(name,price,quantity);
        surgicalMaterialList.add(surgicalMaterial);
        System.out.println("Surgical Materials added");
    }

    public void startSurgery(){

        if(this.hospital.getDoctors().isEmpty()){
            throw new RuntimeException("A surgery must have at least one doctor");
        }else {
            CompletedSurgery completedSurgery = new CompletedSurgery(patient);
            completedSurgery.setDoctors(doctorsInSurgery);
            double totalPrice = doctorsInSurgery.stream()
                    .mapToDouble(Doctor::getFeePerSurgery)
                    .sum();
            double totalPriceOfMaterials = surgicalMaterialList.stream().mapToDouble(SurgicalMaterial::getTotalPrice).sum();

            completedSurgery.setTotalPrice(totalPrice + totalPriceOfMaterials);
            completedSurgery.setLocalDate(LocalDate.now());
            System.out.println("Surgery is completed");
            hospital.getCompletedSurgeries().put(this.surgeryID,completedSurgery);
        }

    }
}
