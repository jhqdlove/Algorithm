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
		//�ո񱻵����ָ���
		return scanner.next();
	} 
	
	private static String nextLine(){
		//ÿ�о���Ϊ�ָ���
		return scanner.nextLine();
	}

}
