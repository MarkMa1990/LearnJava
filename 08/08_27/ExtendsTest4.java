class Person {
	private String name;
	private int age;

	Person() {
	
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}

class Student extends Person {
	Student() {
	
	}

	Student(String name, int age) {
		super(name, age);
	}
/*	
	public String getName2() {
		return this.name;
	}

	Privte variables cannot jicheng from its father.
*/

}

class ExtendsTest4 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(22);
		s1.setName("Mark");
		System.out.println("Name: "+s1.getName()+" | Age: "+s1.getAge());
		System.out.println("---------------------------------------------");

		//System.out.println("Name: "+s1.name+" | Age: "+s1.age);

		Student s2 = new Student("Jhon",23);
		System.out.println("Name: "+s2.getName()+" | Age: "+s2.getAge());

	}
}
