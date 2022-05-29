package com.company;

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
    public boolean addItem(ListItem newItem) {
        if(this.root == null){      //tree is empty, newItem becomes head of tree
            this.root = newItem;
            return true;
        }

        //otherwise, start comparing from the head of the tree
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){     //newItem is greater, move right if you can
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }
                else{               //no node to the right, add here
                    currentItem.setNext(newItem);
                    return true;
                }
            }
            else if(comparison > 0){    //newItem is less, move left if you can
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                }
                else{                   //no node to the left, add here
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }
            else{                       //equal, don't add
                System.out.println(newItem.getValue() + " is already present.");
                return false;
            }
        }
        //has to have return, while is always true so won't reach this
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
            else if(comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else{ //item found, remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent){
        if(item.next() == null){                        //no right tree, make parent point to left tree
            if(parent.next() == item){
                parent.setNext(item.previous());        //item is right child of its parent
            }
            else if(parent.previous() == item){
                parent.setPrevious(item.previous());    //item is left child of its parent
            }
            else{
                this.root = item.previous();            //item must be the parent, which is root of tree
            }
        }
        else if(item.previous() == null){               //no left tree, make parent point to right tree
            if(parent.next() == item){
                parent.setNext(item.next());            //item is right child of its parent
            }
            else if(parent.previous() == item){
                parent.setPrevious(item.next());        //item is left child of its parent
            }
            else{
                this.root = item.next();                //again deleting the root
            }
        }
        else{                                           //left nor right are null
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while(current.previous() != null){          //find smallest value (leftmost)
                leftmostParent = current;
                current = current.previous();
            }

            item.setValue(current.getValue());          //set smallest value to node

            if(leftmostParent == item){
                item.setNext(current.next());           //no leftmost node, current is smallest node
            }
            else{                                       //set the smallest node parent to its right child
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
