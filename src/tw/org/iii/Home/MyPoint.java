package tw.org.iii.Home;

public class MyPoint {
	public static void main(String[] args) {
		Point MyPoint = new Point();
		
		MyPoint.setXY(25, 42);
		int px = MyPoint.getX();
		int py = MyPoint.getY();
		System.out.println("X做標是" + px + "\n" + "Y座標是" + py);
		
	}
}

class Point{
	// Field
	int x;
	int y;
	
	int getX(){
		System.out.println("取得X座標" + x);
		return x;
	}
	
	int getY(){
		System.out.println("取得Y座標" + y);
		return y;
	}
	
	// Method
	
	void setXY(int px, int py){
		x = px;
		y = py;
		System.out.println("設定X,Y座標");
	}
}