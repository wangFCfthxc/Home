package tw.org.iii.Home.se8;

import static java.lang.System.out;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Messages3 {

	public static void main(String[] args) {
		Map<String, String> messages = new TreeMap<>((s1, s2) -> -s1.compareTo(s2));
        messages.put("Justin", "Hello！Justin的訊息！");
        messages.put("Monica", "給Monica的悄悄話！");
        messages.put("Irene", "Irene的可愛貓喵喵叫！");
        
        System.out.println(messages);

	}

}
