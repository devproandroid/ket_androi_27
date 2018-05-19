package baitap5;

public class GalaxyS8 extends GalaxyS7 {
	
	private String chongRung;

	public GalaxyS8(String name, String screenSize, String ram, CPU cpu, String camera, String chongRung) {
		super(name, screenSize, ram, cpu, camera);
		this.chongRung = chongRung;
	}
	
	public void showGalaxyS8() {
		showGalaxyS7();
		System.out.println("chống rung: " + this.chongRung);
	}

	public String getChongRung() {
		return chongRung;
	}

	public void setChongRung(String chongRung) {
		this.chongRung = chongRung;
	}
	
	

}
