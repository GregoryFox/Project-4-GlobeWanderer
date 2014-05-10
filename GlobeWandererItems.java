public class GlobeWandererItems {

    public GlobeWandererItems(int theId) {
        id = theId;
    }
    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLocale() {
        return locale;
    }

    public void setLocale(int locale) {
        this.locale = locale;
    }

    public GlobeWandererItems getNext() {
        return next;
    }

    public void setNext(GlobeWandererItems next) {
        this.next = next;
    }

    public String toString() {
        return "[item: id= " + this.id + " name= " + this.itemName + " desc= " + this.desc + "]";
    }

//PRIVATE

    private int    id;
    private String itemName;
    private String desc;
    private int    locale;
    private double cost;
    private GlobeWandererItems next = null;
}