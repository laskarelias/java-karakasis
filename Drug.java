

public class Drug {
    private int ID;
    private String name;
    private float cost; //Format Euro,Cent

    public Drug(String name, float cost, int ID) {
        this.name = name;
        this.cost = cost;

        //Generated ID
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
