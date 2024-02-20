
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Surgery extends Hospital {
    private Patient patient;
    private List<Doctor> doctorsInSurgery = new ArrayList<>();
    private List<Nurse> nursesInSurgery = new ArrayList<>();
    private List<SurgicalMaterial> surgicalMaterialList = new ArrayList<>();



    public void addNurse(String employeeID){
        if (nursesInSurgery.size() < 5){
            Optional<Nurse> nurseOptional = nurses.stream().filter(nurse -> nurse.employeeID.equals(employeeID)).findAny();
            if(nurseOptional.isPresent()){
                Nurse nurse = nurseOptional.get();
                nursesInSurgery.add(nurse);
            } else {
                throw new IllegalArgumentException("Nurses not found");
            }
        } else {
            throw new IllegalArgumentException("Cannot add more than 5 nurses to a surgery.");
        }
    }

    public void addSurger(String employeeID){
        Optional<Doctor> doctorOptional = doctors.stream().filter(doctor -> doctor.employeeID.equals(employeeID)).findAny();
        if(doctorOptional.isPresent()){
            Doctor doctor = doctorOptional.get();
            if(doctor.isSurgeon()){
                doctorsInSurgery.add(doctor);
            } else {
                throw new IllegalArgumentException("This doctor is not Surger");
            }

        } else {
            throw new IllegalArgumentException("Doctor not found");
        }
    }

    public void addSurgicalMaterial(String name,Double price, Integer quantity){
        SurgicalMaterial surgicalMaterial = new SurgicalMaterial(name,price,quantity);
        surgicalMaterialList.add(surgicalMaterial);

    }

    public Surgery startSurgery(){
        if(doctors.size() < 2){
            throw new RuntimeException("The surgery cannot be started with less than 2 surgeons.");
        }else {
            CompletedSurgery completedSurgery = new CompletedSurgery(patient);
            completedSurgery.setDoctors(doctorsInSurgery);
            
            return this;
        }
    }


}
