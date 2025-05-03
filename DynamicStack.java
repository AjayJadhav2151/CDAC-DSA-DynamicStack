package DynamicStack;

public class DynamicStack {
	private Node top;
	
	public Node create_Node(int value) {
		Node newnode = new Node();
		
		newnode.setData(value);
		newnode.setNext(null);
	return newnode;
	}
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void push(int value) {
		
		Node newnode = create_Node(value);
		 if(!isEmpty()) {
			 newnode.setNext(top);
			 top = newnode;
		 } else {
			 top = newnode;
		 }
	}
	
	public int pop() {
		int value=-1;
		Node temp=top;
		if(!isEmpty()) {
//			temp=top;
//			value = temp.getData();
//			top = top.getNext();
//			temp = null;
			
			value = top.getData();
			top = top.getNext();
			temp.setNext(null);
		} else {
			System.out.println("Stack in Empty......");
		}
		return value;
	}
	
	public void display() {
		Node temp =top;
		if(!isEmpty()) {			
		while(temp!=null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		} else {
				System.out.println("Stack is Underflow");
		}
	}
}
