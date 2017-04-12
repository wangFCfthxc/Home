package tw.org.iii.Home.se8;

import java.util.HashSet;
import java.util.Set;

public class Students {

	public static void main(String[] args) {
        Set students = new HashSet();		
        students.add(new Student("Justin", "B835031"));
        students.add(new Student("Monica", "B835032"));
        students.add(new Student("Justin", "B835031"));
        System.out.println(students);
	}

}

class Student {
    private String name;
    private String number;
    Student(String name, String number) {
        this.name = name;
        this.number = number;
    }
    
	@Override
	public String toString() {
		return String.format("(%s, %s)%n", name, number);
	}  
    
}
