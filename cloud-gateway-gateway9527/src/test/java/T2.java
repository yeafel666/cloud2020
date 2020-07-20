import java.time.ZonedDateTime;

/**
 * @author Yeafel
 * 2020/7/13 12:23
 * Do or Die,To be a better man!
 */
public class T2 {
    public static void main(String[] args) {
        //默认时区
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
        //2020-07-13T12:24:39.443+08:00[Asia/Shanghai]
    }
}
