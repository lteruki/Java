package Lab6;

import java.util.Random;

public class random_table {
	public static void main(String[] args) {
		Random a = new Random();
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 5; j++) {
		        System.out.print(a.nextInt(10) + " ");
		    }
		    System.out.println();
		}	
	}
}
