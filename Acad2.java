package packageB;

import packageA.*;

public class Acad2 extends Acad1{

	public static void main(String[] args) {
		Acad2 obj = new Acad2();
		obj.test();
		System.out.println("Method msg is getting accessed in different package packageB");
	}

}
