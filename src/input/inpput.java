package input;
import java.util.Scanner;

public class inpput {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("���������������");
		String name = in.nextLine();//�ַ����͵����뷽ʽ
		System.out.println(name);
		System.out.println("������������䣺");
		int age = in.nextInt();//�������͵����뷽ʽ
		System.out.println(age);
		System.out.println("������ƻ��Ӣ�ģ�");
		String s = in.next();
		//String s = in.nextLine();//�������͵����뷽ʽ
		System.out.println(s);
		System.out.println("�����������ߣ�");
		double height = in.nextDouble();//С�����͵����뷽ʽ
		System.out.println(height);
	}

}
