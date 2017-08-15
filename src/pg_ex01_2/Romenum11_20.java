package pg_ex01_2;

import java.util.HashMap;
import java.util.Map;

public class Romenum11_20 {
	String kekka11_20 = null;

	public  String Romenum11_20(int usernum){


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
			if(key == usernum){
				 kekka11_20 = key + "のローマ数字は" + "Ⅹ"+value;
			}
		}
		System.out.println(kekka11_20);
		return kekka11_20;
	}


}
