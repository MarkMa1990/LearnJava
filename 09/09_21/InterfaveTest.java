/*
Requirements:
	Student
	Teacher

Analysis:
	Student:
		variables: name, age
		method: eat(); sleep() {}

	Teacher:
		variables: name, age
		method: eat(); sleep() {}
	
	SmokingTeacher, SmokingStudent:
		smoking() {};

	Person:
		variables: name,age
		method: eat(); sleep() {}

Achievement:
	interface Smoking:
	abstract Person:
	Student:
	Teacher:

 */

interface Smoking {
	public abstract void smoking();
}

abstract class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name,int age) {
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

	public abstract void eat();

	public void sleep() {
		System.out.println("sleeping...");
	}
}

class Student extends Person {
	public Student() {}
	public Student(String name, int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("Student eating...");
	}
}

class Teacher extends Person {
	public Teacher() {}
	public Teacher(String name, int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("Teacher eating...");
	}
}

class SmokingStudent extends Student implements Smoking {
	public SmokingStudent() {}
	public SmokingStudent(String name, int age) {
		super(name,age);
	}

	public void smoking() {
		System.out.println("Student Smoking...");
	}
}

class SmokingTeacher extends Teacher implements Smoking {
	public SmokingTeacher() {}
	public SmokingTeacher(String name, int age) {
		super(name,age);
	}

	public void smoking() {
		System.out.println("Teacher Smoking...");
	}
}

class InterfaceTest {
	public static void main(String[] args) {
		SmokingStudent ss = new SmokingStudent();
		ss.setName("Jack");
		ss.setAge(21);
		ss.eat();
		ss.sleep();
		System.out.println(ss.getName()+"---"+ss.getAge());
		System.out.println("------------------");

		SmokingTeacher tt = new SmokingTeacher("Jhon",30);
		tt.eat();
		tt.sleep();
		System.out.println(tt.getName()+"---"+tt.getAge());
	}
}

