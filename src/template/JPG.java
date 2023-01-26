package template;

public class JPG extends Picture {

	public JPG(int height, int width, int dpi) {
		super(height, width, dpi);
	}

	@Override
	public void transparency() {
		System.out.println("Not Transparent");
	}

}
