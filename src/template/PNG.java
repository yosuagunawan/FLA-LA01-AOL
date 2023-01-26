package template;

public class PNG extends Picture {

	public PNG(int height, int width, int dpi) {
		super(height, width, dpi);
	}

	@Override
	public void transparency() {
		System.out.println("Transparent");
	}

}
