package part01.sec01.exam02;

public class Ex08_04 {

	public static void main(String[] args) {
		String str="JAVA공부,JAVAstudy";
		
		System.out.println("문자열==>"+str);
		
		System.out.print("제일 처음 나오는 JAVA 위치==>");
		System.out.println(str.indexOf("JAVA"));	//0, 0부터 카운팅함.
		
		System.out.print("마지막에 나오는 JAVA 위치==>");
		System.out.println(str.lastIndexOf("JAVA"));	//7
		
		

	}

}
