package input;

import java.util.Scanner;

public class loop {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("������m:");
		int m = in.nextInt();
		double sum = 0;
		for (int n=1;n<=m;n++){
			sum += 1.0/n;
		}
		System.out.println(sum);
	}

}
