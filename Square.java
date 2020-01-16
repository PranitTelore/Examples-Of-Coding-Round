import java.util.Scanner;

/*
 * Find the square of the number without using multiplication
 * 
 * */

public class Square {

	private int findSquare(int n) {
		
		// if the value is negative then convert it into its actula value 
		// i.e. convert it into positive value
		
		n=Math.abs(n);
		
		int sq=0;   // to store square
		
		for(int i=0;i<n;i++) {
			sq+=n;
		}

		return sq;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int n = sc.nextInt();

		Square s = new Square();
		int sq =s.findSquare(n);
		
		System.out.println("Square of NO "+n+" is :"+sq);

	}

}
