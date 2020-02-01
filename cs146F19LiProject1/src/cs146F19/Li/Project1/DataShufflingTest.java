package cs146F19.Li.Project1;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class DataShufflingTest {

	@Test
	public void ShufflingTest() throws IOException {
		File input=new File("Target2.txt");
		File output=new File("LiZhuotangShuffled.txt");
		try {
			BufferedReader in=new BufferedReader(new FileReader(input));
			BufferedReader out=new BufferedReader(new FileReader(output));
			String expectedLine;
			while((expectedLine=in.readLine())!=null)
			{
				String actuallyLine=out.readLine();
				assertEquals(expectedLine, actuallyLine);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File is not here!");
			e.printStackTrace();
		}
	}
}
