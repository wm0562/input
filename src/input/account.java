package input;

import java.util.Scanner;

public class account {
	public static void main(String[] args){
		int count0 = 0;
		int count1 = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String str = in.nextLine();
		System.out.println(str);
		String[] arr = new String[str.length()];
		System.out.println(str.length());
		System.out.println(arr[2]);
		for(int i=0;i<str.length();i++){
			System.out.println(arr[i]);
			//×Ö·û´®ÓÃ"",×Ö·ûÓÃ''
			if(arr[i]=="0"){
				count0+=1;
			}else if(arr[i]=="1"){
				count1+=1;
			}
		}
		System.out.println(+count0+","+count1);
		
	}

}
