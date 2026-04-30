package com.internshala;
import java.util.Scanner;
/*You are given a sentence as a string in Java. Your task is to reverse the order of the words in the 
 * sentence while preserving the order of the characters within each word.*/
public class question3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the sentance?");
		String sen=scanner.nextLine();
		String [] words=sen.split(" ");
		for(int i=(words.length-1);i>=0;i--) {
			System.out.println(words[i]+" ");
		}
		scanner.close();
		
	}
}
