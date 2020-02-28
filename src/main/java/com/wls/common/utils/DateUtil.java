package com.wls.common.utils;

import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: ���ڹ�����
 * @author: MECHREVO
 * @date: 2020��2��28�� ����12:37:52
 */
public class DateUtil {
  
	   /**
	    * 
	    * @Title: randomDate 
	    * @Description: TODO
	    * @param min
	    * @param max
	    * @return ��min ��max ֮����������
	    * @return: Date
	    */
	  public static Date randomDate(Date min,Date max){
		  
		  //��ȡ��С���� �ĺ�����
		  long t1 = min.getTime();
		  long t2 = max.getTime();
		  
		  if(t1>t2){
			  return null;
		  }
		  
		  double d = Math.random();//����0-1֮���ֵ
		  long x=(long)(d*(t2-t1+1)+t1);
		  
		  return new Date(x);
	  }
}
