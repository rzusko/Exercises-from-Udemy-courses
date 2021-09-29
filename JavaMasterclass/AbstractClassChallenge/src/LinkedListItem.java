public class LinkedListItem extends ListItem {

    public LinkedListItem(String value) {
        super(value);
    }

    public LinkedListItem(String value, LinkedListItem next, LinkedListItem previous) {
        super(value, next, previous);
    }

    @Override
    public LinkedListItem next() {
        return (LinkedListItem) super.next();
    }

    @Override
    public LinkedListItem previous() {
        return (LinkedListItem) super.previous();
    }
}
