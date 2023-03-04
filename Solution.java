package problem2;

import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		
		TreeSet<Point> P = new TreeSet<Point>();
		
		Point a = new Point(1, 1);	P.add(a);
		Point b = new Point(1, 3);	P.add(b);
		Point c = new Point(2, 1);	P.add(c);
		Point d = new Point(2, 3);	P.add(d);
		Point e = new Point(3, 1);	P.add(e);
		Point f = new Point(3, 3);	P.add(f);
		
		
		int rectangle = 0;
		
		for(Point i : P) {
			for(Point j : P) {
				if((i.getX() != j.getX()) && (i.getY() != j.getY()))
					if(P.contains(new Point(i.getX(), j.getY())) && P.contains(new Point(j.getX(), i.getY())))
						rectangle++;
			}
		}
		
		rectangle = rectangle/4;
		System.out.println(rectangle);
	}

}
