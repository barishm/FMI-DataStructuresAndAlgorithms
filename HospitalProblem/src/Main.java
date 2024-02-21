import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();


        /*
        Surgens ids -> 1,2,3,4
        Doctors ids -> 5,6,7
        Nurses ids -> 8,9,10,11,12,13,14,15
        Patients ids -> 1,2,3,4,5
        */

        Surgery surgery = new Surgery(1, hospital);
        surgery.addPatient(3);
        surgery.addSurger(1);
        surgery.addSurgicalMaterial("tool",20,2);
        surgery.startSurgery();
        HashMap<Integer, CompletedSurgery> completedSurgeries = hospital.getCompletedSurgeries();

        System.out.println(completedSurgeries.get(1).getTotalPrice());


    }
}