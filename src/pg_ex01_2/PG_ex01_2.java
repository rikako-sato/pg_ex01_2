
package pg_ex01_2;
import java.util.HashMap;
import java.util.Map;
public class PG_ex01_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1～20までの数字を入力してください");
		int usernum = new java.util.Scanner(System.in).nextInt();

		if(1 <= usernum && usernum <= 10){
			//1～10の数字を変換するメソッド呼び出し
			Romenum1_10(usernum);
		}else if(11 <= usernum && usernum <= 20){
			//11～20の数字を変換するメソッド呼び出し
			Romenum11_20(usernum);

		}else{
			System.out.println("変換できません");
		}


	}
	//1～10の数字を変換するメソッド
	public static void Romenum1_10(int usernum1_10){

		Map<Integer,String>translate = new HashMap<Integer,String>();
		translate.put(1, "Ⅰ");
		translate.put(2, "Ⅱ");
		translate.put(3, "Ⅲ");
		translate.put(4, "Ⅳ");
		translate.put(5, "Ⅴ");
		translate.put(6, "Ⅵ");
		translate.put(7, "Ⅶ");
		translate.put(8, "Ⅷ");
		translate.put(9, "Ⅸ");
		translate.put(10, "Ⅹ");

			//for文で該当の数字を探す
			for(Integer key :translate.keySet()){
				String value = translate.get(key);
				if(key == usernum1_10){
				System.out.println(key + "のローマ数字は" + value);
				}
			}
	}
	//11～20の数字を変換するメソッド
	public static void Romenum11_20(int usernum11_20){

		Map<Integer,String>translate = new HashMap<Integer,String>();
		translate.put(11, "Ⅰ");
		translate.put(12, "Ⅱ");
		translate.put(13, "Ⅲ");
		translate.put(14, "Ⅳ");
		translate.put(15, "Ⅴ");
		translate.put(16, "Ⅵ");
		translate.put(17, "Ⅶ");
		translate.put(18, "Ⅷ");
		translate.put(19, "Ⅸ");
		translate.put(20, "Ⅹ");

		//for文で該当の数字を探す
		for(Integer key :translate.keySet()){
			String value = translate.get(key);
			if(key == usernum11_20){
			System.out.println(key + "のローマ数字は" + "Ⅹ"+value);
			}
		}

	}
}
