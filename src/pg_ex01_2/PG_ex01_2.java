package pg_ex01_2;

import java.util.Scanner;

public class PG_ex01_2 {

	public static void main(String[] args) {
		System.out.println("1～20までの数字を入力してください");
		int usernum = new Scanner(System.in).nextInt();

		System.out.println(usernum + "のローマ数字は" + Arabic.toRoman(usernum));

	}
}