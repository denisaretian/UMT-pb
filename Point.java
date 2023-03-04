package problem2;

public class Point implements Comparable{
	private int x;
	private int y;
	
	Point(){
		x = 0;
		y = 0;
	}
	
	Point(int a, int b){
		x = a;
		y = b;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	@Override
	public int compareTo(Object a) { 
		if(this.x == ((Point) a).getX())
			return this.y-((Point) a).getY();
		else return this.x-((Point) a).getX();
	}
}
