package stringinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class A {
	
	public static void main(String[] args) {
		//System.out.println("hello world");
		String str = "java is a programming language";
		
		List<String> ll = Arrays.asList(str.split("\\s+"));
	ll.stream().map(i->i.substring(0, 1).toUpperCase()+i.substring(1)
			).forEach(i->System.out.println(i));
		
		
		
		
		
		
	}
	
	

}
