package February7Assignments;

public class InitArray {
   public static void main(String[] args) {
    if(args.length == 0)
    {
        int[] array = new int[10];
        System.out.printf("%s%8s%n","Index","Value");
      for(int x=0; x < array.length; x++)
      { System.out.printf("%5d%8d%n",x,array[x]); } 
    }
    else
    {
        int arrayLength = Integer.parseInt(args[0]);
        int[] array = new int[arrayLength];
        System.out.printf("%s%8s%n","Index","Value");
        for(int x=0; x < array.length; x++)
        { System.out.printf("%5d%8d%n",x,array[x]); }
    }
    
 }
} 

