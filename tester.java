package cs146F19.Li.Project1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.util.Scanner;

public class tester {
	public static void main(String args[]) throws FileNotFoundException
	{
		/**System.out.print("enter the path of the input file: ");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();**/
		String[] s=DataShuffling.shuf();
		for(String element: s)
			System.out.println(element);
		//in.close();
		long fileCreateTime1=System.currentTimeMillis();
		PrintWriter pw=new PrintWriter("LiZhuotangShuffled.txt");
		for(String element: s)
		{
			pw.print(element);
			pw.println();
		}
		pw.close();
		long fileCreateTime2=System.currentTimeMillis();
		System.out.println("Time to create the file: "+(fileCreateTime2-fileCreateTime1));
	}

}
