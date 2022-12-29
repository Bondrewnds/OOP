package bai12;

public class CDList {
	private CD[] cdList;
	private int cdNum;

	public CDList(int cdNum) {
		super();
		this.cdList = new CD[cdNum];
		this.cdNum = 0;
	}

	public boolean themCD(CD cdMoi) {
		for (int i = 0; i < cdNum; i++) {
			if (cdMoi.getMaCD() == cdList[i].getMaCD()) {
				return false;
			}
		}
		cdList[cdNum] = cdMoi;
		cdNum++;
		return true;
	}

	@Override
	public String toString() {
		String s = String.format("Danh sach CD:\n");
		for (CD cd : cdList) {
			s += cd + "\n";
		}
		return s;
	}

	public int soLuongCD() {
		return cdNum;
	}

	public int searchPos(int x) {
		for (int i = 0; i < cdNum; i++)
			if (cdList[i].getMaCD() == x)
				return i;
		return -1;
	}

	public void xoaCD(int x) {
		int pos = searchPos(x);
		for (int i = pos; i < cdNum - 1; i++) {
			this.cdList[i] = this.cdList[i + 1];
		}
		this.cdNum--;
	}

	public double sumOfPrice() {
		double sum = 0;
		for (int i = 0; i < cdNum; i++) {
			sum += cdList[i].getGiaThanh();
		}
		return sum;
	}

	public void searchID(int x) {
		int key = searchPos(x);
		if (key == -1)
			System.out.println("Khong tim thay");
		else {
			System.out.println("Tim thay");
		}
	}

	public void sortPrice() {
		for (int i = 0; i < cdNum - 1; i++)
			for (int j = i + 1; j < cdNum; j++) {
				if (cdList[i].getGiaThanh() < cdList[j].getGiaThanh()) {
					CD tmp = cdList[j];
					cdList[j] = cdList[i];
					cdList[i] = tmp;
				}
			}
	}

	public void sortName() {
		for (int i = 0; i < cdNum - 1; i++)
			for (int j = i + 1; j < cdNum; j++) {
				if (cdList[i].getTuaCD().compareTo(cdList[j].getTuaCD()) > 0) {
					CD tmp = cdList[j];
					cdList[j] = cdList[i];
					cdList[i] = tmp;
				}
			}
	}
}
