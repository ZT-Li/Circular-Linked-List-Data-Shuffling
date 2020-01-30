package cs146F19.Li.Project1;

import java.util.Scanner;

public class CLLtester {
	
	public static void main(String args[]) {
		System.out.print("what's the number of prisoner: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print("what's the counter for freedom: ");
		int k=in.nextInt();
		CircularLinkedList cll=new CircularLinkedList(n);
		int result=cll.CLLgames(k);
		System.out.print("Freedom # is: "+result);
		in.close();
	}
}
