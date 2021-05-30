//Manuel Diaz
//CSC130
//Assignment 1




/**
 * A stack is Last in First out
 * Ex: Like a stack of plates
 */

public class Stack {
    /**
     * Generetic Node class that holds a double as data
     * Last in First out
     */
    private class Node{
        double data;
        Node next;
    }
    //declaring a node object.
    private Node head;
    /**
     * Ex:
     * LinkedList = 7->6->5
     */
    public Stack(){
        head = null;
    }
    /**
     * Push 9:
     * LinkedList = 9->7->6->5
     */
    public void push(double data){
        Node temp = new Node();
        temp.data = data;
        temp.next = head;
        head = temp;
    }
    /**
     * Pop():
     * LinkedList = 7->6->5
     * @return the last double pushed is returned and removed from the linked list
     */
    public double pop(){
        double temp = this.head.data;
        head = head.next;
        return temp;
    }


}
