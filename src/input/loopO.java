package input;

public class loopO {
	public static void main(String args[]){
		double a=1,b=1,c=0;
		System.out.println("do-while—≠ª∑:");
		do{
		c=b+c;
		a++;
		b=(1.0/a)*b;
		}
		while(a<=20);
		System.out.println(" "+c);
		System.out.println("for—≠ª∑:");
		for(c=0,b=1,a=1;a<=20;a++)
		{
		b*=(1.0/a);
		c+=b;
		}
		System.out.println(" "+c);
		}
}
