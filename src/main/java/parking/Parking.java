package parking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Parking {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2023,12,25,20,0,0);
        LocalDateTime leave = LocalDateTime.now();
        Car car = new Car("AA-0001",enter);
        car.setLeave(leave);
        long durationMin=car.durationMin();
        System.out.println("停幾分鐘?"+durationMin);
        float balance = car.balance(durationMin);
        System.out.println("停車費用?"+balance);
    }
}
