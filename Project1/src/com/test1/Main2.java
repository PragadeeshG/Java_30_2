package com.test1;

public class Main2 {
// Main Method
	public static void main(String[] args) {
    Laptop output1 = getNewLaptop("Lenovo", "HDD");
    Laptop output2 = getNewLaptop("Toshiba", "SSD");
    output1.setBrand("Dell");
    output2.setBrand("Acer");
    String o1 = output1.getBrand();
    int o2 = output1.getHardDiskCapacity();
    String o3 = output1.getHardDiskType();
    String o4 = output2.getBrand();
    String o5 = output2.getHardDiskType();
    int o6 = output2 .getHardDiskCapacity();
    System.out.println("OUTPUT 1:");
    System.out.println();
    System.out.println("Brand: " + o1);
    System.out.println("Hard Disk Capacity: " + o2);
    System.out.println("Hard Disk Type: " + o3);
    System.out.println();
    System.out.println();
    System.out.println("OUTPUT 2:");
    System.out.println();
    System.out.println("Brand: " + o4);
    System.out.println("Hard Disk Type: " + o5);
    System.out.println("Hard Disk Capacity: " + o6);
    
	}
// Own Method
	public static Laptop getNewLaptop(String brand, String hardDiskType) {
		Laptop s1 = new Laptop();
		s1.setBrand(brand);
		s1.setHardDiskType(hardDiskType);
		return s1;
	}
}
