package baitap5;

public class GalaxyS7 extends MobilePhone {
	private String camera;
	
	
	
	public GalaxyS7(String name, String screenSize, String ram, CPU cpu, String camera) {
		super(name, screenSize, ram, cpu);
		this.camera = camera;
	}
	
	public void showGalaxyS7() {
		showInfor();
		System.out.println("----------------| Tính Năng |--------------");
		System.out.println("Camera: " +this.camera );
	}
	
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	

}
