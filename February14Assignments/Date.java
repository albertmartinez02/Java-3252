public class Date {
   private int month;
   private int day;
   private int year;
   private static final int[] daysPerMonth=
   {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   public Date(int month, int day, int year) {
    if (month <= 0 || month > 12) {
        throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
    }
    if (day <= 0 ||
        (day > daysPerMonth[month] && !(month ==2 && day ==29))) {
            throw new IllegalArgumentException("day (" + day +
               ") out of range for the specified month and year");
        }
    if (month == 2 && day ==29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
               ") out of range for the specified month and year");
           }
    //The following check for year is the actual new code
    if(year<=0){
        throw new IllegalArgumentException("year (" + year + ") out of range.");
    }
    this.month = month;
    this.day = day;
    this.year = year;

    System.out.printf("Date object constructor for date %s%n", this);
   }

   public String toString() {
    return String.format("%d/%d/%d", month, day, year);
   }

   public void nextDay(){
    day++;
    if(day > daysPerMonth[month] && month == 12){
        day = 1;
        month = 1;
        year++;
    }
    
    if(month == 2 && day == 29 && (year % 400 == 0 || 
    (year % 4 == 0 && year % 100 != 0))){
        return;     
    }
    else if(day > daysPerMonth[month]){
        day = 1;
        month++;
    }
   }
   //Getters
   public int getDay(){ return day;}
   public int getMonth(){ return month; }
   public int getYear(){ return year;}

}
