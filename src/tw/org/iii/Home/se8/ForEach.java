package tw.org.iii.Home.se8;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import static java.lang.System.out;

public class ForEach {

	public static void main(String[] args) {
//		List names = Arrays.asList("One", "Two", "Three");
//		forEach(names);
//		forEach(new HashSet(names));
//		forEach(new ArrayDeque(names));
		
//		List<String> names = Arrays.asList("One", "Two", "Three");
//		names.forEach(name -> out.println(name));
//		new HashSet(names).forEach(name -> out.println(name));
//		new ArrayDeque(names).forEach(name -> out.println(name));
		
		List<String> names = Arrays.asList("One", "Two", "Three");
		names.forEach(out::println);
		new HashSet(names).forEach(out::println);
		new ArrayDeque(names).forEach(out::println);
		
	}

//	private static void forEach(Iterable iterable) {
//		for(Object o : iterable){
//			System.out.println(o);
//		}
//		
//	}

}
