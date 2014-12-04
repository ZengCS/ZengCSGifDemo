package com.zcs.demo.gif.utisl;

import java.lang.reflect.Field;

public class DrawableUtil {
	/**
	 * ������Դ���ƻ�ȡ��ԴID
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public static int getDrawableIdByName(String name) throws Exception {
		Field field = Class.forName("com.zcs.demo.gif.R$drawable").getField(name);
		return field.getInt(field);
	}
}
