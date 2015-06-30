class Fu {
	
	static {
		System.out.println("Static Fu");
	}

	{
		System.out.println("Constructor Fu");
	}
	
	public Fu() {
		System.out.println("ConMethod Fu");	
	}

}

class Zi extends Fu {
	static {
		System.out.println("Static Zi");
	}

	{
		System.out.println("Constructor Zi");
	}

	public Zi() {
		System.out.println("ConMethod Zi");
	}

}

class ExtendsDemo {
	public static void main(String[] args) {
		Zi zi = new Zi();
	}
}
