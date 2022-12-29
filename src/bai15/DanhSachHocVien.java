package bai15;

import java.time.LocalDate;

public class DanhSachHocVien {
	private DiemHocVien[] dsHV;
	private int soLuong;

	public DanhSachHocVien(int soLuong) {
		super();
		this.dsHV = new DiemHocVien[soLuong];
		this.soLuong = 0;
	}

	public boolean addHV(String name, LocalDate dob, double scoreSub1, double scoreSub2, double scoreSub3,
			double scoreSub4, double scoreSub5) {
		if (soLuong < 0)
			return false;
		dsHV[soLuong] = new DiemHocVien(name, dob, scoreSub1, scoreSub2, scoreSub3, scoreSub4, scoreSub5);
		this.soLuong++;
		return true;
	}

	public boolean isDuoi5(DiemHocVien hv) {
		if (hv.getDiemMon1() > 5 && hv.getDiemMon2() > 5 && hv.getDiemMon3() > 5 && hv.getDiemMon4() > 5
				&& hv.getDiemMon5() > 5) {
			return true;
		}
		return false;
	}

	public String xetThiLai(DiemHocVien hv) {
		if (hv.getDiemMon1() < 5)
			return "Thi lai mon 1";
		if (hv.getDiemMon2() < 5)
			return "Thi lai mon 2";
		if (hv.getDiemMon3() < 5)
			return "Thi lai mon 3";
		if (hv.getDiemMon4() < 5)
			return "Thi lai mon 4";
		else
			return "Thi lai mon 5";
	}

	public String xetDuyet(DiemHocVien hv) {
			if (hv.getDTB() > 7 && isDuoi5(hv) == true)
				return "Sinh vien được làm luận văn";
			else if (hv.getDTB() <= 7 && isDuoi5(hv) == true)
				return "Sinh vien duoc thi tot nghiep";
		return xetThiLai(hv);
	}

	@Override
	public String toString() {
		String s = "";
		for (DiemHocVien hv : dsHV)
			s += hv + " | " + xetDuyet(hv) + "\n";
		return s;
	}

	
}
