package javainterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class employee {
	
	private int number;
	private String name;
	private Double sal;
	
	void setnumber(int number){
	this.number=number;

	}
	void setname (String name) {
		this.name= name;
	}
	void setsal (Double sal) {
	this.sal=sal;
	}
	
int getnumber(){
	return number;
	
}
String getname () {
	return name ;
	
}
Double getsal() {
	return sal;
	
}
employee (int number,String name,Double sal){
	this.number=number;
	this.name=name;
	this.sal=sal;
}

@Override
public String toString() {
	return "employee [number=" + number + ", name=" + name + ", sal=" + sal + "]";
}
public static void main(String[] args) {
	//employee s= new employee(5, "pavani", 50000.00);
	employee ss= new employee(6, "avani", 49000.00);
	employee sss= new employee(7, "lavani", 22000.00);
	
 List<employee>  lo	=new ArrayList<employee>();
 lo.add(sss);
 lo.add(ss);
 lo.add(new employee(66, "syamala", 51000.00));
 lo.stream().forEach(i->System.out.println(i));
 
 
 
 
 
 //Set<employee> lx = lo.stream().collect(Collectors.toSet());
// Map<Double, Integer> lx = lo.stream().collect(Collectors.toMap(employee::getsal, employee::getnumber));
  // lo.stream().collect(Collectors.toMap(employee::getsal, employee::getnumber)).forEach((i,v)->System.out.println(i+" "+v));
 
 //long lx = lo.stream().count();
 
 //Optional<employee> lx = lo.stream().findFirst();
 // boolean kkk = lo.stream().noneMatch(i->i.getsal()>500);
// Optional<employee> lx = lo.stream().min(Comparator.comparingDouble(employee::getsal));
 
//lo.stream().map(i->i.getsal()*2).forEach(System.out::println);
 //lo.stream().filter(i->i.getsal()> 49000.00).forEach(System.out::println);
	//List<employee> dd = lo.stream().filter(i->i.getsal()> 49000.00).collect(Collectors.toList());
	//dd.stream().forEach(System.out::println);
	
	//System.out.println(lx);
}
}




