package com.raj;

/**
 * Created by rajkumarpurushothaman on 5/6/17.
 */
public class SearchTree implements NodeList {

    private Item root;

    public SearchTree(Item root) {
        this.root = root;
    }

    @Override
    public Item getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(Item item) {
        //add one item to an existing search tree
        if(this.root==null) {
            this.root = item;
            return true;
        }

        Item current = this.root;

        while(current!=null) {
            int compareResult = current.compareTo(item);
            if(compareResult>0) {
                //item is smaller, move left
                if(current.previous()!=null) {
                    //check and compare the previous element
                    current = current.previous();
                }
                else {
                    // if the previous element is null
                    current.setPrevious(item);
                    return true;
                }
            }
            else if(compareResult<0) {
                //item is bigger, move right
                if(current.next()!=null) {
                    // check and compare the next element
                    current = current.next();
                }
                else {
                    //if the next element is not null
                    current.setNext(item);
                    return true;
                }
            }
            else {
                //item is already present, ignore
                System.out.println("Element not added : " + item.getData());
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(Item item) {
        if(this.root==null)
            return false;

        Item current = this.root;
        Item parent = this.root;

        while(current!=null) {
            int compareResult = current.compareTo(item);
            if(compareResult>0) {
                // item is smaller, move left
                parent = current;
                current = current.previous();
            }
            else if(compareResult<0) {
                // item is larger, move right
                parent = current;
                current = current.next();
            }
            else {
                //item is equal to current -> remove!
                performRemoval(current,parent);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(Item current, Item parent) {

        if(current.previous()==null && current.next()==null) {
            //no child for current
            //      parent
            //      current
            //        (0)
            if(parent.previous().compareTo(current)==0) {
                parent.setPrevious(null);
            }
            else if(parent.next().compareTo(current)==0) {
                parent.setNext(null);
            }
        }
        else if(current.next()==null) {
            //only left tree
            //     parent
            //     current
            //previous         (0)
            //
            //

            if(parent.previous().compareTo(current)==0) {
                parent.setPrevious(current.previous());
            }
            else if(parent.next().compareTo(current)==0) {
                parent.setNext(current.previous());
            }
        }
        else if(current.previous()==null){
            //only right child
            if(parent.previous().compareTo(current)==0) {
                parent.setPrevious(current.next());
            }
            else if(parent.next().compareTo(current)==0) {
                parent.setNext(current.next());
            }
        }
        else {
            // both left and right child present

            Item smallFromRight = findMin(current.next());

            current.setData(smallFromRight.getData());

            performRemoval(smallFromRight,current.next());

        }
    }

    private Item findMin(Item item) {

        Item min = item;

        while(item!=null) {
            min = item;
            item = item.previous();
        }

        return min;
    }

    @Override
    public void traverse(Item root) {
        if(root!=null) {
            traverse(root.previous());
            System.out.println(root.getData());
            traverse(root.next());
        }
    }
}
