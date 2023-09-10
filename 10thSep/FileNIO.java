// Java program to illustrate reading data from file
// using nio.File
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
public class FileNIO {
	public static List<String> readFileInList(String fileName)
	{

		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(
				Paths.get(fileName),
				StandardCharsets.UTF_8);
		}

		catch (IOException e) {
			// do something
			e.printStackTrace();
		}
		return lines;
	}

    public static String readFileAsString(String fileName) throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

	public static void main(String[] args) throws Exception
	{
		List l = readFileInList("input");

		Iterator<String> itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

        String data = readFileAsString("input");
        System.out.println(data);
	}
}
