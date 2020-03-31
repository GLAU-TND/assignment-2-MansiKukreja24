/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;



import problem4.binary.MyBinarySearchTree;

import problem4.myqueue.MyQueue;



// executable class

// use problem1.mybst.MyBinarySearchTree class for creating binary tree

public class MyMain {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(myQueue);

        myBinarySearchTree.insert(50);

        myBinarySearchTree.insert(55);

        myBinarySearchTree.insert(60);

        myBinarySearchTree.insert(30);

        myBinarySearchTree.insert(15);

        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());

        System.out.println("PreOrder successors of all the nodes");

        myQueue.show();



    }
}
