package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;
    private int perHourPrice = 30;

    public Car(String id,LocalDateTime enter){
        this.id=id;
        this.enter=enter;
    }

    public void setLeave(LocalDateTime leave){
        if (leave.isAfter(enter)){
            this.leave=leave;
        }
    }
    public long durationMin(){
        Duration duration = Duration.between(enter,leave);
        return duration.toMinutes();
    }
    public int balance(long durationMin){
        float hour = Math.round(durationMin/60f);
        System.out.println("停幾小時?"+hour);
        int total = (int)hour*perHourPrice;
        return total;
    }
}
