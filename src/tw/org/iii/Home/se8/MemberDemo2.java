package tw.org.iii.Home.se8;

import java.io.IOException;
import static java.lang.System.out;

public class MemberDemo2 {

	public static void main(String[] args) throws Exception {
		Member2[] members = {
                new Member2("B2234", "Justin", 60), 
                new Member2("B2678", "Monica", 55), 
                new Member2("B2876", "Irene", 50)
    };
    for(Member2 member : members) {
        member.save();
    }
    out.println(Member2.load("B2234"));
    out.println(Member2.load("B2678"));
    out.println(Member2.load("B2876"));
}
}
