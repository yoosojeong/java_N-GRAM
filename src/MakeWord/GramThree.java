package MakeWord;

import java.util.ArrayList;
import java.util.Scanner;

public class GramThree {
	public static void main(String[] args) {	
		String inputStr;
		ArrayList list = new ArrayList();
		Scanner txt = new Scanner(System.in);
		
		System.out.print("INPUT  : ");
		inputStr = txt.nextLine();
		
		for(int i = 0; i <= inputStr.length()-1; i++) {
			list.add(inputStr.charAt(i));
		}
		for(int i = 0; i<list.size()-2; i++) {
			System.out.println(String.format("%s%s%s", list.get(i),list.get(i+1),list.get(i+2)));
		}
	}
}