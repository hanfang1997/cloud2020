import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * @Program: cloud2020
 * @Description:
 * @Author: 韩放
 * @Date: 2021/06/16 09:33:58
 */

public class Test {

    @org.junit.Test
    public void test(){
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


    }
}
