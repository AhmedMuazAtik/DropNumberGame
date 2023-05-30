package com.mycompany.dropnumbergame;

public class AhmedMuazAtikSingleLinkedListClass<T> {

    AhmedMuazAtikNodeClass<T> head;

    //Adding node to the single linked list.
    void addFirst(AhmedMuazAtikNodeClass newNode) {
        if (head == null) {
            head = newNode; //If theres no head, assigning node as head.
        } else {
            newNode.next = head; //Adding the node as head.
            head = newNode; //Old head being next.
        }
    }

    //Printing all the elements.
    void print() {

        AhmedMuazAtikNodeClass<T> cur = head;

        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next; //Going right.
        }
    }
}
