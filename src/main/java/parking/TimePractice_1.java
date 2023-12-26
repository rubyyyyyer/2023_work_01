package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TimePractice_1 {
    public static void main(String[] args) {
//        java();
        java8();


    }

    private static void java8() {
        //instant
        Instant instant = Instant.now();
        System.out.println(instant);
        //local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //指定格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("轉字串:" + "yyyy/MM/dd HH:mm:ss");
        String time = formatter.format(now);
        System.out.println(formatter.format(now));
        //+3
        System.out.println(now.plus(Duration.ofHours(3)));
        //指定時間&格式
        LocalDateTime other =
                LocalDateTime.of(2018,10,10,20,3,20);
        System.out.println(other);
        //把字串轉回物件
        LocalDateTime newTime = LocalDateTime.parse(time,formatter);
        System.out.println("轉物件:" + newTime);
    }

    private static void java() {
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
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        //增加3天
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(calendar.getTime());
    }
}
