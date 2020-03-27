package test;
import java.io.*;
import java.util.*;

public class TestFile {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
    create(sc);
    }catch(Exception e){
      System.out.println(e);
    }
  }

  public static void create(Scanner console)throws FileNotFoundException{
		System.out.println("Input file name: ");
		String nameIn = console.next();
		File f1 = new File(nameIn);
		while(!f1.exists()){
			System.out.println("File not found. Try again: ");
			nameIn = console.next();
    }

		System.out.println("Output file name: ");
		String nameOut = console.next();
		File out = new File(nameOut);
		PrintStream output = new PrintStream(out);
		
		Scanner input = new Scanner(f1);
		
		while(input.hasNextLine()){
			String text = input.next();
			
			if(text.startsWith("<") && text.endsWith(">")){
				//String x = input.next();
				char a = text.charAt(1);
				String anora = aOrAn(a);
				text = text.replace('<', ' ');
				text = text.replace('>', ' ');
				text = text.replace('-', ' ');
				System.out.println("Please type" + anora + text);
				String in = console.next();
				output.print(" " + in + " ");
			}
			else{
				output.print(" " + text + " ");
			}
		}
	}
	
	public static void view(Scanner console)throws FileNotFoundException{
		Scanner input = new Scanner(new File("simple.txt"));
		while(input.hasNextLine()){
			String text = input.nextLine();
			System.out.println(text);
		}
		System.out.println();
	}
	
	public static String aOrAn(char check){
		String a;
		if(check == 'a' || check == 'A' || check == 'i' || check == 'I' 
			|| check == 'i' || check == 'e' || check == 'E' ||
			check == 'o' || check == 'O' || check == 'u' || check == 'U'){
			a = " an";
		}
		else{
			a = " a";
		}
		return a;
	}
}