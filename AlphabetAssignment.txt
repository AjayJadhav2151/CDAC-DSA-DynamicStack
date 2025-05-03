package DynamicStack;

public class AlphabetAssignment2 {
    public class Node {
        private char data;
        private Node next;
        
        public Node(char value) {
            data = value;
            next = null;
        }

        public char getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node value) {
            this.next = value;
        }    
    }
    
    private Node top;
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void push(char value) {
        Node newnode = new Node(value);
        if(!isEmpty()) {
            newnode.setNext(top);
        }
        top = newnode;
    }
    
    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty......");
            return 0;
        }
        char value = top.getData();
        top = top.getNext();
        return value;
    }
    
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }    
    
    public static void main(String[] args) {
        AlphabetAssignment2 al = new AlphabetAssignment2();
        String name = "BomBay";
        
//        for(char c : name.toCharArray()) {
//            al.push(c);
//        }
        for(char i=0;i<name.length();i++) {
        	al.push(name.charAt(i));
        }
        al.display();
    }
}