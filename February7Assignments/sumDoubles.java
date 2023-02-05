package February7Assignments;

public class sumDoubles {
    public static void main(String[] args){
     double sum = 0;
     
     for(String x : args){
        double adder = Double.parseDouble(x);
        sum += adder;
     }
     System.out.printf("%s%5f","Sum equals: ", sum);
    }
}
