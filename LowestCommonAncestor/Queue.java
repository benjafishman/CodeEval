public class Queue{
		Node[] q;
		int nextIn = 0;
		int nextOut = 0;
		boolean full = false;
		int elements = 0;


		public Queue(int x){
			q = new Node[x];

		}
		public void enqueue(Node x){
			if(!full){
				q[nextIn] = x;
				nextIn = (nextIn+1)%7;
				elements++;
			}
			if (elements == 6){
				full = true;
			}
		}
		public Node dequeue(){
			int temp = nextOut;
			nextOut = (nextOut+1)%7;
			elements--;
			full = false;
			return(q[temp]);
			
		}

		public boolean isEmpty(){
			if(elements == 0){
				return true;
			}
			return false;
		}
	}