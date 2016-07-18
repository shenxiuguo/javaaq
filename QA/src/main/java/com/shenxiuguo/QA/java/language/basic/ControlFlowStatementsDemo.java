package com.shenxiuguo.QA.java.language.basic;

/**
 * @author shenxg
 * 控制流
 * 1.if
 *   (if  if_else)
 * 2.switch
 * 3.while
 * 	 (while  do_while)
 * 4.for
 * 5.branch
 *   (break:xxx)
 *   (continue:xxx)
 * java 没有goto语句，但保留了goto关键字。
 * 
 */
public class ControlFlowStatementsDemo {

	public static void main(String[] args) {
//		for_break_statement();
		for_continue_statement();
	}
	
	public static void if_statement(boolean condition) {
		if(condition) {
			System.out.println("condition is true!");
		}
	}
	
	public static void if_else_statement(int number) {
		if(1 == number) {
			System.out.println("number value is 1");
		} else if( 2 == number) {
			System.out.println("number value is 2");
		} else if( 2 < number) {
			System.out.println("number value is bit than 2");
		}
	}
	
	public static void switch_statement() {
		int i = 2;
		switch (i) {
		case 0:
			System.out.println("value is 1");
			break;
		case 1:
		case 2:
			System.out.println("value is 1 or 2");
			break;
		case 3:
			System.out.println("value is 3");
			break;
		default:
			System.out.println("value is not 0, 1, 2, 3");
			break;
		}
		
		String str = "abc";
		switch (str) {
		case "abc":
			System.out.println("value is abc");
			break;
		case "efg":
			System.out.println("value is efg");
			break;
		default:
			System.out.println("value not efg, abc");
			break;
		}
	}
	
	public static void while_statement() {
		boolean condition = true;
		while(condition) {
			System.out.println("while statement");
			condition = false;
		}
	}
	
	public static void do_while_statement() {
		boolean condition = false;
		do {
			System.out.println("do while statement");
		} while(condition);
	}
	
	public static void for_statement() {
		//常用
		for(int i=0; i < 10; i++) {
			System.out.println(i);
		}
		//加强版
		int int_array[] = {0,1,2,3,4,5,6,7,8,9};
		for (int i : int_array) {
			System.out.println("加强for循环"+i);
		}
		
		//无限循环
		for(;;) {
			System.out.println("无限循环");
		}
	}

	public static void for_break_statement() {
		int i = 0, j = 0;
		
		i_for:for(;i<10; i++) {
			j = 0;
			j_for:for(;j<10;j++) {
				System.out.println("i:" +i +"j:" + j);
				if(i>2 && j>2) {
					break i_for;
				}
			}
		}
	}
	
	public static void for_continue_statement() {
		int i = 0, j = 0;
		
		i_for:for(;i<10; i++) {
			j = 0;
			j_for:for(;j<10;j++) {
				System.out.println("i:" +i +"j:" + j);
				if(i>2 && j>2) {
					continue i_for;
				}
			}
		}
	}
}
