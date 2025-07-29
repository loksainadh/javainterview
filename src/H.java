import java.util.Objects;

public class H {


    public static void main(String[] args) {
        Integer i=55;


        int hash = Objects.hashCode(i)%5;
        System.out.println(hash);
    }



}
