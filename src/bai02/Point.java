package bai02;

public class Point {
	private int x;
	private int y;
	private String name;

	public Point() {
		this.x = 1;
		this.y = 1;
		this.name = "Chua xac dinh";
	}

	public Point(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().equals("")) {
			this.name = "O";
		} else {
			this.name = name;
		}
	}

	public String negate() {
		return String.format("%s(-%d,-%d)", name, x, y);
	}

	public double getDistace() {
		double distance = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
		return distance;
	}
	
	public double getDistace(Point a) {
		double distanceAB = Math.sqrt((x - a.getX()) * (x - a.getX()) + (y - a.getY()) * (y - a.getY()));
		return distanceAB;
	}

	public String toString() {
		return String.format("%s(%d,%d)", name, x, y);
	}

}
