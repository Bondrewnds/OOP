package bai01;

public class ToaDo {
	private int x;
	private int y;
	private String name;

	public ToaDo() {
		this.x = 1;
		this.y = 1;
		this.name = "chưa xác định";
	}

	public ToaDo(int x, int y, String name) {
		setX(x);
		setY(y);
		setName(name);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
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

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getThongTin() {
		return String.format("%s(%d,%d)", name, x, y);
	}

}
