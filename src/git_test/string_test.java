package git_test;

import java.util.Scanner;

public class string_test {

	public static void main(String[] args) {
		
		Scanner Client_name = new Scanner(System.in);
		String client_name = "";
		System.out.print("이름을 입력하세요 : ");
		client_name = Client_name.nextLine();
		
		System.out.println("이름 : " + client_name);
		
	}
	
}
