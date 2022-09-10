package org.computer;

public class Desktop implements HardWare,Software {

	@Override
	public void softwareResources() {
	System.out.println("Intel");
	System.out.println("5");
	}

	@Override
	public void harewareResorces() {
	System.out.println("Laptop");	
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.softwareResources();
		d.harewareResorces();
	}

}
