import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class PharmacySystem {

    private static Pharmacy ph; // Contains list of drugs
    private static IDGenerator idGen; // Creates unique ids at random
    private static ArrayList<Doctor> doctors; // Contains doctors created during runtime
    private static Scanner inputs;
    public static void main (String[] args) {
        ph = new Pharmacy("MyPharmacy", "Pharmacy Avenue", 7, "New York", "+306977777777");
        idGen = new IDGenerator();
        launch(ph);
    }
    
    private static void launch(Pharmacy ph){
        System.out.println("Welcome to " + ph.getName() + "!");
        inputs = new Scanner(System.in);
        doctors = new ArrayList<>();
        mainMenu();
    }

    private static void mainMenu(){
        System.out.println("===================");
        System.out.println("1. Enter new Drug");
        System.out.println("2. Enter new Doctor Information");
        System.out.println("3. Enter new Patient Information");
        System.out.println("4. Enter new Prescription");
        System.out.println("5. Delete Prescription");
        System.out.println("6. Search Prescriptipn");
        System.out.println("7. Calculate Prescription cost");
        System.out.println("8. Print data");
        System.out.println();
        System.out.println("9. Exit");
        System.out.println("===================");
        
        int choice = inputs.nextInt();
        
        switch(choice){
            case 1:
                newDrug();
                break;
            case 2:
                newDoctor();
                break;
            
        }
    }

    private static void newDrug() {
        
        System.out.println("New drug entry...");
        System.out.println("===================");
        System.out.println("Enter drug name...");
        String name = inputs.nextLine();
        inputs.nextLine(); // eats Enter press
        System.out.println("Enter drug cost (EE.cc format)...");
        float cost = inputs.nextFloat();

        //check in database for drug ID
        int id = idGen.generateDrug(name);

        ph.enterNewDrug(name, cost, id);

        System.out.println("Entry submitted.");
        mainMenu();
    }

    private static void newDoctor() {
        
        System.out.println("New doctor entry...");
        System.out.println("===================");
        System.out.println("Enter doctor last name...");
        String lname = inputs.nextLine();
        inputs.nextLine();
        System.out.println("Enter doctor first name...");
        String fname = inputs.nextLine();
        String name = lname + " " + fname;

        String sn = idGen.generateDoctorSN(name);
        Doctor doc = new Doctor(fname, lname, sn);
        doctors.add(doc);

        System.out.println("Entry submitted.");

        for(Doctor doct : doctors){
            System.out.println(doct.getFirstName() + " " + doct.getLastName() + " " + doct.getSN());
        }

        mainMenu();
    }
}
