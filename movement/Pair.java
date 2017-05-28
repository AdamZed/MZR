package movement;

/**
 * @version 1.1
 */

public class Pair
{
	private double X = 0;
	private double Y = 0;
	
	public Pair() {}

	public Pair(double x, double y)
	{
		this.X = x;
		this.Y = y;
	}
	
	public double getX () { return X; }
	public double getY () { return Y; }	
	public void setX (double newX) { X = newX; }
	public void setY (double newY) { Y = newY; }	
	public void setBoth (double newX, double newY) {X = newX; Y = newY;}
	
}
