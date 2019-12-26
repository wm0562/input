package input;
import java.util.Scanner;

public class inpput {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的姓名：");
		String name = in.nextLine();//字符类型的输入方式
		System.out.println(name);
		System.out.println("请输入你的年龄：");
		int age = in.nextInt();//整数类型的输入方式
		System.out.println(age);
		System.out.println("请输入苹果英文：");
		String s = in.next();
		//String s = in.nextLine();//整数类型的输入方式
		System.out.println(s);
		System.out.println("请输入你的身高：");
		double height = in.nextDouble();//小数类型的输入方式
		System.out.println(height);
	}

}
