package com.shenxiuguo.QA.java.language.basic;

import java.io.File;

/**
 * java的四类变量<br/>
 * 1.Class Variables (Static Fields)  <br/>
 *   类的变量<br/>
 * 2.Instance Variables (Non-Static Fields)<br/>
 *   对象实例变量<br/>
 * 3.Local Variables <br/>
 *   本地变量<br/>
 * 4.Parameters <br/>
 *   参数变量<br/>
 *   
 * @author shenxg
 *
 */
public class Variables {
	/**
	 * Class Variables (Static Fields) 
	 * 类的变量
	 */
	@SuppressWarnings("unused")
	private static File cls_var;
	
	/**
	 * Local Variables 
	 * 本地变量
	 */
	@SuppressWarnings("unused")
	private void functionForLocalVariable() {
		File local_var;
	}
}
