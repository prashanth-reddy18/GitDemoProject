package gitKT;

import java.util.Scanner;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i;
		System.out.print("Enter n value:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i=i*2) {
			System.out.println(i);
		}
		sc.close();
	}
	

}
