/**
 * Program untuk menentukan apakah suatu nilai
 * berada di range byte, short, integer, atau long
 * @version 1.0 12-02-2022
 * @author Fardan Al Jihad
 */

import java.util.Scanner;

public class DataTypes {
	public static void main(String args[]){
		/* Kamus Data */
		int T, counter;
		long N;

		/* Algoritma */
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
	
		for (counter = 1; counter <= T; counter++){
			try {
				N = sc.nextLong();
				System.out.println(N + " can be fitted in:");
				if (N >= -128 && N <= 127){
					System.out.println("* byte\n* short\n* integer\n* long"); 
				} else
				if (N >= -32768 && N <= 32767){
					System.out.println("* short\n* integer\n* long");
			        } else
				if (N >= -2147483648 && N <= 2147483647){
					System.out.println("* integer\n* long");
				} else
				if (N >= -9223372036854775808L && N <= 9223372036854775807L){
					System.out.println("* long");
				}
			} catch(Exception e){
				System.out.println(sc.next() + " can't be fitted anywhere.");
			  }
		}
	}
}