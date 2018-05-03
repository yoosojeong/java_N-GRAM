package MakeWord;

import java.util.ArrayList;
import java.util.Scanner;

public class WordTwo {

	public static void main(String[] args) {
		System.out.print("INPUT  : ");
		Scanner txt = new Scanner(System.in);
		
		String inputStr = txt.nextLine();
		
		String[] list = inputStr.split("\\s");
		ArrayList wordList = new ArrayList();
		
		for(Object e : list) {
			wordList.add(e);
		}	
		for(int i=0; i<list.length-1; i++) {
			System.out.println(String.format("%s %s",wordList.get(i),wordList.get(i+1)));
		}

	}

}
