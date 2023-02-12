public class DateAndTimeTest {
    public static void main(String[] args){
        Time2 relax = new Time2(23,59,59);
        Date d = new Date(9,21,1983);
        DateAndTime obx = new DateAndTime(relax,d);

        System.out.println(obx.toString());
        System.out.println(obx.toUniversalString());

        obx.incrementHour();
        System.out.println(obx.toUniversalString());
        

    }
}
