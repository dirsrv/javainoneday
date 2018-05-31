/* 
Examples from "Learn Java in one day and LEARN IT WELL" book 
Simple program with Strings, chapter 4
*/
//package helloworld;

public class TestClassStrings
	{
		public static void main (String[] agrs)
			{
				
				String message = "To jest test";
				String message1 =" To nie jest test";
				String message2 = "To jest test";
				
				
				
				System.out.println("this is just a test - simple Java HelloWorld program");
				
				// length() method
				
				System.out.println (message.length());
				
				//toUpperCase() and toLowerCase() methods
				
				System.out.println(message.toUpperCase());
				System.out.println("To jest test".toUpperCase());
				
				// substring() method
				
				System.out.println(message.substring(3));
				
				System.out.println(message.substring(2,7));
				
				//charAt() method
				
				System.out.println(message.charAt(1));
				
				//equals() method
				
				System.out.println(message.equals(message1));
				System.out.println(message.equals(message2));
				
				//split() method
				
				String[] splitNames = message.split(" ");
				
				System.out.println(splitNames[0]);
				
				
			}
	}
	