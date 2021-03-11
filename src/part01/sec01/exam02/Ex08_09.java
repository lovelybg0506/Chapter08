package part01.sec01.exam02;

public class Ex08_09 {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="Java Programming";
		String str3=new String("Java Programming");
		
		System.out.println("원 문자열1==>["+str1+"]");
		System.out.println("원 문자열2==>["+str2+"]");
		System.out.println("원 문자열3==>["+str3+"]");
		
		System.out.println("문자열1==문자열2 결과:\t"+(str1==str2)); // 주소값비교
		System.out.println("문자열1==문자열3 결과:\t"+(str1==str3)); // 주소값비교
		System.out.println("문자열1.equals(문자열3) 결과:\t"+str1.equals(str3)); // 실제 값 비교
		
		
		
	}

}
