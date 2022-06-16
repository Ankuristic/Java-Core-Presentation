package Linkedlist;

public class LinkedList {
	
	public static void printR(Node<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.println(head.data+" ");
		printR(head.next);
	}

	public static void main(String[] args) {
//		Node<Integer> head = null;
		// TODO Auto-generated method stub
		Node<Integer> head= takeInput();
		printR(head);

	}

	

}
