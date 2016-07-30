package java_base;

import java.util.Scanner;


public class IO {
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args){
		while(scanner.hasNext())
		{
		    String x=next();
		    System.out.println(x);
		}
	} 
	
	private static String next(){
		//空格被当做分隔符
		return scanner.next();
	} 
	
	private static String nextLine(){
		//每行就是为分隔符
		return scanner.nextLine();
	}

}
