package AbsFac;

public class Test {
public static void main(String[] args) {
	Application app;
	GUIFactory guiFactory;
	String osName=System.getProperty("os.name").toLowerCase();
	if (osName.contains("mac")) {
		guiFactory=new MacOSFactory();
		app= new Application(guiFactory);
	}else {
		guiFactory=new WindowFactory();
		app= new Application(guiFactory);
	}
	app.pain();
}
}
