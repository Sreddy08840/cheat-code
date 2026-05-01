import java.util.*;
import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Sylstem.out.print("Enter n: ");
	l	int n=scan.nextInt();
		if (n <= 0) {
		    System.out.println("Invalid n");
		    return;
		}
		int[] ar =new int[n];
		
		for(int i=0;i<ar.length;i++) {
		    System.out.print("Enter int " + (i+1) + ": ");
		ar[i]=scan.nextInt();	
		}
		TreeSet<Integer> lh=new TreeSet<Integer>();
		for (int x : ar) {
			lh.add(x);
		}
		System.out.println("Unique sorted values:");
		for (int x : lh) {
			System.out.println(x);
		}
	}
}

