public class Patient extends Person{

    private String SSN; // Social Security Number - given auto from system 11digit
    
    public String getSSN() {
        return SSN;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);

        //generate SSN

    }


}
