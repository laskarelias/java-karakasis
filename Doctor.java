public class Doctor extends Person{
    
    private String SN; // Social Number (DOCTOR) - given auto from system 11digit
    
    public String getSN() {
        return SN;
    }
    public void setSN(String SN) {
        this.SN = SN;
    }

    public Doctor(String firstName, String lastName, String SN) {
        super(firstName, lastName);

        //generated SN
        this.SN = SN;
    }
}
