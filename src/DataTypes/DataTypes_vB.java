/**
 * 
 * @version 1.0 12-02-2022
 * @author Fardan Al Jihad
 */

import java.util.Scanner;

public class DataTypes_vB {
	public static void main(String args[]){
		/* Kamus Data */
		int T;
		int indeks;

		/* Algoritma */
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan banyak kasus yang akan diuji : ");
		T = sc.nextInt();
		System.out.println("Kasus yang akan diuji : " + T);
		int[] N = new int[T];
		
		for (indeks = 0; indeks < T; indeks++){
			try {
				N[indeks] = sc.nextInt();
			} catch (Exception e){
				System.out.println(sc.next() + " can't be fitted anywhere.");
			  }
		}

		for (indeks = 0; indeks < T; indeks++){
			if (N[indeks] >= -128 && N[indeks] <= 127){
				System.out.println(N[indeks] + " can be fitted in:");
				System.out.println("* byte\n* short\n* integer\n* long"); 
			} else if (N[indeks] >= -32768 && N[indeks] <= 32767){
			       		System.out.println(N[indeks] + " can be fitted in:");
					System.out.println("* short\n* integer\n* long");
			       } else if (N[indeks] >= -2147483648 && N[indeks] <= 2147483647){
						System.out.println(N[indeks] + " can be fitted in:");
						System.out.println("* integer\n* long");
				      } else if (N[indeks] >= -9223372036854775808L && N[indeks] <= 9223372036854775807L){
							System.out.println(N[indeks] + " can be fitted in:");
							System.out.println("* long");
				      	     } else {
							System.out.println(N[indeks] + "can't be fitted anywhere.");
					       }
		}
	}
}