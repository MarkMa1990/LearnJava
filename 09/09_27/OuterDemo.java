interface Inner {
	void show();
	}

class Outer {
	//
	//static method()
	//return object
	//return Inner class
	//
	
	public static Inner method() {
	
		return new Inner() {
			public void show() {
				System.out.println("Hello, world!");
			}
		};
	}

}

class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
