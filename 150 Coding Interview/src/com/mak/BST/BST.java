package com.mak.BST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.print.attribute.Size2DSyntax;
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
		Node test1=insert(10, null);
		test1=BST.insert(6, test1);
		test1=BST.insert(5, test1);
		test1=BST.insert(8, test1);
		test1=BST.insert(112, test1);
		test1=BST.insert(11, test1);
		test1=BST.insert(13, test1);
		printBST(test);
		System.out.println("\n");
	//	preorder(test);
	//	inorder(test);
	//	postorder(test);
		System.out.println(isBalanced(test));
		levelOrderTraversal(test1);
		System.out.println(sizeOfTree(test));
		System.out.println(isIdentical(test,test1));
		mirrorTree(test1);
		levelOrderTraversal(test1);
		printPath(test1, new ArrayList<Integer>());
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
	
	public static int sizeOfTree(Node root)
	{
		if(root!=null)
		{
			return sizeOfTree(root.left)+1+sizeOfTree(root.right);
			
		}
		else
			return 0;
	}
	public static boolean isIdentical(Node root1,Node root2)
	{
		if(root1!=null&& root2!=null)
		{
			if(root1.data==root2.data)
			{
				return isIdentical(root1.left, root2.left)&&isIdentical(root1.right, root2.right);
			}
			else
			{
				return false;
			}
		}
		else if(root1==null&&root2==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void mirrorTree(Node root)
	{
		if(root!=null)
		{
			Node temp=root.left;
			root.left=root.right;
			root.right=temp;
			mirrorTree(root.left);
			mirrorTree(root.right);
		}
	}
	
	public static void printPath(Node root,List<Integer> a)
	{
		if(root!=null)
		{
			a.add(root.data);
			printPath(root.left, a);
			printPath(root.right, a);
			System.out.println(a);
			a.remove((Integer)root.data);
			
			
		}
	}
}
