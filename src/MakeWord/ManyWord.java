package MakeWord;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class ManyWord {

	public static void main(String[] args) {
		int result = 0;
		int sum = 0;
		String wordM = null;
		
		System.out.println("WHAT DO YOU THINK MANY WORD?");
		
		Scanner txt = new Scanner(System.in); 
		String inputStr = txt.nextLine();
		
		String[] word = inputStr.split("\\s");
		
		ArrayList listSame = new ArrayList();
		TreeSet listEquals = new TreeSet();
		
		for(String e : word) {
			listSame.add(e);
			listEquals.add(e);
		}
		
		Collections.sort(listSame); 
		System.out.println(listSame);
		System.out.println(listEquals);
		
		
		for(Object e : listEquals) {
				for(int i=0; i<listSame.size(); i++) {
					if(e.equals(listSame.get(i))) {
						sum++;
						if(result<sum) {
							result = sum;
							wordM = (String)e;
						}
					}else {
						if(result < sum) {
							result = sum;
							wordM = (String)e;
						}
						sum = 0;
					}
				}
			}
		System.out.println(String.format("%s's count is %s",wordM, result));
		}
	}
