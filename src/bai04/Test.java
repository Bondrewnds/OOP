package bai04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner strsc = new Scanner(System.in);
		int ma3;
		String name3;
		double diem3LT;
		double diem3TH;
		DiemSinhVien sv1 = new DiemSinhVien();
		DiemSinhVien sv2 = new DiemSinhVien(2222, "Le Thi Bong", 7.5, 8.0);
		DiemSinhVien sv3;

		System.out.println("Nhap MaSV cho sv3: ");
		ma3 = sc.nextInt();
		System.out.println("Nhap ten cho sv3: ");
		name3 = strsc.nextLine();
		System.out.println("Nhap diem LT: ");
		diem3LT = sc.nextDouble();
		System.out.println("Nhap diem TH:");
		diem3TH = sc.nextDouble();
		sv3 = new DiemSinhVien(ma3, name3, diem3LT, diem3TH);
		
		System.out.println(String.format("%-10s%-20s%-10s%-10s%-10s", "MaSV", "HoTen", "DiemLT", "DiemTH", "DiemTB"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}

}
