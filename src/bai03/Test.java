package bai03;

public class Test {

	public static void main(String[] args) {
		Cylinder a = new Cylinder();
		Cylinder b = new Cylinder(5, 6);
		System.out.println("Dien tich xung quanh: " + b.sXungQuanh());
		System.out.println("Dien tich toan phan: " + b.sToanPhan());
		System.out.println("The tich: " + b.theTich());
	}

}
