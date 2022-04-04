package com.overridinf.trail1;

public class Girl extends Boy {

	public void boyName() {
		super.boyName();
		System.out.println("pooja");
	}

	public void girlName(int id) {
		super.girlName(100);
		System.out.println(id);

	}

	public static void main(String[] args) {
		Girl b = new Girl();
		b.boyName();
		b.girlName(1045);
		

	}

}