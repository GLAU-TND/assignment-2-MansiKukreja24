/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;

// executable class



import problem1.mybst.MyBinarySearchTree;



public class MyMain {

    public static void main(String[] args) {

        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
      
        binarySearchTree.insert(55);

        binarySearchTree.insert(30);

        binarySearchTree.insert(80);

        binarySearchTree.insert(25);

        binarySearchTree.insert(15);

        binarySearchTree.insert(20);

        binarySearchTree.insert(10);

        binarySearchTree.insert(85);

        binarySearchTree.insert(16);

        binarySearchTree.insert(17);

        binarySearchTree.insert(14);







        System.out.print("Elements of the binary search tree: ");

        binarySearchTree.traverse();

        System.out.print("\nLeft children of the binary search tree: ");

        binarySearchTree.traverseLeft();

        System.out.print("\nNo.of Parents not having their left child are: ");

        System.out.println(binarySearchTree.countLeft(binarySearchTree.getRoot()));



    }

}

