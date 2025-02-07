package stringinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B {
	
	public static void main(String[] args) {
		String str = "java is a programming language";
		List<String> ll = Arrays.asList(str.split("\\s+"));
		//List ss= new ArrayList<>();
		for(int i=0;i<ll.size();i++) {
		String ss = ll.get(i).substring(0,1).toUpperCase()+ll.get(i).substring(1);
		
			System.out.println(ss);
		}
		
		
	}
	
	
	
}
