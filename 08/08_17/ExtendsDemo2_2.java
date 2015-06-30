class Father {
	int b=20;
	public Father() {
		System.out.println("Father");
	}
}

class Son extends Father {
	{	int a=10;
		System.out.println("Hi");
	}

	public Son() {
		System.out.println("Son");
	}
}

class ExtendsDemo2_2 {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
