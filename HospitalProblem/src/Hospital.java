import java.util.HashMap;

public class Hospital {
    private final HashMap<Integer,Doctor> doctors;
    private final HashMap<Integer,Nurse> nurses;
    private final HashMap<Integer,Patient> patients;
    private final HashMap<Integer,CompletedSurgery> completedSurgeries;

    private final HashMap<Integer,Visit> visits;


    public Hospital() {
        this.doctors = new HashMap<>();
        this.nurses = new HashMap<>();
        this.patients = new HashMap<>();
        this.completedSurgeries = new HashMap<>();
        this.visits = new HashMap<>();
        Doctor doctor1 = new Doctor("Robin cool",1,true,200);
        Doctor doctor2 = new Doctor("Alex Kovach",2,true,200);
        Doctor doctor3 = new Doctor("Sasha cool",3,true,200);
        Doctor doctor4 = new Doctor("Barish Mehmed",4,true,200);
        Doctor doctor5 = new Doctor("Ivan Ivanov",5,false,200);
        Doctor doctor6 = new Doctor("John Cena",6,false,200);
        Doctor doctor7 = new Doctor("Robert Newton",7,false,200);
        //...
        this.doctors.put(doctor1.getEmployeeID(),doctor1);
        this.doctors.put(doctor2.getEmployeeID(),doctor2);
        this.doctors.put(doctor3.getEmployeeID(),doctor3);
        this.doctors.put(doctor4.getEmployeeID(),doctor4);
        this.doctors.put(doctor5.getEmployeeID(),doctor5);
        this.doctors.put(doctor6.getEmployeeID(),doctor6);
        this.doctors.put(doctor7.getEmployeeID(),doctor7);



        Nurse nurse1 = new Nurse("Maria",8);
        Nurse nurse2 = new Nurse("Victor",9);
        Nurse nurse3 = new Nurse("Kristina",10);
        Nurse nurse4 = new Nurse("Dara",11);
        Nurse nurse5 = new Nurse("Victoria",12);
        Nurse nurse6 = new Nurse("Petya",13);
        Nurse nurse7 = new Nurse("Daniela",14);
        Nurse nurse8 = new Nurse("Stela",15);
        //..
        this.nurses.put(nurse1.getEmployeeID(),nurse1);
        this.nurses.put(nurse2.getEmployeeID(),nurse2);
        this.nurses.put(nurse3.getEmployeeID(),nurse3);
        this.nurses.put(nurse4.getEmployeeID(),nurse4);
        this.nurses.put(nurse5.getEmployeeID(),nurse5);
        this.nurses.put(nurse6.getEmployeeID(),nurse6);
        this.nurses.put(nurse7.getEmployeeID(),nurse7);
        this.nurses.put(nurse8.getEmployeeID(),nurse8);

        Patient patient1 = new Patient("patient1",1);
        Patient patient2 = new Patient("patient2",2);
        Patient patient3 = new Patient("patient3",3);
        Patient patient4 = new Patient("patient4",4);
        Patient patient5 = new Patient("patient5",5);
        this.patients.put(patient1.getPatientID(),patient1);
        this.patients.put(patient2.getPatientID(),patient2);
        this.patients.put(patient3.getPatientID(),patient3);
        this.patients.put(patient4.getPatientID(),patient4);
        this.patients.put(patient5.getPatientID(),patient5);

    }
    public HashMap<Integer, Visit> getVisits() {
        return visits;
    }

    public HashMap<Integer, CompletedSurgery> getCompletedSurgeries() {
        return completedSurgeries;
    }

    public HashMap<Integer, Doctor> getDoctors() {
        return doctors;
    }

    public HashMap<Integer, Nurse> getNurses() {
        return nurses;
    }

    public HashMap<Integer, Patient> getPatients() {
        return patients;
    }



}
