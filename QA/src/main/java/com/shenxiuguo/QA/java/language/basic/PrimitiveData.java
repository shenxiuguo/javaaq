package com.shenxiuguo.QA.java.language.basic;

import java.math.BigInteger;

/**
 * 八类基本数据类型
 * 1.byte<br/>
 * 2.short<br/>
 * 3.int<br/>
 * 4.long<br/>
 * 5.float<br/>
 * 6.double<br/>
 * 7.boolean<br/>
 * 8.char<br/>
 * 
 * 基础数据类型的【自动装包/自动拆包】
 * @author shenx
 *
 */
public class PrimitiveData {
	private byte byte_var;
	private Byte Byte_var;
	
	private short short_var;
	private Short Short_var;
	
	private int int_var;
	private Integer Integer_var;
	
	private long long_var;
	private Long Long_var;
	
	private float float_var;
	private Float Float_var;
	
	private double double_var;
	private Double Double_var;
	
	private boolean boolean_var;
	private Boolean Boolean_var;
	
	private char char_var;
	private Character Character_var;
	
	/**
	 * 自动装包/自动拆包(AutoBoxing/UnBoxing)
	 */
	public void boxing() {
		byte_var = Byte_var;
		Byte_var = byte_var;
		
		short_var = Short_var;
		Short_var = short_var;
		
		int_var = Integer_var;
		Integer_var = int_var;
		
		long_var = Long_var;
		Long_var = long_var;
		
		float_var = Float_var;
		Float_var = float_var;
		
		double_var = Double_var;
		Double_var = double_var;
		
		boolean_var = Boolean_var;
		Boolean_var = boolean_var;
		
		char_var = Character_var;
		Character_var = char_var;
	}
	
	/**
	 * 基础类型文本赋值<br/>
	 * 一些不常用的赋值方式。
	 * 0b1000:二进制
	 * 010:八进制
	 * 8:十进制
	 * 0xF:16进制
	 * _ : 分隔符，有利于月度浏览
	 * f F : 浮点数后缀
	 * p : 
	 * d D : double后缀
	 * e E : 科学计数分隔符 (10的指数)
	 */
	public void primitiveValueAssignment() {
		byte_var = 0;
		byte_var = 0b1111111;
		byte_var = 0b0111_1111;
		byte_var = 0xF;
		
		
		short_var = 0;
		short_var = 0b11;
		short_var = 0x1111;
		short_var = 0x11_11;
		
		int_var = 0;
		int_var = 0x10; // 16
		int_var = 0b1000; // 8
		
		long_var = 0;
		long_var = 0L;
		long_var = 0xFFFFFFFFFFFFFFFFL;
		long_var = 0xFFFF_FFFF;
		
		
		float_var = 0.0f;
		float_var = 0.0F;
		float_var = 1.234e2F;
		float_var = 0x1.0p-126f;
		
		double_var = 0.0;
		double_var = 0.0d;
		double_var = 0.0D;
		double_var = 123_456.012_567D;
		double_var = 1.234e2;
		double_var = 1.234E2F;
		
		char_var = 'a';
		char_var = '\u0000';
		char_var = 8;
		char_var = 0b11;
		
		boolean_var = true;
		boolean_var = false;
		boolean_var = Boolean.TRUE;
		boolean_var = Boolean.FALSE;
	}
	
	/**
	 * 基础类型中的特殊值，主要指对应的类静态变量<br/>
	 * MAX_VALUE : 最大值
	 * MIN_VALUE : 最小值
	 * BYTES : 对应的字节数
	 * SIZE : bit位数，占用多少位，二进制位数
	 * MAX_EXPONENT:最大指数值
	 * MIN_EXPONENT:最小指数值
	 */
	public void specialValue() {
		byte_var = Byte.MAX_VALUE;
		byte_var = Byte.MIN_VALUE;
		byte_var = Byte.BYTES;
		
		System.out.println("Byte.MAX_VALUE:" + Byte.MAX_VALUE);
		System.out.println("0b0111_1111:" + 0b0111_1111);
		System.out.println("0x7F:" + 0x7F);
		System.out.println("Byte.MIN_VALUE:" + Byte.MIN_VALUE);
		System.out.println("-0b1000_0000:" + -0b1000_0000);
		System.out.println("-0x80:" + -0x80);
		System.out.println("Byte.BYTES:" + Byte.BYTES);
		System.out.println();
		
		short_var = Short.MAX_VALUE;
		short_var = Short.MIN_VALUE;
		short_var = Short.BYTES;
		System.out.println("Short.MAX_VALUE:" + Short.MAX_VALUE);
		System.out.println("0b01111111_1111111:" + 0b01111111_11111111);
		System.out.println("0x7FFF:" + 0x7FFF);
		System.out.println("077777:" + 077777);
		System.out.println("Short.MIN_VALUE:" + Short.MIN_VALUE);
		System.out.println("-0b10000000_00000000:" + -0b10000000_00000000);
		System.out.println("-0x8000:" + -0x8000);
		System.out.println("Short.BYTES:" + Short.BYTES);
		System.out.println();
		
		int_var = Integer.MAX_VALUE;
		int_var = Integer.MIN_VALUE;
		int_var = Integer.BYTES;
		int_var = Integer.SIZE;
		System.out.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);
		System.out.println("Integer.toHexString(Integer.MAX_VALUE):0x" + Integer.toHexString(Integer.MAX_VALUE));
		System.out.println("Integer.toBinaryString(Integer.MAX_VALUE)0b:" + Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println("Integer.toOctalString(Integer.MAX_VALUE):0" + Integer.toOctalString(Integer.MAX_VALUE));
		System.out.println("Integer.MIN_VALUE:" + Integer.MIN_VALUE);
		System.out.println("Integer.toHexString(Integer.MIN_VALUE):0x" + Integer.toHexString(Integer.MIN_VALUE));
		System.out.println("Integer.toBinaryString(Integer.MIN_VALUE)0b:" + Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("Integer.toOctalString(Integer.MIN_VALUE):0" + Integer.toOctalString(Integer.MIN_VALUE));
		System.out.println("Integer.BYTES:" + Integer.BYTES);
		System.out.println("Integer.SIZE:" + Integer.SIZE);
		System.out.println();
		
		long_var = Long.MAX_VALUE;
		long_var = Long.MIN_VALUE;
		long_var = Long.BYTES;
		long_var = Long.SIZE;
		System.out.println("Long.MAX_VALUE:" + Long.MAX_VALUE);
		System.out.println("Long.toHexString(Long.MAX_VALUE):0x" + Long.toHexString(Long.MAX_VALUE));
		System.out.println("Long.toBinaryString(Long.MAX_VALUE)0b:" + Long.toBinaryString(Long.MAX_VALUE));
		System.out.println("Long.toOctalString(Long.MAX_VALUE):0" + Long.toOctalString(Long.MAX_VALUE));
		System.out.println("Long.MIN_VALUE:" + Long.MIN_VALUE);
		System.out.println("Long.toHexString(Long.MIN_VALUE):0x" + Long.toHexString(Long.MIN_VALUE));
		System.out.println("Long.toBinaryString(Long.MIN_VALUE)0b:" + Long.toBinaryString(Long.MIN_VALUE));
		System.out.println("Long.toOctalString(Long.MIN_VALUE):0" + Long.toOctalString(Long.MIN_VALUE));
		System.out.println("Long.BYTES:" + Long.BYTES);
		System.out.println("Long.SIZE:" + Long.SIZE);
		System.out.println();
		
		float_var = Float.MAX_VALUE;
		float_var = Float.NEGATIVE_INFINITY;
		float_var = Float.MIN_VALUE;
		float_var = Float.MIN_NORMAL;
		float_var = Float.POSITIVE_INFINITY;
		float_var = Float.MAX_EXPONENT;
		float_var = Float.MIN_EXPONENT;
		float_var = Float.NaN;
		float_var = Float.BYTES;
		float_var = Float.SIZE;
		System.out.println("Float.MAX_VALUE:"+Float.MAX_VALUE);
		System.out.println("Float.NEGATIVE_INFINITY:"+Float.NEGATIVE_INFINITY);
		System.out.println("Float.MIN_VALUE:"+Float.MIN_VALUE);
		System.out.println("Float.MIN_NORMAL:"+Float.MIN_NORMAL);
		System.out.println("Float.POSITIVE_INFINITY:"+Float.POSITIVE_INFINITY);
		System.out.println("Float.MAX_EXPONENT:"+Float.MAX_EXPONENT);
		System.out.println("Float.MIN_EXPONENT:"+Float.MIN_EXPONENT);
		System.out.println("Float.NaN:"+Float.NaN);
		System.out.println("Float.BYTES:"+Float.BYTES);
		System.out.println("Float.SIZE:"+Float.SIZE);
		System.out.println();
		
		double_var = Double.MAX_VALUE;
		double_var = Double.NEGATIVE_INFINITY;
		double_var = Double.MIN_VALUE;
		double_var = Double.MIN_NORMAL;
		double_var = Double.POSITIVE_INFINITY;
		double_var = Double.MAX_EXPONENT;
		double_var = Double.MIN_EXPONENT;
		double_var = Double.NaN;
		double_var = Double.BYTES;
		double_var = Double.SIZE;
		System.out.println("Double.MAX_VALUE:"+Double.MAX_VALUE);
		System.out.println("Double.NEGATIVE_INFINITY:"+Double.NEGATIVE_INFINITY);
		System.out.println("Double.MIN_VALUE:"+Double.MIN_VALUE);
		System.out.println("Double.MIN_NORMAL:"+Double.MIN_NORMAL);
		System.out.println("Double.POSITIVE_INFINITY:"+Double.POSITIVE_INFINITY);
		System.out.println("Double.MAX_EXPONENT:"+Double.MAX_EXPONENT);
		System.out.println("Double.MIN_EXPONENT:"+Double.MIN_EXPONENT);
		System.out.println("Double.NaN:"+Double.NaN);
		System.out.println("Double.BYTES:"+Double.BYTES);
		System.out.println("Double.SIZE:"+Double.SIZE);
		System.out.println();
		
		boolean_var = Boolean.TRUE;
		boolean_var = Boolean.FALSE;
		System.out.println("Boolean.TRUE:" + Boolean.TRUE);
		System.out.println("Boolean.FALSE:" + Boolean.FALSE);
		
		//字符类型的类常量很多，在需要使用时再进行查询或学习。
		//char_var = Character.XXXXXXX
		
	}
	
	public static void main(String[] args) {
		PrimitiveData pd = new PrimitiveData();
		pd.specialValue();
	}
}
