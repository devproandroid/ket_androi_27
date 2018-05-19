package baitap5;

public class MobilePhone {
private String name;
private String screenSize;
private String ram;
CPU cpu;


public MobilePhone(String name, String screenSize, String ram, CPU cpu) {
	super();
	this.name = name;
	this.screenSize = screenSize;
	this.ram = ram;
	this.cpu = cpu;
}
public void showInfor() {
	System.out.println("---------| Thông số mobile phone: |-------------- ");
	System.out.println("Tên: "+ this.name);
	System.out.println("Kích thước màn hình: "+ this.screenSize);
	System.out.println("Dung lượng ram:  "+ this.ram);
	System.out.println("Tên cpu: "+ this.cpu.getName());
	cpu.showiInforCPU();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getScreenSize() {
	return screenSize;
}
public void setScreenSize(String screenSize) {
	this.screenSize = screenSize;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}


}
