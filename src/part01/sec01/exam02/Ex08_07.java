package part01.sec01.exam02;

public class Ex08_07 {

	public static void main(String[] args) {
		String str=" 한글 ABCD efgh ";
		String result=" ";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') 	// 공백이 아니면 누적시켜라 , 즉 공백을 제외한 문자열을 붙여라
				result=result+(str.charAt(i));  // 한글ABCDefgh, 공백은 제외됨
		}
		
		System.out.println("원 문자열==>["+str+"]");
		System.out.println("공백제거한값==>["+result+"]");// 근데 result 초기값이 공백이라 맨 앞에 나옴.
		System.out.println("맨앞,맨뒤공백제거==>["+result.trim()+"]");
		System.out.println("원 문자열==>["+str+"]");

	}

}
