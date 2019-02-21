package cn.sxt.oop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TestCalendar01 {

	public static void main(String[] args) throws ParseException {
		String c="2019-2-16";
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date data=df.parse(c);//获取时间
		Calendar a=new GregorianCalendar();
		a.setTime(data);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		a.set(Calendar.DAY_OF_MONTH, 1);
		for(int i=0;i<a.get(Calendar.DAY_OF_WEEK)-1;i++){
			//获取你设置的Calendar那年那月那日是星期几
			//数组下标从0开始，而她返回的是数组的内容
			//数组{1,2,3,4,5,6,7}中用1~7来表示：星期天，星期一，星期二，星期三，星期四，星期五，星期六 
			//如果当天是星期一她会返回2，所以减一，才等于1
			System.out.print("\t");
		}
		for(int i=1;i<=a.getActualMaximum(Calendar.DATE);i++){
			System.out.print(a.get(Calendar.DAY_OF_MONTH)+"\t");
			if(a.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
				System.out.println();///如果这个一天为周六，换行
			}
			a.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
/*
  1. 在获取月份时，Calendar.MONTH + 1 的原因
Java中的月份遵循了罗马历中的规则：当时一年中的月份数量是不固定的，第一个月是JANUARY。
而Java中Calendar.MONTH返回的数值其实是当前月距离第一个月有多少个月份的数值，
JANUARY在Java中返回“0”，所以我们需要+1。

2. 在获取星期几 Calendar.DAY_OF_WEEK – 1 的原因
Java中Calendar.DAY_OF_WEEK其实表示：一周中的第几天，所以他会受到 第一天是星期几 的影响。
有些地区以星期日作为一周的第一天，而有些地区以星期一作为一周的第一天，这2种情况是需要区分的。
看下表的返回值

 */
