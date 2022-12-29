package bai04;

public class DiemSinhVien {
	private int maSV;
	private String nameSV;
	private double diemLT;
	private double diemTH;

	public DiemSinhVien() {
		this.maSV = 1111;
		this.nameSV = "Nguyen Thanh An";
		this.diemLT = 6.5;
		this.diemTH = 8.5;
	}

	public DiemSinhVien(int maSV, String nameSV, double diemLT, double diemTH) {
		this.maSV = maSV;
		this.nameSV = nameSV;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if (maSV > 0)
			this.maSV = maSV;
		else
			this.maSV = 1;
	}

	public String getNameSV() {
		return nameSV;
	}

	public void setNameSV(String nameSV) {
		if (nameSV.trim().equals("")) {
			this.nameSV = "Chua xac dinh";
		} else {
			this.nameSV = nameSV;
		}
	}

	public double getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(double diemLT) {
		if (diemLT >= 0 && diemLT <= 10) {
			this.diemLT = diemLT;
		} else
			this.diemLT = 0;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(double diemTH) {
		if (diemLT >= 0.0 && diemLT <= 10.0) {
			this.diemTH = diemTH;
		} else
			this.diemTH = 0;
	}

	public double avgDiem() {
		return (getDiemLT() + getDiemTH()) / 2;
	}

	public String toString() {
		return String.format("%-10s%-23s%-10s%-10s%-10s", maSV, nameSV, diemLT, diemTH, avgDiem());
	}

}
