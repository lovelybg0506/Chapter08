package part01.sec01.exam02;

public class Ex08_08 {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="Java IT Language";
		String str3="Java Programming";
		
		System.out.println("원 문자열1==>"+str1);
		System.out.println("원 문자열2==>"+str2);

		System.out.println(str1.compareTo(str2)); 
//		문자열 두개를 첫번째 자리부터 비교하다가
//		가장 먼저 만나는 다른 문자 자리 끼리의 아스키 코드값의 차이를 반환한다고 나왔어요 Java 
//		까지는 맞는데 P랑 I 가 다르니까 I=73 P=80 이라서 7이 나오네요
		System.out.println(str1.contains("Java")); //contains ,포함하는가 true or false
	}

}
