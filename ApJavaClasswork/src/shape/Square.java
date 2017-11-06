package shape;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square Side Length:" + side + "\tArea:" + this.Perimeter();
	}

}
