class InitDemo {

	/*
	int b = 20;
	// a non-static variable cannot be referenced by a static contexxt.
	*/

	public static void main(String[] args) {
		/*
		int a;
		//This is wrong.
		//Variables need to be iniatialized before using.
		*/
		int a = 10;
		System.out.println("a: "+a);

	//	System.out.println("b: "+b);
		
		/*
		show();
		//a non-static method cannot be referenced from a static context.
		*/
	}

	public void show() {
		System.out.println("Show");
	}

}
