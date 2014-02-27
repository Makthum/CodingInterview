package com.mak.BST;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class BST {
	public static int ht=0;
	public static Queue<Node> q= new LinkedBlockingQueue<Node>();
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node test=insert(10, null);
		test=BST.insert(6, test);
		test=BST.insert(5, test);
		test=BST.insert(8, test);
		test=BST.insert(12, test);
		test=BST.insert(11, test);
		test=BST.insert(13, test);
		printBST(test);
		System.out.println("\n");
	//	preorder(test);
	//	inorder(test);
	//	postorder(test);
		System.out.println(isBalanced(test));
		levelOrderTraversal(test);
	}

	public static Node insert(int data, Node root)
	{
		if(root==null)
			root=new Node(data, null, null);
		else if(root.data>data) 
		   root.left=insert(data,root.left);
		else
			root.right=insert(data,root.right);
		
		return root;
	}
	
	
	public static void printBST(Node root)
	{
		if(root!=null)
		{
			printBST(root.left);
			System.out.println(root.data);
			printBST(root.right);
			
		}
	}
	
	public static void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	public static void postorder(Node root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);

		}
	}
	
	public static Node preOrderSuccessor(Node root)
	{
		if(root.left!=null)
			 return root.left;
		else if(root.left==null)
			return root;
		else 
			return root.right;
		
	}
	
	public static int findMaxHeight(Node root)
	{
		if(root==null)
		return -1;
		else
			return Math.max(findMaxHeight(root.left), findMaxHeight(root.right))+1;
	}
	
	public static int findMinHeight(Node root)
	{
		if(root==null)
			return -1;
			else
				return Math.min(findMinHeight(root.left), findMinHeight(root.right))+1;
	}
	
	public static boolean isBalanced(Node root)
	{
		if(findMaxHeight(root)-findMinHeight(root)>1)
			return false;
		else
			return true;
	}
	public static boolean isLeafNode(Node root)
	{
		if(root!=null)
		{
			if(root.left==null&&root.right==null)
				return true;
		}
		return false;
		
		}
	
	
	public static void levelOrderTraversal(Node root)
	{
		int curlevel=0,nxtlevel=0;
		int position=noOfNodes(root)/2;
		if(root!=null)
		{
			q.add(root);
			curlevel++;
			while(!q.isEmpty())
			{
				Node temp=q.remove();
				curlevel--;
				System.out.print("\t"+temp.data);
				if(temp.left!=null)
				{
					nxtlevel++;
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					nxtlevel++;
					q.add(temp.right);
				}
				if(curlevel==0)
				{
					System.out.println("\n");
					curlevel=nxtlevel;
					nxtlevel=0;
							
				}
				
			}
		}
	}
	
	public static int noOfNodes(Node root)
	{
		if(root==null)
			return 0;
		return noOfNodes(root.left)+noOfNodes(root.right)+1;
		
	}
	
	public static void printSpace(int i)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print("\t");
		}
	}
}
