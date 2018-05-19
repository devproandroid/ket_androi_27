package baitap5;

public class CPU {
	private int core;
	private float speed;
	private String technology;
	private String name;
	

	public CPU(int core, float speed, String technology, String name) {
		super();
		this.core = core;
		this.speed = speed;
		this.technology = technology;
		this.name = name;
	}

	
	public int getCore() {
		return core;
	}
	public void setCore(int core) {
		this.core = core;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public void showiInforCPU() {
	System.out.println("--------------| Thông tin CPU |-------------");
	System.out.println("Số nhân : " +this.core);
	System.out.println("tốc độ cpu: "+ this.speed);
	System.out.println("Công nghệ sử dụng: "+ this.technology);
}
}
