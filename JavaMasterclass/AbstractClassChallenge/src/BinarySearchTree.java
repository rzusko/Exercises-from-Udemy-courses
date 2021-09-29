public class BinarySearchTree {

    private BinaryTreeItem head;

    public BinarySearchTree() {
        this.head = null;
    }

    public boolean add(BinaryTreeItem item) {
        if (this.head == null) {
            this.head = item;
            return true;
        }

        BinaryTreeItem existingItem = this.head;

        while (existingItem != null) {
            if (item.compareTo(existingItem) == 0) {
                return false;
            } else if (item.compareTo(existingItem) < 0) {
                existingItem = existingItem.previous();
            } else {
                existingItem = existingItem.next();
            }
        }

        existingItem = item;
        return true;
    }
}
