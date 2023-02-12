public class DateAndTime {
    private Time2 time;
    private Date date;

    public DateAndTime(Time2 t , Date d) { //Constructor
      this.time = t;
      this.date = d;
    }

    public void incrementHour() {
        time.incrementHour();
        if(time.getHour() == 0)
        {
            date.nextDay();
        } 
    }
    
    public String toString(){
     return String.format("Time: %d:%02d:%02d %s Date: %d/%d/%d",
     ((time.getHour() ==0 || time.getHour() == 12) ? 12 : time.getHour() % 12),
     time.getMinute(), time.getSecond(), (time.getHour() < 12 ? "AM" : "PM"), date.getMonth(), date.getDay(), date.getYear());
    }

    public String toUniversalString(){
        return String.format("Time %02d:%02d:%02d %d/%d/%d", time.getHour(), time.getMinute(), time.getSecond(),
        date.getMonth(), date.getDay(), date.getYear());
    }
}
