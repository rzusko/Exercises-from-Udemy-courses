
public class LinkedList {

    private LinkedListItem head;

    public LinkedList() {
        this.head = null;
    }


//  The rules for adding an item to the linked list are:
//  If the head of the list is null, make the head refer to the item to be added.
//  If the item to be added is less than the current item in the list, add the item before the
//      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
//      "next" refer to the current item).
//  If the item to be added is greater than the current item, move onto the next item and compare
//      again (if there is no next item then that is where the new item belongs).
//
// Care will be needed when inserting before the first item in the list (as it will not have a previous
// item).

    public boolean add(LinkedListItem item) {

        if (this.head == null) {
            this.head = new LinkedListItem(null, item, null);
            item.setPrevious(this.head);
            System.out.println("Head of list successfully added.");
            return true;
        }
        LinkedListItem existingItem = head.next();

        while (true) {
            if (item.compareTo(existingItem) == 0) {
                return false;
            } else if (item.compareTo(existingItem) < 0) {
                item.setNext(existingItem);
                existingItem.previous().setNext(item);
                item.setPrevious(existingItem.previous());
                existingItem.setPrevious(item);
                return true;
            } else if (existingItem.hasNext()) {
                existingItem = existingItem.next();
            } else {
                existingItem.setNext(item);
                item.setPrevious(existingItem);
                return true;
            }
        }
    }

    public boolean remove(String value) {
        if (this.head == null) {
            System.out.println("There is no item in the list.");
        } else {
            LinkedListItem item = this.head.next();

            while (item != null) {
                if (item.getValue().equals(value)) {
                    item.previous().setNext(item.next());
                    if (item.next() != null) {
                        item.next().setPrevious(item.previous());
                    }
                    System.out.println("Successfully removed.");
                    return true;
                } else {
                    item = item.next();
                }
            }
        }
        System.out.println("No item with this value.");
        return false;
    }

    public void printList() {
        if (this.head == null) {
            System.out.println("There is no item in the list.");
        } else {
            LinkedListItem item = head.next();

            while (item != null) {
                System.out.println(item.getValue());
                item = item.next();
            }
        }
    }
}

