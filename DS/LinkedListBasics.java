

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    private Node head;
    
    
    public void insertEnd(int data) { 
     Node newNode = new Node(data); 
     if (head == null) {
         head = newNode; 
         return; 
     } 
     Node current = head; 
     while (current.next != null){ 
         current = current.next; 
     }
     current.next = newNode; 
    }
    
    public void insertStart(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }
        Node curr=head;
        head=newNode;
        newNode.next=curr;
    }
    
    public void insertBeforeMiddle(int data,int target){
        Node newNode=new Node(data);
        if(head==null) {
            return;
        }
        if (head.data == target) { 
             newNode.next = head; 
             head = newNode; 
             return; 
         }
        Node curr = head; 
        while (curr.next != null && curr.next.data != target){ 
            curr = curr.next; 
            
        } 
        newNode.next = curr.next;
        curr.next = newNode;
    }
    
    public void deleteStart() {
    if (head == null) {
        return;
    }
    head = head.next;  // move head forward
}

public void deleteEnd() {
    if (head == null) {
        return;
    }
    if (head.next == null) {
        head = null;  // only one element
        return;
    }

    Node current = head;
    while (current.next.next != null) {  // stop at second last
        current = current.next;
    }
    current.next = null;  // remove last
}

public void delete(int target) {
    if (head == null) {
        return;
    }

    if (head.data == target) {
        head = head.next;  // target at head
        return;
    }

    Node current = head;
    while (current.next != null && current.next.data != target) {
        current = current.next;
    }
    current.next = current.next.next;  // skip target node
}


public void search(int target) {
    Node current = head;
    while (current != null) {
        if (current.data == target) {
            System.out.print("true\n"); 
            return;// found
        }
        current = current.next;
    }
     System.out.print("false\n");  // not found
}


    
    public void display() {
    Node current = head;   
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}

}
    public class Main {
     public static void main (String[] args) {
        LinkedList st=new LinkedList();
        
        st.insertStart(20);
        st.insertStart(30);
        st.insertEnd(50);
        st.insertEnd(40);
        st.insertEnd(60);
        st.insertBeforeMiddle(90,50);
        st.deleteStart();
        st.deleteEnd();
        st.delete(20);
        st.search(90);
        st.display();
        
    }
}
