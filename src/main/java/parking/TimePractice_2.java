package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TimePractice_2 {
    public static void main(String[] args) {
        java();
//        java8();


    }

    private static void java8() {
        //產生時間(格林威治)
        Instant instant = Instant.now();
        System.out.println(instant);
        //產生本地時間
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //產生新的時間格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("轉字串:" + "yyyy/MM/dd HH:mm:ss");
        String time = dateTimeFormatter.format(localDateTime);
        System.out.println(time);
        //+3小時
        System.out.println(localDateTime.plus(Duration.ofHours(3)));
        //產生特定時間
        LocalDateTime newLocalDateTime =
                LocalDateTime.of(2023,5,20,17,30,00);
        System.out.println(newLocalDateTime);
        //把字串轉回物件
        LocalDateTime newTime = LocalDateTime.parse(time,dateTimeFormatter);
        System.out.println("轉物件:" + newTime);
    }


    private static void java() {
        //Date印出目前時間
        Date date = new Date();
        System.out.println(date.getTime());  //long
        System.out.println(date);  //Date
        //將時間物件轉為字串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        //把時間字串改為物件
        String time = "2023/05/20 20:30:00";
        Date strToObj =null;
        try {
            strToObj = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(strToObj);

        //使用Calendar取得時間
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        //更改時間月份
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());

        //增加時間天數
        calendar.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(calendar.getTime());
    }
}
