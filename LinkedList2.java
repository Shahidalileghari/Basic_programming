package DSA.com;



class Node{
	int data=0;
	Node nextNode;
	public Node(int data) {
		this.data = data;
	}
}
public class LinkedList2 {
	static int counter = 0; 
	 static int Sum() {
		 int sum = 0;
		 Node startNode = new Node(1);
		 Node pNode = startNode;
		 
		 for(int i = 2; i <=20;i++) {
			 pNode.nextNode = new Node(i);
			 pNode = pNode.nextNode;
		 }
		 for(Node node= startNode ; node!=null;node=node.nextNode) {
			 sum+=node.data;
			 counter++;
		 }
		 return sum;
	 }
	 
	 static int Average() {
		 int av = Sum()/counter;
		 return av;
	 }
	 
	 

	public static void main(String[] args) {
		System.out.println("Sum      :"+Sum());
		System.out.println("Average  : "+Average());
		
	//	System.out.println(even());
	}

}
