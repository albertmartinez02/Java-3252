package February7Assignments;

public class product{
    public static int result(int... numbers){
     int x = 1;
       for(int y : numbers){
        x *= y;
       }
       return x;
    }
 public static void main(String[] args){
    int[] array = {11,22,33,44,55,66};
    int x = result(array);
    System.out.printf( "%s%05d%n","First call to product function with input array yields: ", x);

    int[] array2 = {1,2,3,4,5,6,7,8};
    int y = result(array2);
    System.out.printf( "%s%05d%n","Second call to product function with input array2 yields: ", y);

    int[] array3 = {1,1,2,3,5,8,13,21,34};
    int z = result(array3);
    System.out.printf( "%s%05d%n","Third call to product function with input array3 yields: ", z);

 }
}