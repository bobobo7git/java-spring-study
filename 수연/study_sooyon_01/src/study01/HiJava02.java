package study01;
import java.util.Scanner;

public class HiJava02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		// 이름을 입력하세요
		String name = sc.next();
		
		System.out.println("나이를 입력하세요 : ");
		// 나이를 입력하세요
		int age = sc.nextInt();
		
		System.out.println("안녕하세요, 제 이름은 " + name + "입니다. 나이는 " + age + "살 입니다.");
		
	}

}
