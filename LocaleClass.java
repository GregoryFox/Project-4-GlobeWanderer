public class LocaleClass {

    private int    id;
    private String name;
    private String desc;
    private String item;
    private boolean hasVisited = false;
    private int cash;
    private LocaleClass next = null;



    public LocaleClass getNext() {
        return next;
    }

    public void setNext(LocaleClass next) {
        this.next = next;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocaleClass(int theId) {
        this.id = theId;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String value) {
        desc = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public boolean getHasVisited() {
        return hasVisited;
    }

    public void setHasVisited(boolean hasVisited) {
        this.hasVisited = hasVisited;
    }

    public String toString() {
        return "[Locale class: id= " + this.id + " Name= "+ this.name + " Desc= " + this.desc + "]";

    }

}