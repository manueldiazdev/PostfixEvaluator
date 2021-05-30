//Manuel Diaz
//CSC130
//Assignment 1
/**
 * Generic Queue class that takes in a string as data.
 * First in First out
 * Ex: Like a line of people
 */
public class Queue {
    /**
     * Generic Node class that holds a string as data
     */
    private class Node{
        String data;
        Node next;
    }
    //Pointer nodes
    Node head;
    Node tail;
    /**
     * places an element at the end of the linked list
     * @param opp the value of what's going to be stored in the node
     */
    public void enqueue(String opp){
        Node temp = new Node();
        temp.data = opp;
        if(tail == null){
            tail = head;
            head = temp;
        }else{
            tail.next = temp;
        }
        tail = temp;

    }
    /**
     * Removes the first element of the linked list
     * @return the value of the first node of the linked list
     */
    public String dequeue(){
        String opp = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }

        return opp;
    }
    /**
     * Peak the node at the very front
     * @return the value of the node at the front of the linked list
     */
    public boolean peak(){
        return head != null;
    }

}
