class Father {
	public Father() {
		System.out.println("Father");
	}
}

class Son extends Father {
	public Son() {
		super();
		System.out.println("Son");
	}
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
