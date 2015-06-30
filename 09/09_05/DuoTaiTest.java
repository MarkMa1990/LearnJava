class Animal {
	public int age = 10;
	public void eat() {
		System.out.println("Animal: eating");
	}
}

class Dog extends Animal {
	public int age = 5;
	public void eat() {
		System.out.println("Dog: eating");
	}
}

class Cat extends Animal {
	public int age = 3;
	public void eat() {
		System.out.println("Cat: eating");
	}
}

class DuoTaiTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println("Age: | "+a.age);
		a.eat();
		System.out.println("------------------");

		Animal d = new Dog();
		System.out.println("Age: | "+d.age);
		d.eat();
		System.out.println("------------------");

		Dog dd = (Dog)d;
		System.out.println("Age: | "+dd.age);
		dd.eat();
		System.out.println("------------------");

		Animal c = new Cat();
		System.out.println("Age: | "+c.age);
		c.eat();
		System.out.println("------------------");

		Cat cc = (Cat)c;
		System.out.println("Age: | "+cc.age);
		cc.eat();
		System.out.println("------------------");

	}
}
