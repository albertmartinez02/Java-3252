// Test the enchanced time2 class. Collaborators : Albert Martinez aam20 and Jonpier Veliz jav20bn
public class Time2Test {
    public static void main(String[] args){
        Time2 time = new Time2(23,59,59);
        System.out.println(time.toUniversalString());
        time.tick();
        System.out.println(time.toUniversalString());
        time.tick();
        System.out.println(time.toUniversalString());
        for(int i = 0; i< 24; i++){
            time.incrementHour();
            System.out.println(time.toUniversalString());
        }
        for(int i = 0; i< 24; i++){
            time.incrementMinute();
            System.out.println(time.toUniversalString());
        }
        for(int i = 0; i< 24; i++){
            time.tick();
            System.out.println(time.toUniversalString());
        }
    }
}
