package bai03;

public class Cylinder {
	private int radius;
	private int heigh;

	public Cylinder() {
		this.radius = 1;
		this.heigh = 1;
	}

	public Cylinder(int radius, int heigh) {
		this.radius = radius;
		this.heigh = heigh;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius <= 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}

	public int getHeigh() {
		return heigh;
	}

	public void setHeigh(int heigh) {
		if (heigh <= 0) {
			this.heigh = 1;
		} else {
			this.heigh = heigh;
		}
	}

	public double sXungQuanh() {
		double S = 2 * 3.14 * radius * heigh;
		return S;
	}

	public double sToanPhan() {
		double S = sXungQuanh() + (2 * 3.14 * radius * radius);
		return S;
	}

	public double theTich() {
		double V = 3.14 * radius * radius * heigh;
		return V;
	}

}
