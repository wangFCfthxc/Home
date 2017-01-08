package tw.org.iii.Home.se8;



public class Average {

	public static void main(String[] args) {
		long sum = 0;
        for(String arg : args) {
            sum += Long.parseLong(arg);
        }
        System.out.println("平均：" + (float) sum / args.length);
        
        String name1 = "Panda";
        String name2 = "Panda";
        String name3 = new String("Panda");
        String name4 = new String("Panda");
        
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name4.equals(name3));

	}

}
