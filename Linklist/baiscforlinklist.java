package Linklist;

class LL {
    node head;

    class node {
        String data;
        node next;

        node(String c) {
            this.data = c;
            this.next = null;
        }
    }

    // Add First
    public void addfirst(String data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    // Add Last
    public void addlast(String data) {
        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    // Print List
    public void printlist() {
        node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    public void deletefirst() {
        head = head.next;

    }

    public void deletelast() {

        node secondlast = head;
        node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
}

public class baiscforlinklist {
    public static void main(String[] args) {

        LL list = new LL();
        list.addfirst("hello");
        list.addfirst("world");

        list.printlist();
        list.addlast("hmmm");
        list.printlist();
        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();
    }
}
