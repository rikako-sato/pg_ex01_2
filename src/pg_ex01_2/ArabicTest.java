package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicTest {

	@Test
	public void testToRoman() throws Exception{
		//1~20の数字が入力された結果が期待通りか判定する
		assertEquals("I", Arabic.toRoman(1));
		assertEquals("II", Arabic.toRoman(2));
		assertEquals("III", Arabic.toRoman(3));
		assertEquals("IV", Arabic.toRoman(4));
		assertEquals("V", Arabic.toRoman(5));
		assertEquals("VI", Arabic.toRoman(6));
		assertEquals("IX", Arabic.toRoman(9));
		assertEquals("X", Arabic.toRoman(10));
		assertEquals("XI", Arabic.toRoman(11));
		assertEquals("XIX", Arabic.toRoman(19));
		assertEquals("XX", Arabic.toRoman(20));
	}

	@Test
	public void testToRomanOutOfRange() throws Exception{
		//1~20以外の文字が入力された結果が期待通りか判定する
		assertEquals("変換できません", Arabic.toRoman(0));
		assertEquals("変換できません", Arabic.toRoman(21));
	}

}
