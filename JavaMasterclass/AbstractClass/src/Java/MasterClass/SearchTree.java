package Java.MasterClass;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
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
                int comprarison = itemToAdd.compareTo(currentItem);

                if (comprarison < 0) {
                    if (currentItem.previous() == null) {
                        currentItem.setPrevious(itemToAdd);
                        return true;
                    } else {
                        currentItem = currentItem.previous();
                    }
                } else if (comprarison > 0) {
                    if (currentItem.next() == null) {
                        currentItem.setNext(itemToAdd);
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
            ListItem parentItem = null;
            ListItem currentItem = this.root;

            while (currentItem != null) {
                int comparison = itemToRemove.compareTo(currentItem);

                if (comparison == 0) {
                    performRemoval(currentItem, parentItem);
                    return true;
                } else if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                } else {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                }
            }
        }

        return false;
    }

    private void performRemoval(ListItem itemToRemove, ListItem parentItem) {
        ListItem currentItem = null;
        if (itemToRemove.previous() != null) {
            currentItem = itemToRemove.previous();

            ListItem nextItem = currentItem;

            while (nextItem.next() != null) {
                nextItem = nextItem.next();
            }

            nextItem.setNext(itemToRemove.next());
        } else if (itemToRemove.next() != null) {
            currentItem = itemToRemove.next();

            ListItem previousItem = currentItem;

            while (previousItem.previous() != null) {
                previousItem = previousItem.previous();
            }

            previousItem.setPrevious(itemToRemove.previous());
        }

        if (parentItem == null) {
            this.root = currentItem;
        } else if (parentItem.previous() == itemToRemove) {
            parentItem.setPrevious(currentItem);
        } else {
            parentItem.setPrevious(currentItem);
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            if (root.previous() != null) {
                traverse(root.previous());
            }
            System.out.println(root.getValue());
            if (root.next() != null) {
                traverse(root.next());
            }
        } else {
            System.out.println("The list is empty");
        }
    }
}
