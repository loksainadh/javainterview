class Person {
    String name;
}

public class Main {
    static void changeName(Person p) {
        p.name = "John";  // This will affect the original object
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Mike";

        changeName(person);

        System.out.println(person.name);  // Output: John
    }
}
