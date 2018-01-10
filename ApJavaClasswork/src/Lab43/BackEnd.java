package Lab43;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BackEnd {
	public static void writeCSV()
	{
		PrintWriter pw = null;
        try 
        {
        	pw = new PrintWriter(new File("results.csv"));
        }
        catch(FileNotFoundException e)
        {
        	System.err.println(e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Name, High Score\n");
        sb.append("Tim,counts\n");
	}
}
