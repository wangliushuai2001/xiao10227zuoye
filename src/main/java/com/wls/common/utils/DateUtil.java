package com.wls.common.utils;

import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: MECHREVO
 * @date: 2020年2月28日 下午12:37:52
 */
public class DateUtil {
  
	   /**
	    * 
	    * @Title: randomDate 
	    * @Description: TODO
	    * @param min
	    * @param max
	    * @return 在min 和max 之间的随机日期
	    * @return: Date
	    */
	  public static Date randomDate(Date min,Date max){
		  
		  //获取最小日期 的毫秒数
		  long t1 = min.getTime();
		  long t2 = max.getTime();
		  
		  if(t1>t2){
			  return null;
		  }
		  
		  double d = Math.random();//返回0-1之间的值
		  long x=(long)(d*(t2-t1+1)+t1);
		  
		  return new Date(x);
	  }
}
