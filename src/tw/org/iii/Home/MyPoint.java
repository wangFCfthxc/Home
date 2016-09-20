package tw.org.iii.Home;

public class MyPoint {
	public static void main(String[] args) {
		Point MyPoint = new Point();
		System.out.println("XY座標是" + (MyPoint.getX() + "," + MyPoint.getY()));
		MyPoint.setXY(1023, 150);
		System.out.println("XY座標是" + (MyPoint.getX() + "," + MyPoint.getY()));
		
		
	}
}

class Point{
	// Field
	private int x;
	private int y;
	// Constructor 
	public Point(){
		x = 0;
		y = 0;
	}
	public Point(int px, int py){
		x = px;
		y = py;
	}
	// Method
	public void setXY(int px, int py){
		if(px >= 0 && px <= 100){
			x = px;
		}else{
			System.out.println("X座標超出範圍");
		}
		if(py >=0 && py<= 100){
			y = py;
		}else{
			System.out.println("Y座標超出範圍");
		}
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	

}