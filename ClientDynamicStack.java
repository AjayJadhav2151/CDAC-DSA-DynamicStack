package DynamicStack;

import java.util.Scanner;

public class ClientDynamicStack {
	public static void main(String[] args) {
		DynamicStack s = new DynamicStack();
		Scanner sc = new Scanner(System.in);
		
		int value = 0,option = 0;
		
		do {
			System.out.println("********MENU*****************");
			System.out.println("\n 1.push"+
								"\n 2.pop"+
								"\n 3.display"+
								"\n 0.exit");
			System.out.println("Enter your Choice: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1 :{
				System.out.println("Enter values: ");
				value = sc.nextInt();
				
				s.push(value);
				break;
			}
			case 2:{
				value = s.pop();
				if(value != -1) {
					System.out.println("popped::"+value);
				}
				break;
			}
			case 3:{
				s.display();
				break;
			}
			case 0:{
				System.exit(0);
			}
		}
		} while(option != 0);
	}
}
