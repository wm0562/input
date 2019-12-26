package input;

import java.util.Scanner;

public class factorial {
//  for循环
//	public static void main(String[] args){
//		float s =0;
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入n:");
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

//  do while循环
//	public static void main(String[] args){
//		float s =0;
//		float t =1;
//		int i=1;
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入n:");
//		int n = in.nextInt();
//		do{
//			t*=i;
//			i++;
//			s+=1.0/t;
//		}while(i<=n);
//		System.out.println(s);
//	}
	
//  while循环
	public static void main(String[] args){
		float s =0;
		float t =1;
		int i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入n:");
		int n = in.nextInt();
		while(i<=n){
			t*=i;
			i++;
			s+=1.0/t;
		}
		System.out.println(s);
	}

}
