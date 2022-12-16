package ManagerSignton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MgrSingleton mgrSingleton=MgrSingleton.getInstance();
		MgrSingleton mgrSingleton2=MgrSingleton.getInstance();
		MgrSingleton mgrSingleton3=MgrSingleton.getInstance();
	}

}
