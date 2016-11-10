package tutorial.chapter03;

class Box{
	private int width;
	private int length;
	private int high;
	
	public int calcVolume(){
		return width * length * high;
	}
	
	Box(int _width, int _length, int _high){
		width = _width;
		length = _length;
		high = _high;
	}
}
public class Programming48 {
	public static void main(String[] args){
		Box mybox = new Box(10, 20, 30);
		System.out.println("Vlolume : " + mybox.calcVolume());
	}

}
