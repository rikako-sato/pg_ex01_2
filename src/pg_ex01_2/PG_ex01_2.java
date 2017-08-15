
package pg_ex01_2;

public class PG_ex01_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1～20までの数字を入力してください");
		int usernum = new java.util.Scanner(System.in).nextInt();

		if(1 <= usernum && usernum <= 10){

			Romenum1_10 romenum1_10 = new Romenum1_10();
			//1～10の数字を変換するメソッド呼び出し
			romenum1_10.Romenum1_10(usernum);

		}else if(11 <= usernum && usernum <= 20){

			Romenum11_20 romenum11_20 = new Romenum11_20();
			//11～20の数字を変換するメソッド呼び出し
			romenum11_20.Romenum11_20(usernum);

		}else{
			Other other = new Other();
			other.other();
		}


	}

	}
