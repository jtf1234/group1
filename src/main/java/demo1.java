import java.io.*;
import java.util.Calendar;

import java.util.Locale;

public class demo1 {

    public static void main(String[] args) throws Exception {
        String a = "";
        System.out.println("输入一个日期格式为:yyyy/MM/dd");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        Calendar instance = Calendar.getInstance(Locale.CHINA);
        String[] split = s.split("/");
        instance.set(Calendar.YEAR,Integer.parseInt(split[0]));
        System.out.println(Integer.parseInt(split[0]));
        System.out.println(Integer.parseInt(split[1])-1);
        System.out.println(Integer.parseInt(split[2]));
        instance.set(Calendar.MARCH,Integer.parseInt(split[1])-1);
        instance.set(Calendar.DATE,Integer.parseInt(split[2]));
        int i = instance.get(Calendar.DAY_OF_WEEK);
        switch (i){
            case 1:a="星期日";break;
            case 2:a="星期一";break;
            case 3:a="星期二";break;
            case 4:a="星期三";break;
            case 5:a="星期四";break;
            case 6:a="星期五";break;
            case 7:a="星期六";break;

        }


        System.out.println(s+"是"+a);



    }
   
}
