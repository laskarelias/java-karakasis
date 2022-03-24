import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Pharmacy {

    class Address{
        private String road;
        private int roadNumber;
        private String town;

        Address(String road, int roadNumber, String town) {
            this.setRoad(road);
            this.setRoadNumber(roadNumber);
            this.setTown(town);
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public int getRoadNumber() {
            return roadNumber;
        }

        public void setRoadNumber(int roadNumber) {
            this.roadNumber = roadNumber;
        }

        public String getRoad() {
            return road;
        }

        public void setRoad(String road) {
            this.road = road;
        }
    }

    //Variables for pharmacy brand name
    private String name;
    private Address address;
    private String phoneNumber;

    //Variables for pharmacy stock
    private ArrayList<Drug> drugs;

    //Constructor for class Pharmacy
    public Pharmacy(String name, String road, int roadNumber, String town, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = new Address(road, roadNumber, town);

        drugs = new ArrayList<>();
    }

    // Functions
    public void enterNewDrug(String name, float cost, int id){
        for(Drug d : drugs){
            //Look for duplicate entry
            if(d.getName().equals(name)) return;
        }
        
        drugs.add(new Drug(name,cost,id));
    }


    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
