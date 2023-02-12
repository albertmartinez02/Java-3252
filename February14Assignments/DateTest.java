public class DateTest {
    public static void main(String[] args){
        Date d = new Date(1,1,2000);
        for(int i=0; i<366; i++){
            System.out.println(d.toString());
            d.nextDay();
        }
    }
}
