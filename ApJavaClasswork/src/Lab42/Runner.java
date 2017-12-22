package Lab42;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; 

public class Runner {
	public static void main (String[] arg)
	{
		File idk = new File("Zilong Yuen.csv");
		CSVUtilities something = new CSVUtilities(idk);
		List<Integer> column = something.getDataInt(1);
		System.out.print(column);
	}
}