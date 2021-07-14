package linkedList;

public class LinkedList<T> {

    private Node<T> firstNode;


    // Return true if the list is empty
    protected boolean isEmpty(){
        if (this.firstNode == null){
            return true;
        }
        return false;
    }

    // Get the last node from the list
    protected Node<T> getLastNode(){
        if (!isEmpty()) {
            Node<T> tempNode = this.firstNode;
            while (tempNode.getNextNode() != null) {
                tempNode = tempNode.getNextNode();
            }
            return tempNode;
        }
        return null;
    }

    // Add a node to the end of the list
    protected T addToEnd(T newLastNodeValue){
        if (!isEmpty()) {
            Node<T> tempNode = getLastNode();
            tempNode.setNextNode(new Node<T>(newLastNodeValue));
            return tempNode.getNextNode().getValue();
        }
        this.firstNode = (new Node(newLastNodeValue));
        return this.firstNode.getValue();
    }

    // Get the size of the list
    protected int getSize(){
        Node<T> tempNode = this.firstNode;
        int size = 0;

        while (tempNode != null) {
            tempNode = tempNode.getNextNode();
            size++;
        }
        return size;
    }

    // Delete last node from the list and return it
    protected T removeLastNode(){
        if (!isEmpty()){
            Node<T> tempNode = firstNode;
            T returnValue = this.firstNode.getValue();

            if (this.firstNode.getNextNode() == null){
                this.firstNode = null;
            } else {
                while (tempNode.getNextNode().getNextNode() != null) {
                    tempNode = tempNode.getNextNode();
                }
                returnValue = tempNode.getNextNode().getValue();
                tempNode.setNextNode(null);
            }
            return returnValue;
        }
        return null;
    }

    // clear the linked list
    protected void clearList(){
        this.firstNode = null;
    }

    // returns where the value can be found
    // -1 if the value is not in the list
    protected int whereIs(T value){
        int result = -1, i = 0;
        Node<T> tempNode = this.firstNode;
        while(tempNode != null && result < 0){
            if (tempNode.getValue().equals(value)){
                result = i;
            }
            tempNode = tempNode.getNextNode();
            i++;
        }
        return result;
    }

    // returns true if the value can be found in the list
    protected boolean contains(T value){
        if (whereIs(value) >= 0) return true;
        return false;
    }



    // look at this; FLO

    /*
    public boolean delete(int value) {
        Node tempnode;
        Node previousNode;
        boolean deleted = false;
        if (firstNode.getValue() == value && firstNode != null) {
            firstNode = firstNode.getNextNode();
            deleted = true;
        } else {
            previousNode = firstNode;
            tempnode = firstNode.getNextNode();
            while (tempnode != null) {
                if (tempnode.getNextNode() == null && tempnode.getValue() == value) {
                    tempnode = null;
                    previousNode.setNextNode(null);
                    return true;
                }else {
                    if (tempnode.getValue() == value) {
                        previousNode.setNextNode(tempnode.getNextNode());
                        tempnode = null;
                        return true;
                    } else {
                        previousNode = tempnode;
                        tempnode = tempnode.getNextNode();
                    }
                }
            }
        }
        return deleted;
    }
    */

}
