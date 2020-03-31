/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

import problem3.student.Student;


// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
  
  public static void main(String[] args) {

        MyPriorityQueue queue = new MyPriorityQueue();

        queue.enqueue(new Student("Mansi",18));

        queue.enqueue(new Student("Diksha",13));

        queue.enqueue(new Student("Sanskriti",27));

        queue.enqueue(new Student("Muskan",58));

        queue.enqueue(new Student("Stuti",10));

        queue.enqueue(new Student("Aparna",50));



        queue.show();

        queue.dequeue();

        queue.show();



    }

}

