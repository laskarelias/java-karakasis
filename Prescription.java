import java.util.ArrayList;
import java.util.Date;

public class Prescription {

    class PrescriptionContent{
        private ArrayList<Drug> drugList; //6 drugs maximum
        private ArrayList<Integer>  drugAmounts;

        public PrescriptionContent(ArrayList<Drug> drugList, ArrayList<Integer> drugAmounts) {
            this.setDrugList(drugList);
            this.setDrugAmounts(drugAmounts);
        }

        public ArrayList<Integer> getDrugAmounts() {
            return drugAmounts;
        }

        public void setDrugAmounts(ArrayList<Integer> drugAmounts) {
            this.drugAmounts = drugAmounts;
        }

        public ArrayList<Drug> getDrugList() {
            return drugList;
        }

        public void setDrugList(ArrayList<Drug> drugList) {
            this.drugList = drugList;
        }
        
    }

    private int ID;
    private Doctor prescribedByDoctor;
    private Patient prescribedForPatient;
    private Date date;
    private PrescriptionContent prescriptionContent;

    
    public Prescription(Doctor prescribedByDoctor, Patient prescribedForPatient, Date date,
                        ArrayList<Drug> drugList, ArrayList<Integer> drugAmounts) {
        this.prescribedByDoctor = prescribedByDoctor;
        this.prescribedForPatient = prescribedForPatient;
        this.date = date;
        this.prescriptionContent = new PrescriptionContent(drugList, drugAmounts);

        //generate ID
    }
    public Doctor getPrescribedByDoctor() {
        return prescribedByDoctor;
    }
    public PrescriptionContent getPrescriptionContent() {
        return prescriptionContent;
    }
    public void setPrescriptionContent(PrescriptionContent prescriptionContent) {
        this.prescriptionContent = prescriptionContent;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Patient getPrescribedForPatient() {
        return prescribedForPatient;
    }
    public void setPrescribedForPatient(Patient prescribedForPatient) {
        this.prescribedForPatient = prescribedForPatient;
    }
    public void setPrescribedByDoctor(Doctor prescribedByDoctor) {
        this.prescribedByDoctor = prescribedByDoctor;
    }
    
}
