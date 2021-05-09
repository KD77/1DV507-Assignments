package kd222gb__3;

import java.util.Scanner;

public class EuclideanMain {

	public static void main(String[] args) {
		System.out.println(" Provide Two Numbers");
		Scanner sc=new Scanner(System.in);
		System.out.print("M :");
		int M=sc.nextInt();
		System.out.print("N :");
		int N=sc.nextInt();
		int x=gcd(M, N);
		System.out.println("GCD"+"("+M+","+N+")"+"= "+x);
	


	}
	public static int gcd(int M,int N) {
	
		if(N==0) 
			return M;
		
		else 
			return gcd(N, M%N);
			
		
	}

}
