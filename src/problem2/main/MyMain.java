/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  public static void main(String[] args) {

        MyQueue preQueue = new MyQueue();

        MyQueue postQueue= new MyQueue();

        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(preQueue,postQueue);

        myBinarySearchTree.insert(80);

        myBinarySearchTree.insert(50);

        myBinarySearchTree.insert(15);

        myBinarySearchTree.insert(10)

        myBinarySearchTree.insert(65);

        myBinarySearchTree.postOrder(myBinarySearchTree.getRoot());

        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());

        System.out.println("PreOrder:");

        preQueue.show();

        System.out.println("PostOrder:");

        postQueue.show();

        System.out.println();

    }

}
    


