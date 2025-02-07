package stringinterview;

import java.util.Arrays;

public class Evanoddin8 {
public static void main(String[] args) {
	 int[] numbers = {4, 5, 6, 8, 3, 2, 0, 1};
	 
	 
	 Arrays.stream(numbers).filter(i->i%2==0).forEach(i->System.out.println(i));
}
}
