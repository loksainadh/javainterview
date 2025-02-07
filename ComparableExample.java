package javainterview;


	import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	class Student implements Comparable<Student> {
	    int id;
	    String name;
	    int age;

	    public Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public int compareTo(Student other) {
	        return this.age - other.age; // Sorting by age (Ascending)
	    }

	    @Override
	    public String toString() {
	        return id + " " + name + " " + age;
	    }
	}

	public class ComparableExample {
	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student(1, "Alice", 22));
	        students.add(new Student(2, "Bob", 20));
	        students.add(new Student(3, "Charlie", 21));

	        Collections.sort(students); // Sort using Comparable

	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}


