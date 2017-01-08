package tw.org.iii.Home.se8;

public class IntegerArray {

	public static void main(String[] args) {
		Integer[] scores = new Integer[3];
		for(Integer score : scores) {
            System.out.println(score);
        }
		
//		scores[0] = new Integer(99);
//        scores[1] = new Integer(87);
//        scores[2] = new Integer(66);
		scores[0] = 99;
		scores[1] = 87;
		scores[2] = 66;
        for(Integer score : scores) {
            System.out.println(score);
        }
        
        Integer[] scores2 = {99, 87, 66};
        for(Integer score : scores2){
        	System.out.println(score);
        }

	}

}
