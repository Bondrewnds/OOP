package bai13;

public class CongNhan {
	private String mHo;
	private String mTen;
	private int mSoSP;

	public CongNhan(String mHo, String mTen, int mSoSP) {
		super();
		this.mHo = mHo;
		this.mTen = mTen;
		setmSoSP(mSoSP);
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		if (mSoSP >= 0)
			this.mSoSP = mSoSP;
		else
			this.mSoSP = 0;
	}

	public double getSalary() {
		double kq = 0;
		if (mSoSP > 600)
			kq = mSoSP * 0.65;
		else if (mSoSP >= 400)
			kq = mSoSP * 0.6;
		else if (mSoSP >= 200)
			kq = mSoSP * 0.55;
		else
			kq = mSoSP * 0.5;
		return kq;
	}

	@Override
	public String toString() {
		return String.format("Ho ten Cong nhan: %s %s\tSo luong SP: %d\tLuong: %f", mHo, mTen, mSoSP, getSalary());
	}

	
}
