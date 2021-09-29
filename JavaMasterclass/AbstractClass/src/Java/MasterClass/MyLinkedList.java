package Java.MasterClass;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem itemToAdd) {
        if (itemToAdd != null) {
            if (this.root == null) {
                this.root = itemToAdd;
                return true;
            }

            ListItem currentItem = this.root;

            while (currentItem != null) {
                int comparison = itemToAdd.compareTo(currentItem);
                if (comparison < 0) {
                    if (currentItem.previous() == null) {
                        this.root.setPrevious(itemToAdd);
                        itemToAdd.setNext(this.root);
                        this.root = itemToAdd;
                    } else {
                        itemToAdd.setPrevious(currentItem.previous());
                        currentItem.previous().setNext(itemToAdd);
                        itemToAdd.setNext(currentItem);
                        currentItem.setPrevious(itemToAdd);
                    }
                    return true;
                } else if (comparison > 0) {
                    if (currentItem.next() == null) {
                        currentItem.setNext(itemToAdd);
                        itemToAdd.setPrevious(currentItem);
                        return true;
                    } else {
                        currentItem = currentItem.next();
                    }
                } else {
                    System.out.println(itemToAdd.getValue() + " is already present, not added.");
                    return false;
                }
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        if (itemToRemove != null) {
            ListItem currentItem = this.root;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(itemToRemove);

                if (comparison == 0) {
                    if (currentItem.previous() == null) {
                        if (currentItem.next() == null) {
                            this.root = null;
                        } else {
                            this.root.next().setPrevious(this.root.previous());
                            this.root = this.root.next();
                        }
                    } else if (currentItem.next() == null) {
                        currentItem.previous().setNext(currentItem.next());
                    } else {
                        currentItem.next().setPrevious(currentItem.previous());
                        currentItem.previous().setNext(currentItem.next());
                    }
                    return true;
                } else {
                    currentItem = currentItem.next();
                }
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            ListItem currentItem = this.root;

            while (currentItem != null) {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }
        }
    }
}
