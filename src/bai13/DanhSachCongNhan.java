package bai13;

public class DanhSachCongNhan {
	private CongNhan[] dsCN;
	private int soCN;

	public DanhSachCongNhan(int soCN) {
		super();
		this.dsCN = new CongNhan[soCN];
		this.soCN = 0;
	}

	public boolean addCN(CongNhan cnMoi) {
		if (soCN < 0)
			return false;
		dsCN[soCN] = cnMoi;
		soCN++;
		return true;
	}

	@Override
	public String toString() {
		String s = String.format("Danh sach cong nhan:\n");
		for (CongNhan cn : dsCN)
			s += cn + "\n";
		return s;
	}

	public int getSoLuong() {
		return soCN;
	}

	public String getCN200SP() {
		String s = String.format("Danh sach CN lam tren 200 SP:\n");
		for (CongNhan cn : dsCN) {
			if (cn.getmSoSP() >= 200)
				s += cn + "\n";
		}
		return s;
	}

	public void sortCongNhan() {
		for (int i = 0; i < (dsCN.length - 1); i++)
			for (int j = i + 1; j < dsCN.length; j++)
				if (dsCN[i].getmSoSP() < dsCN[j].getmSoSP()) {
					CongNhan temp = dsCN[j];
					dsCN[j] = dsCN[i];
					dsCN[i] = temp;
				}
	}
}
