package template;

public abstract class Picture {
	
	private int height;
	private int width;
	private int dpi;
	
	public Picture(int height, int width, int dpi) {
		this.height = height;
		this.width = width;
		this.dpi = dpi;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDpi() {
		return dpi;
	}
	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	public void dimension() {
		System.out.println("Dimension" + height * width);
	}
	public abstract void transparency();

}
