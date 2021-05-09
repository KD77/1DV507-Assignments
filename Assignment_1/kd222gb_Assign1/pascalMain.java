package kd222gb_Assign1;

public class pascalMain {
	public static void main(String[] args) {
		
		pasRows(4);
		
	}
	public static int factorial(int n) {
		if(n==1 || n==0)
			return 1;
		else
			return n*factorial (n-1);
	}
	
	public static int Cnr(int n, int r) {
		return factorial(n)/(factorial(n-r)*factorial(r));
	}
	
	public static int [] pasRows(int n) {
		int[] x=new int[n+1];
		int i=0;
		for(i=0;i<=n;i++) {
			
			x[i] = Cnr(n,i);

		System.out.print(x[i]+" ");
		}
		
		return x;
	}
	

}
