import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		String file = args[0];
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

		//StringBuffer stringBuffer = new StringBuffer();
		String line = null;
		Node root = new Node(30, new Node(8,new Node(3), new Node(20, new Node(10),new Node(29))),new Node(52));


		while((line =bufferedReader.readLine())!=null){
			//stringBuffer.append(line).append("\n");
			String[] values = line.split(" ");
			int num1 = Integer.parseInt(values[0]);
			int num2 = Integer.parseInt(values[1]);
			//System.out.println(num1 +" "+num2);
			Node one = findNode(root,num1);
			Node two = findNode(root,num2);

			Node a = getAncestor(root,one, two);
			if(a == null){
				System.out.println("Node not found");
			}else {
				System.out.println(a.getVal());
			}

		}
		//System.out.println(stringBuffer);
 


		/*
		Node root = new Node(30, new Node(8,new Node(3), new Node(20, new Node(10),new Node(29))),new Node(52));

		Node a = getAncestor(root,3, 29);
		if(a == null){
			System.out.println("Node not found");
		}else {
			
			System.out.println("Ancestor is: "+ a.getVal());
		}
		*/
		
	}

	public static void printTree(Node r){
		if(r == null){
			return;
		}
		System.out.println(r.getVal());
		printTree(r.getLeftChild());
		printTree(r.getRightChild());
	}

	public static Node findNode(Node r, int x){
		if(r == null){
			return r;
		}
		Queue queue = new Queue(7);
		queue.enqueue(r);
		while(!queue.isEmpty()){
			Node current = queue.dequeue();
			//System.out.println("Current val: "+current.getVal());
			if (current.getVal() == x){
				return current;
			}
			if(current.getLeftChild()!=null){
				queue.enqueue(current.getLeftChild());
			}
			if(current.getRightChild()!=null){
				queue.enqueue(current.getRightChild());
			}
		}
		return null;
	}

	public static Node getAncestor(Node r, Node one, Node two){
		if(r==null){
			return null;
		}
		if(r == one || r ==two){
			return r;
		}
		Node left = getAncestor(r.getLeftChild(),one,two);
		Node right = getAncestor(r.getRightChild(),one,two);

		if(left!=null && right!=null)
			return r;
		else if(left!=null){
			return left;
		}else {
			return right;
		}
	}
	
}


