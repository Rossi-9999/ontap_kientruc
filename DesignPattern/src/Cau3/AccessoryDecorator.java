package Cau3;

public abstract class AccessoryDecorator implements Car{

	 protected Car carDecorated;
	    public AccessoryDecorator(Car carDecorated)
	    {
	        this.carDecorated = carDecorated;
	    }
	    public double giaTien() { 
	    	return carDecorated.giaTien(); 
	    }
	    public String description() {
			// TODO Auto-generated method stub
			return carDecorated.description();
		}
}
