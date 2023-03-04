# UMT-pb
Rectangle problem

I chose to resolve this problem in Java.

Firstly I created a Point class which implements the Comparable interface which will help us to compare and sort a set of Points. This will allow us later to use TreeSet interface to group all these points together. 

To make that happen we must override the compareTo method provided by the Comparable interface. I decided to compare the points by their abscissa ((x) coordinate); if they turn to be equal, the program compares their ordinate ((y) coordinate). The method compares the current Point with the passed one and returns an integer. If the returned integer is positive, the current point is bigger, otherwise it is smaller and if the method returns 0 means the points are equal. But because a TreeSet doesn’t keep 2 points that are the same, it wasn’t necessary mentioning the case where the points are equal.

The Point class has 2 private attributes: the abscissa (x) and the ordinate (y), 2 constructors, 2 public methods which return the coordinates and the overridden method.
In the Solution class I created a TreeSet to store all the instantiated Points. 

To see if there are any rectangles formed, I checked if there is any opposite pair of points for each pair of points. 
The first condition implies that the pair must be a diagonal of the rectangle. It can’t be parallel to the coordinate axis because in this way the rectangles wouldn’t be parallel themselves with the coordinate axis.  

Then, we had to check if there existed the opposite diagonal. It is computed by a combination of the values of the other 2 points (the x of one and the y of the other).  
If the conditions turn true, the value of rectangles increases. 
Because the algorithm calculates the rectangle for any point and a rectangle is defined by 4 points, we have to divide de result by 4.
