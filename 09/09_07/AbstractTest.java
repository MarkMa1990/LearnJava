abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	abstract void eat();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("Dog eat meat");
	}

}

class AbstractTest {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.setName("Dog Peter");
		a.setAge(3);
		System.out.println(a.getName()+"------"+a.getAge());
		System.out.println("---------------------------");

		Animal b = new Dog("Jhon",2);
		System.out.println(b.getName()+"------"+b.getAge());
		System.out.println("---------------------------");
	}
}
