package Cau3;

public class CameraLui extends AccessoryDecorator {

	public CameraLui(Car carDecorated) {

		super(carDecorated);
		// TODO Auto-generated constructor stub
	}

	public String description() {
		// TODO Auto-generated method stub
		return carDecorated.description()+"CameraLui ...";
	}

	public double giaTien() {
		// TODO Auto-generated method stub
		return carDecorated.giaTien() + 5;
	}
}
