package input;
import java.util.Scanner;

public class add {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("������a��");
		int a = in.nextInt();
		System.out.println(a);
		
		System.out.println("������b��");
		int b = in.nextInt();
		System.out.println(b);
		
		int x = a + b;
		System.out.println(x);
	}

}
