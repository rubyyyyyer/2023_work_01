package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeControl {
    public static void main(String[] args) {
        //Data 類別
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        //日期格式轉換器
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        //轉回Java的Date物件
        String time = "2023/12/21 17:39:20";
        Date timeToObj = null;
        try {
            timeToObj = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            //出現錯誤就會跑來這裡!
            throw new RuntimeException(e);
        }
        System.out.println(timeToObj);
        //Calendar 類別
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        //改成10月
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());
        //增加3天
        calendar.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(calendar.getTime());

    }
}
