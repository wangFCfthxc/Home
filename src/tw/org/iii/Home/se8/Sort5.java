package tw.org.iii.Home.se8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Sort5 {

	public static void main(String[] args) {
		List words = Arrays.asList("A", "E" , "X", "M", "O" );
		Collections.sort(words, new StringComparator());
		System.out.println(words);
	}

}

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}