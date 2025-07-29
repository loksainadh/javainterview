public class X {

        String color;
    }

    void changeColor(X c) {
        c.color = "Red"; // This works
        c = new Car();   // This does NOT change the original object
        c.color = "Blue";
    }


public static void main(String[] args) {

    X x =new X();

    System.out.println(x.c);



}

