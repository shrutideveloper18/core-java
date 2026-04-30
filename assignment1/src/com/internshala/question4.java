package com.internshala;
import java.util.Scanner;
/*You are tasked with writing a Java program to analyze daily temperature data for a week. The program should take the
following input:
The number of days in the week (e.g., 7 for a full week).
The daily high temperatures for each day.
Your program should calculate and display the following information:
The average daily temperature.
The highest daily temperature.
The lowest daily temperature.
The number of days with temperatures above 80 degrees Fahrenheit.
The number of days with temperatures below 60 degrees Fahrenheit.
Write a Java program that accomplishes this task.*/

public class question4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of days:");
		int noofdays=s.nextInt();
		int [] temperature=new int[noofdays];
		for(int i=0;i<noofdays;i++) {
			System.out.println("whats the highest temperature of day"+(i+1));
			temperature[i]=s.nextInt();
		}
		int sum=0;
		int highest=0;
		int lowest=temperature[0];
		int count80=0;
		int count60=0;
		for(int i=0;i<temperature.length;i++) {
			sum+=temperature[i];
			if(temperature[i]>highest) {
				highest=temperature[i];
			}
			if(lowest>temperature[i]) {
				lowest=temperature[i];
			}
			if(temperature[i]>80) {
				count80+=1;
			}
			if(temperature[i]<60) {
				count60+=1;
			}
		}
		int avg=sum/noofdays;
		System.out.println("the avg temperature is "+avg);
		System.out.println("the highest temperature is "+highest);
		System.out.println("the lowest temperature is "+lowest);
		System.out.println("the no of days above 80 "+count80);
		System.out.println("the no of days below 60 "+count60);
		s.close();
	}
}
