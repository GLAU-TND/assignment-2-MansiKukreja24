/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem3.student.MyStudent;

public class Node {

    private MyStudent data;

    private Node next;



    public Node(MyStudent data){

        this.data=data;

        this.next=null;

    }



    public MyStudent getData() {

        return data;

    }



    public void setData(MyStudent data) {

        this.data = data;

    }



    public Node getNext() {

        return next;

    }



    public void setNext(Node next) {

        this.next = next;

    }

}
