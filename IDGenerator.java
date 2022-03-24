import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class IDGenerator{
    private HashMap<String, Integer> drugIDs;
    private HashMap<String, String> doctorSNs;
    private HashMap<String, Integer> patientSSNs;

    //unique ids
    private HashSet<Integer> prescriptionIDs;
    private HashSet<Integer> drugIDs_unique;
    private HashSet<String> doctorSNs_unique;

    public IDGenerator(){
        drugIDs = new HashMap<>();
        doctorSNs = new HashMap<>();
        patientSSNs = new HashMap<>();

        prescriptionIDs = new HashSet<>();
        drugIDs_unique = new HashSet<>();
        doctorSNs_unique = new HashSet<>();
    }

    public int generateDrug(String name){
        if(drugIDs.containsKey(name)) return drugIDs.get(name);
        else{
            int id;
            do{
                //Create unique id
                id  = new Random().nextInt(999999) + 100000;
            }while(drugIDs_unique.contains(id));
    
            drugIDs_unique.add(id);
            drugIDs.put(name, id);
            return id;
        }
    }

    public String generateDoctorSN(String name) {
        if(doctorSNs.containsKey(name)) return doctorSNs.get(name);
        else{
            int sn1;
            int sn2;
            String sn = "";
            do{
                //Create unique SN -- 11 digit
                sn1  = new Random().nextInt(999999) + 100000;
                sn2 = new Random().nextInt(99999) + 10000;
                sn = sn1 + "" + sn2;
            }while(doctorSNs_unique.contains(sn));
    
            doctorSNs_unique.add(sn);
            doctorSNs.put(name, sn);
            return sn;
        }
    }
}