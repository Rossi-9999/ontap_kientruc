package AbsFac;

public class Application {

	private Button button;
	private Checkbox checkbox;
	public Application(GUIFactory guiFactory) {
		button = guiFactory.createButton();
		checkbox = guiFactory.createCheckbox();
	}
	public void pain() {
		button.pain();
		checkbox.pain();
	}
}
