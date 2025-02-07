package javainterview;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        
            File file = new File("non_existent_file.txt");
            try {
				Scanner scanner = new Scanner(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // May throw FileNotFoundException
        
        }
    
}
