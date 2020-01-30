package cs146F19.Li.Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataShuffling {

	public static String[] shuf() throws FileNotFoundException {
		File f = new File("ErdosCA.txt");
		Scanner in = new Scanner(f);
		Random r = new Random();
		r.setSeed(20);
		ArrayList<String> temp = new ArrayList<String>();

		// add all the lines into an ArrayList
		in.nextLine();
		long readTime1 = System.currentTimeMillis();
		while (in.hasNextLine()) {
			temp.add(in.nextLine());
		}
		long readTime2 = System.currentTimeMillis();

		// shuffle the elements
		long shuffleTime1 = System.currentTimeMillis();
		for (int i = temp.size() - 1; i > 0; i--) {
			DataShuffling.swap(temp, i, r.nextInt(i));
		}
		long shuffleTime2 = System.currentTimeMillis();
		String[] result = new String[temp.size()];

		// put all the shuffled elements into an array
		for (int i = 0; i < result.length; i++) {
			result[i] = temp.get(i);
		}
		in.close();
		System.out.println("Time to read the file: "+(readTime2-readTime1));
		System.out.println("Time to shuffle: "+(shuffleTime2-shuffleTime1));
		return result;
	}

	// swap the elements in a ArrayList
	public static void swap(ArrayList<String> s, int index1, int index2) {
		String temp = s.get(index1);
		String temp2 = s.get(index2);
		s.set(index1, temp2);
		s.set(index2, temp);
	}
	
	

}
