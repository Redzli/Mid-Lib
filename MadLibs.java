//Yuanqin Liu
//20816779
//HW7
//March26,2020 
//This program will run a game called mad libs.
//Input: This program accepts words in different forms.
//Output: This program makes a funny paragraph using words from user inputs.
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MadLibs {

	public static void inputWords(String assignName) {//Is this parameter right?
	System.out.println("(C)reate mad-lib, (V)iew mad-lib, (Q)uit?");//3 choice
	Scanner CVQ = new Scanner(System.in);//check answer
	String answerCVQ = CVQ.next();// save answer
	
	//for the three choices:
	while (!(answerCVQ.equals("Q")||answerCVQ.equals("q"))) {//if choice is not those three
		if (answerCVQ.equals("C")||answerCVQ.equals("c")){
			create();//method2
		};
		if (answerCVQ.equals("V")||answerCVQ.equals("v")){
			view();//method3
		}
		else{
			return;
			//keep asking the question when not those three choices, but I don't think thsi line works
		}
	
	 } 
//end the game

	public static void create() {
		System.out.println("Input file name: ");
		Scanner file = new Scanner(System.in);// ask for original file
		String fileName = file.next();// save that file
		while (!fileName.equals("madlib0.txt") || !fileName.equals("madlib1.txt") || !fileName.equals("madlib2.txt")
				|| fileName.equals("madlib3.txt") || !fileName.equals("madlib4.txt")
				|| !fileName.equals("madlib5.txt")) {
			System.out.println("File not found. Try again: ");//try to catch the correct file name, if not match, keep asking
		}

//    	   if (fileName.equals("madlib0.txt")) {
//    	   Scanner input = new Scanner(new File("madlib0.txt"));
//   		   PrintStream output = new PrintStream(new File("ml0.txt"));//idk how to make the text show in the output
//       }
//    	   if (fileName.equals("madlib1.txt")) {
//        	   Scanner input = new Scanner(new File("madlib1.txt"));
//       		   PrintStream output = new PrintStream(new File("ml1.txt"));//idk how to make the text show in the output
//           }
//    	   if (fileName.equals("madlib2.txt")) {
//        	   Scanner input = new Scanner(new File("madlib2.txt"));
//       		   PrintStream output = new PrintStream(new File("ml2.txt"));//idk how to make the text show in the output
//           }
//    	   if (fileName.equals("madlib3.txt")) {
//        	   Scanner input = new Scanner(new File("madlib3.txt"));
//       		   PrintStream output = new PrintStream(new File("ml3.txt"));//idk how to make the text show in the output
//           }
//    	   if (fileName.equals("madlib4.txt")) {
//        	   Scanner input = new Scanner(new File("madlib4.txt"));
//       		   PrintStream output = new PrintStream(new File("ml4.txt"));//idk how to make the text show in the output
//           }
//    	   if (fileName.equals("madlib5.txt")) {
//        	   Scanner input = new Scanner(new File("madlib5.txt"));
//       		   PrintStream output = new PrintStream(new File("ml5.txt"));//idk how to make the text show in the output
//           }
//    	   
//       }   
		System.out.println("Output file name: ");//make user name their file
		Scanner assign = new Scanner(System.in);// catch their input name for their file
		String assignName = assign.next();// save that name
		type();//method4
	}

	public static void type() {
		String wordType;//wants to catch all the blank words with different types and ask for user's choice of word
		// if (fileName.equals("madlib1.txt")) {
//     	   Scanner input = new Scanner(new File("madlib1.txt"));	  
//        }
// 	   if (fileName.equals("madlib2.txt")) {
//     	   Scanner input = new Scanner(new File("madlib2.txt"));
//        }
// 	   if (fileName.equals("madlib3.txt")) {
//     	   Scanner input = new Scanner(new File("madlib3.txt"));
//        }
// 	   if (fileName.equals("madlib4.txt")) {
//     	   Scanner input = new Scanner(new File("madlib4.txt"));
//        }
// 	   if (fileName.equals("madlib5.txt")) {
//     	   Scanner input = new Scanner(new File("madlib5.txt"));
//        }
		while (input.hasNextLine()) {// check the line exist in the file
			String line = input.nextLine();// store the whole line to variable line
			Scanner words = new Scanner(line);// input Scanner is a string, read line, scan words, store to word
			while (words.hasNext()) {// check if there is another word, every single word
				String eachtoken = words.next();// do other things, check if equal to constant

				for (int i = 0; i < line.length(); i++) {// looping length of line to scan
					if (eachtoken.contains("<")) {
						wordType = eachtoken;// take word in between <>...how to do that?
						 if(eachtoken.startsWith("A")||eachtoken.startsWith("a")||eachtoken.startsWith("I")||eachtoken.startsWith("i")||eachtoken.startsWith("O")||eachtoken.startsWith("o")||eachtoken.startsWith("U")||eachtoken.startsWith("u")) {
							 System.out.println("Please type an " + wordType + ": ");//case 1: an for vowel
							 Scanner wordType1 = new Scanner(System.in);//check input word choice
							 String wordType1Name = wordType1.next();// save wordType (such as verb)
						 }else {
							 System.out.println("Please type a " + wordType + ": ");//case 2: normal "a"
							 Scanner wordType2 = new Scanner(System.in);//check input word choice
							 String wordType2Name = wordType2.next();// save wordType (such as verb)
						 }
					}
				}
				System.out.println("Your mad-lib has been created!");//complete create part
			}
		}
	}

	public static void view() {
		System.out.println("Input file name: ");
		Scanner inputFile = new Scanner(System.in);//check answer
		String inputFileName = inputFile.next();// save answer
	
		for(!inputFileName.equalsIgnoreCase(assignName)) {//if it doen't match the assigned name for the file, keep asking
	
	    System.out.println("File not found. Try again: ");//keep trying until it matches, but does this read the new input?   
	}
		//replace words in the file...how?
		//print the new paragraph to the output...how?
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Welcome to the game of Mad Libs.");
		System.out.println("I will ask you to provide various words and phrases to fill in a story.");
		System.out.println("The result will be written to an output file.");// general instructions
		// method1: asking for input words
		inputWords();
	}
}