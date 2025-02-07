package javainterview;


	import java.util.*;

	class Student {
	    int id;
	    String name;
	    int age;

	    public Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return id + " " + name + " " + age;
	    }
	}

	class AgeComparator implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        return s1.age - s2.age; // Sorting by age (Ascending)
	    }
	}

	class NameComparator implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        return s1.name.compareTo(s2.name); // Sorting by name (Alphabetical)
	    }
	}

	public class ComparatorExample {
	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student(1, "Alice", 22));
	        students.add(new Student(2, "Bob", 20));
	        students.add(new Student(3, "Charlie", 21));

	        System.out.println("Sorting by Age:");
	        Collections.sort(students, new AgeComparator());
	        for (Student s : students) {
	            System.out.println(s);
	        }

	        System.out.println("\nSorting by Name:");
	        Collections.sort(students, new NameComparator());
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}


