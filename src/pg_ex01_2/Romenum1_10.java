package pg_ex01_2;

import java.util.HashMap;
import java.util.Map;

public class Romenum1_10 {
	String kekka1_10 = null;
	public String Romenum1_10(int usernum){



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
				if(key == usernum){
					kekka1_10 =  key + "のローマ数字は" + value;
				}

			}
			System.out.println(kekka1_10);
			return  kekka1_10;

	}


}
