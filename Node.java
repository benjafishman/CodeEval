public class Node {
		int val;
		Node leftChild;
		Node rightChild;
		Node parent;
		
		public Node(){
			val = 0;
			leftChild = null;
			rightChild = null;
			parent = null;
		}
		public Node(int num, Node left, Node right){
			val = num;
			leftChild = left;
			leftChild.parent = this;
			rightChild = right;
			rightChild.parent = this;
		}

		public Node(int num){
			val = num;
			leftChild = null;
			rightChild = null;
		}

		public void setLeftChild(Node left){
			this.leftChild = left;
		}

		public void setRightChild(Node right){
			this.rightChild = right;
		}

		public int getVal(){
			return this.val;
		}
		public Node getLeftChild(){
			return this.leftChild;
		}
		public Node getRightChild(){
			return this.rightChild;
		}

		public Node getParent(){
			return parent;
		}
	}
