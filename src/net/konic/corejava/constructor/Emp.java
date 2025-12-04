package net.konic.corejava.constructor;

public class Emp {
	static String companyname = "Konic";
	int empid;
	String empname;
	
	Emp(int a,String b ){
		empid = a;
		empname =b;
	}
	
	void empdtl() {
		System.out.println("emoid:"+empid);
		System.out.println("empname:"+empname);
	}
	  static void empdt() {
		  System.out.println(companyname);
	  }
	
	public static void main (String[] args) {
			Emp emp = new Emp(23,"khan");
			emp.empdtl();
            empdt();
	}}
