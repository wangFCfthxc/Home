package tw.org.iii.Home.se8;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class FileUtil2 {

	public static String readFile(String name) throws FileNotFoundException {
		StringBuilder text = new StringBuilder();
		try(Scanner console = new Scanner(new FileInputStream(name))){
			while(console.hasNext()){
				text.append(console.nextLine()).append('\n');
			}
		}
		return text.toString();
	}

}
