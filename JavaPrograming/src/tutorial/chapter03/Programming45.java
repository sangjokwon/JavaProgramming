package tutorial.chapter03;

class Rectangle {
	// 필드 선언
	private int width, length;

	// 접근자 선언
	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	// 설정자 선언
	public void setWidth(int _width) {
		width = _width;
	}

	public void setLength(int _length) {
		length = _length;
	}

	public int calcArea() {
		int area = width * length;
		return area;
	}

}

public class Programming45 {
	public static void main(String[] args) {

		Rectangle myRec = new Rectangle();

		myRec.setWidth(20);
		myRec.setLength(30);

		System.out.println("사각형의 세로  " + myRec.getWidth());
		System.out.println("사각형의 길이 " + myRec.getLength());
		System.out.println("사각형의 넓이 " + myRec.calcArea());
	}

}
