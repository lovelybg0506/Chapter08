package part01.sec01.exam03;

import java.util.Scanner;

public class Problem08_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String in,out="";
		char ch;
		int count,i;
		int diff='a'-'A';//97(a)-65(A)==>32
		
		System.out.printf("문자열을 입력하세요:");
		in=s.nextLine();
		count=in.length();
		
		for(i=0;i<count;i++) {
			ch=in.charAt(i);
			if(ch>='A'&&ch<='Z')
				out+=(char)(ch+diff);
			else if(ch>='a'&&ch<='z')
				out+=(char)(ch-diff);
			else
				out+=ch; //영문자가 아닌 다른문자면 그냥 둔다는 코드
		}
		System.out.printf("변환된 문자열==>%s\n",out);
		
		s.close();
		}
		
	}




//==
//for(int i=0;i<str.length();i++) {
//	if(str.charAt(i) != ' ') 	// 공백이 아니면 누적시켜라 , 즉 공백을 제외한 문자열을 붙여라
//		result=result+(str.charAt(i));  // 한글ABCDefgh, 공백은 제외됨