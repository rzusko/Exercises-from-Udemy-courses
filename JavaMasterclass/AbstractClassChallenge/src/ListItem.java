

public abstract class ListItem {

    private String value;
    private ListItem next;
    private ListItem previous;

    public ListItem( String value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public ListItem(String value, ListItem next, ListItem previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public String getValue() {
        return value;
    }

    public ListItem next() {
        return this.next;
    }

    public ListItem previous() {
        return this.previous;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public int compareTo(ListItem listItem) {
//        if (this.value == listItem.value) {
//            return 0;
//        } else if (this.value > listItem.value) {
//            return 1;
//        } else {
//            return -1;
//        }
        return this.value.compareTo(listItem.value);
    }

    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }


}
