package input;

import java.util.Scanner;

public class factorial {
//  forѭ��
//	public static void main(String[] args){
//		float s =0;
//		Scanner in = new Scanner(System.in);
//		System.out.println("������n:");
//		int n = in.nextInt();
//		for(int i=1;i<=n;i++){
//			float t = 1;
//			for(int j=1;j<=i;j++){
//				t*=j;
//			}
//			s+=1.0/t;
//		}
//		System.out.println(s);
//	}

//  do whileѭ��
//	public static void main(String[] args){
//		float s =0;
//		float t =1;
//		int i=1;
//		Scanner in = new Scanner(System.in);
//		System.out.println("������n:");
//		int n = in.nextInt();
//		do{
//			t*=i;
//			i++;
//			s+=1.0/t;
//		}while(i<=n);
//		System.out.println(s);
//	}
	
//  whileѭ��
	public static void main(String[] args){
		float s =0;
		float t =1;
		int i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("������n:");
		int n = in.nextInt();
		while(i<=n){
			t*=i;
			i++;
			s+=1.0/t;
		}
		System.out.println(s);
	}

}
