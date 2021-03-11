package part01.sec01.exam02;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		
		System.out.print("문자열입력 ==>");
		str=s.nextLine();
		System.out.print("출력문자열 ==>");
		
		for(int i=0;i<str.length();i++) {
			//입력된 문자중에 영문자 ' o ' 라는 문자가 있는가
			if(str.charAt(i)=='o') 
				System.out.printf("%c",'$');
			else
				System.out.printf("%c",str.charAt(i));
		}
		System.out.println("\n입력된 문자열:"+str);
//		System.out.println("\n될까?:"+str[0]='A');//string은 내부적으로 배열로 처리하지만 
		s.close();								// 우리가 그 값을 바꿀수는없다.
	}

}
