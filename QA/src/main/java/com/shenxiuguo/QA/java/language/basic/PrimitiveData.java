package com.shenxiuguo.QA.java.language.basic;

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
		
		short_var = Short.MAX_VALUE;
		short_var = Short.MIN_VALUE;
		short_var = Short.BYTES;
		System.out.println("Short.MAX_VALUE:" + Short.MAX_VALUE);
		System.out.println("0b01111111_1111111:" + 0b01111111_11111111);
		System.out.println("Short.MIN_VALUE:" + Short.MIN_VALUE);
		System.out.println("-0b10000000_00000000" + -0b10000000_00000000);
		System.out.println("Short.BYTES:" + Short.BYTES);
		
	}
	
	public static void main(String[] args) {
		PrimitiveData pd = new PrimitiveData();
		pd.specialValue();
	}
}
