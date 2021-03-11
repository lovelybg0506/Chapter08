package part01.sec01.exam02;

import java.util.Scanner;

public class Ex08_05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str,strRep,strSub,strAry[];
		
		System.out.print("문자열을 입력하세요:");
		str=s.nextLine();
		
		strRep=str.replace(" ","$"); // 공백을 $로 바꿔라.
		strSub=str.substring(3,8); //0 부터카운팅, 3번째칸 문자부터 8번째칸 문자까지만 출력
		strAry=str.split(" "); // 문자를 분리
		
		System.out.println("입력 문자열 출력==>"+str);
		System.out.println("바꾼 문자열 출력==>"+strRep);
		System.out.println("입력 문자열 출력(위에서 바꿨으니 적용이될까)==>"+str);
		System.out.println("일부 문자열 출력==>"+strSub);
		
		
		for(int i=0;i<strAry.length;i++)
			System.out.println("분리할 문자열"+i+"==>"+strAry);
			
		s.close();
	}

}
