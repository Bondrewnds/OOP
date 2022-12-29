package bai10;

public class SinhVien {
	private String maSV;
	private String hoTen;

	public SinhVien(String maSV, String hoTen) {
		super();
		setMaSV(maSV);
		setHoTen(hoTen);
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		if (maSV.trim().equals(""))
			this.maSV = "000";
		else
			this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen.trim().equals(""))
			this.hoTen = "xxx";
		else
			this.hoTen = hoTen;
	}

	@Override
	public String toString() {
		return String.format("   %s|%-20s", maSV, hoTen);
	}

}
