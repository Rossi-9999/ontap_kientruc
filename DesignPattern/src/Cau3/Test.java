package Cau3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new CameraLui(new Screen12Inch(new Car5EMT()));
		System.out.println( car.description());
		System.out.println("Tổng: "+ car.giaTien());
	}

}
