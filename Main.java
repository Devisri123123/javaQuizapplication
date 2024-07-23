package com.quizApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Quiz q = new Quiz();
		q.logic();
	}
}
 class Quiz{
	 Scanner input = new Scanner(System.in);
     int correctAns = 0;
     int wrongAns = 0;
	 public void logic() {
		  Questions q1 = new Questions("which one is the primitive data type in Java?", "A. Arrays", "B. Character", "C. Collections", "D. Class");
		  Questions q2 = new Questions("what is the deafult value of Object in Java?", "A. Zero", "B. True", "C. Null", "D. False");
		  Questions q3 = new Questions("which concepts are there in OPPs from the following?", "A. Arrays", "B. Abstraction", "C. Collections", "D. none of these");
		  Questions q4 = new Questions("In Java the class can have whice access modifier?", "A. public", "B. pravite", "C. protected", "D. none of these");
		  Questions q5 = new Questions("What are the classes that implements List in Java?", "A. Map ", "B. Queue", "C. Dequeu", "D. Stack");
		  
		  HashMap<Questions, Character> hp = new HashMap<>();
		  hp.put(q1, 'B');
		  hp.put(q2, 'C');
		  hp.put(q3, 'B');
		  hp.put(q4, 'A');
		  hp.put(q5, 'D');
		  for (Map.Entry<Questions, Character> map : hp.entrySet()) {
			  System.out.println(map.getKey().getQuestion());
			  System.out.println(map.getKey().getOption1());
			  System.out.println(map.getKey().getOption2());
			  System.out.println(map.getKey().getOption3());
			  System.out.println(map.getKey().getOption4());
			 
			 System.out.println("Enter your Option: ");
			 Character ans = input.next().charAt(0);
			  int cans = Character.compare(ans, map.getValue());
			  if(cans==0) {
				  System.out.println("correct");
				  correctAns++;
			  }
			  else {
				  System.out.println("wrong!!");
				  wrongAns++;
			  }
			  
				}	 
		  System.out.println();
		  System.out.println("------------Result------------");
		  System.out.println("Total number of questions---> " +hp.size());
		  System.out.println("No.of questions answered corectly---> " +correctAns);
		  System.out.println("No.of Worng answered questions---> " +wrongAns);
		  int percentage = (100*correctAns)/hp.size();
		  System.out.println("Percentage:" +percentage);
		  if(percentage>=80) {
			  System.out.println("Good performance!!");
		  }
		  else if(percentage>=60) {
			  System.out.println("Average performance!!");
		  }
		  else if(percentage>=40)
		  {
			  System.out.println("Less performancce!!");
			  }
		  else {
			  System.out.println("very poor, Better luck next time!!");
		  }
		  }
	 
	 
 }