package Java.MasterClass;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem itemToAdd);
    boolean removeItem(ListItem itemToRemove);
    void traverse(ListItem root);
}
