package baitap5;

public class GalaxyS9 extends GalaxyS8 {
	
	private String chongNuoc;
	
	public GalaxyS9(String name, String screenSize, String ram, CPU cpu, String camera, String chongRung,
			String chongNuoc) {
		super(name, screenSize, ram, cpu, camera, chongRung);
		this.chongNuoc = chongNuoc;
	}

	public void showGalaxyS9() {
		showGalaxyS8();
		System.out.println("chống Nước: "+ this.chongNuoc);
	}
	
	public String getChongNuoc() {
		return chongNuoc;
	}

	public void setChongNuoc(String chongNuoc) {
		this.chongNuoc = chongNuoc;
	}
	
	
	

}
