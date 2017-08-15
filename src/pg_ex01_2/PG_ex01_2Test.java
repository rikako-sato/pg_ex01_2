package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PG_ex01_2Test {

	@Test
	public void tes1_10() throws Exception{
		//1~10の数字が入力された結果が期待通りか判定する
		Romenum1_10 romenum1_10 = new Romenum1_10();

		assertEquals( 1 + "のローマ数字は" + "Ⅰ", romenum1_10.Romenum1_10(1));
		assertEquals( 2 + "のローマ数字は" + "Ⅱ", romenum1_10.Romenum1_10(2));
		assertEquals( 3 + "のローマ数字は" + "Ⅲ", romenum1_10.Romenum1_10(3));
		assertEquals( 4 + "のローマ数字は" + "Ⅳ", romenum1_10.Romenum1_10(4));
		assertEquals( 5 + "のローマ数字は" + "Ⅴ", romenum1_10.Romenum1_10(5));
		assertEquals( 6 + "のローマ数字は" + "Ⅵ", romenum1_10.Romenum1_10(6));
		assertEquals( 7 + "のローマ数字は" + "Ⅶ", romenum1_10.Romenum1_10(7));
		assertEquals( 8 + "のローマ数字は" + "Ⅷ", romenum1_10.Romenum1_10(8));
		assertEquals( 9 + "のローマ数字は" + "Ⅸ", romenum1_10.Romenum1_10(9));
		assertEquals( 10 + "のローマ数字は" + "Ⅹ", romenum1_10.Romenum1_10(10));

	}

	@Test
	public void test11_20() throws Exception{
		//11~20の数字が入力された結果が期待通りか判定する
		Romenum11_20 romenum11_20 = new Romenum11_20();

		assertEquals( 11 +  "のローマ数字は" + "Ⅹ" + "Ⅰ", romenum11_20.Romenum11_20(11));
		assertEquals( 12 +  "のローマ数字は" + "Ⅹ"+ "Ⅱ", romenum11_20.Romenum11_20(12));
		assertEquals( 13 +  "のローマ数字は" + "Ⅹ"+ "Ⅲ", romenum11_20.Romenum11_20(13));
		assertEquals( 14 + "のローマ数字は" + "Ⅹ" + "Ⅳ", romenum11_20.Romenum11_20(14));
		assertEquals( 15 + "のローマ数字は" + "Ⅹ" + "Ⅴ", romenum11_20.Romenum11_20(15));
		assertEquals( 16 + "のローマ数字は" + "Ⅹ" + "Ⅵ", romenum11_20.Romenum11_20(16));
		assertEquals( 17 +  "のローマ数字は" + "Ⅹ" + "Ⅶ", romenum11_20.Romenum11_20(17));
		assertEquals( 18 +  "のローマ数字は" + "Ⅹ" + "Ⅷ", romenum11_20.Romenum11_20(18));
		assertEquals( 19 +  "のローマ数字は" + "Ⅹ" + "Ⅸ", romenum11_20.Romenum11_20(19));
		assertEquals( 20 +  "のローマ数字は" + "Ⅹ"+ "Ⅹ", romenum11_20.Romenum11_20(20));

	}
	@Test
	public void other() throws Exception{
		//1~20以外の文字が入力された結果が期待通りか判定する
		Other other = new Other();
		assertEquals("変換できません",other.other());
	}



}
