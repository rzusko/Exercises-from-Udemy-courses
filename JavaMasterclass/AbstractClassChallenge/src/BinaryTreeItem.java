public class BinaryTreeItem extends ListItem {

    public BinaryTreeItem(String value) {
        super(value);
    }

    public BinaryTreeItem(String value, ListItem right, ListItem left) {
        super(value, right, left);
    }

    @Override
    public BinaryTreeItem next() {
        return (BinaryTreeItem) super.next();
    }

    @Override
    public BinaryTreeItem previous() {
        return (BinaryTreeItem) super.previous();
    }
}
