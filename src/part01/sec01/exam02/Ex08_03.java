package part01.sec01.exam02;

import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력==>");
		str=s.nextLine();
		System.out.print("출력 문자열==>");
		
		if(!str.startsWith("(")) // a,b,c) // 좌측괄호 부터 시작했는가
			System.out.printf("(");
		
		
		for(int i=0;i<str.length();i++)	// 문자열 입력받은걸 출력하는 문장들
			System.out.printf("%c",str.charAt(i));
		
		
		if(!str.endsWith(")")) // 문자열 끝에 ) 가 있는가
			System.out.printf(")");
			
		s.close();
			
	}

}
