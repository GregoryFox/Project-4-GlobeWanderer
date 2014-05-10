public class localeListMan {

    private LocaleClass head = null;
    private LocaleClass last = null;


    public LocaleClass getHead() {
        return head;
    }
    public void setHead(LocaleClass head) {
        this.head = head;
    }

    public void add(LocaleClass location) {

        if (this.head == null) {

            this.head = location;
            this.last = location;
        } else {

            this.last.setNext(location);
            this.last = location;


        }
    }
}