
public class Flower
{
    private int id;
    private String name, color, size;
    private double wholesalePrice, retailPrice;
    private int onHand;

    //This is the constructor for flower//
    public Flower() {
        super();
        this.id = 1;
        this.name = "";
        this.color = "";
        this.size = "";
        this.wholesalePrice = 0.0;
        this.retailPrice = 0.0;
        this.onHand = 0;
    }
    //get statements//
    public double getRetailPrice() {
        return retailPrice;
    }

    public int getOnHand() {
        return onHand;
    }       
     public String getSize() {
        return size;
    }
    
    public int getId() {
        return id;
    }
     
    public double getWholesalePrice() {
        return wholesalePrice;
    }
    

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
   
    //put statements//
    public void putSize(String size) {
        this.size = size;
    }
    
     public void putName(String name) {
        this.name = name;
    }

    
    public void putId(int id) {
        this.id = id;
    }


    public void putColor(String color) {
        this.color = color;
    }


    public void putOnHand(int onHand) {
        this.onHand = onHand;
    }

    public void putWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public void putRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    //using the  string method now//
    public String toString() {
        return "Flower [id=" + id + ", name=" + name + ", color=" + color + ", size=" + size + ", wholesalePrice="
        + wholesalePrice + ", retailPrice=" + retailPrice + ", onHand=" + onHand + "]";
    }   
    
    //usimg the compare  method now//
    public int compareTo(Flower o) {
        return name.compareTo(o.name);
    }    
}
