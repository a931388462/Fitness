package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
	
	/***
	 * 日期类型转字符
	 * @param date
	 * @param format yyyy-MM-dd、yyyy-MM-ddHH:mm:ss、yyyy年MM月dd日 HH:mm:ss
	 * @return
	 */
	public static String date2String(Date date,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
}
