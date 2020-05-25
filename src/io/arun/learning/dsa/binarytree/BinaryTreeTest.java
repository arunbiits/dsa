package io.arun.learning.dsa.binarytree;

import java.util.Scanner;

public class BinaryTreeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BinaryTree bt = new BinaryTree();
		System.out.println("Binary Tree Test");
		char ch;
		do {
			System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            
            int choice = sc.nextInt();
            switch(choice) {
            	case 1:
            			System.out.println("Enter the integer element to insert");
            			bt.insert(sc.nextInt());
            			break;
            	case 2:
            			System.out.println("Enter the integer element to search");
            			System.out.println("Search Result: "+bt.search(sc.nextInt()));
            			break;
            	case 3:
            			System.out.println("No of Nodes: "+bt.countNodes());
            			break;
            	case 4:
            			System.out.println("Empty Status: "+bt.isEmpty());
            			break;
            	default:
            			System.out.println("Wrong Entry \n");
            			break;
            }
            
            if(!bt.isEmpty()) {
            	System.out.print("\nPreOrder\n");
                bt.preorder();
                System.out.print("\nInOrder\n");
                bt.inorder();
                System.out.print("\nPostOrder\n");
                bt.postorder();
            }
            
            System.out.println("Do you wish to continue?(Press y|Y if yes, otherwise n|N)");
            ch = sc.next().charAt(0);
            
		}while(ch == 'Y' || ch == 'y');
		
		sc.close();
	}

}
