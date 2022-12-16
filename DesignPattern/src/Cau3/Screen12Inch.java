package Cau3;

public class Screen12Inch extends AccessoryDecorator {

	public Screen12Inch(Car carDecorated) {

		super(carDecorated);
		// TODO Auto-generated constructor stub
	}

	public String description() {
		// TODO Auto-generated method stub
		return carDecorated.description()+"Màn hình 12 inch ...";
	}

	public double giaTien() {
		// TODO Auto-generated method stub
		return carDecorated.giaTien() + 7;
	}
}
