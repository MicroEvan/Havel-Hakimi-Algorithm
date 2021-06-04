import java.util.Arrays;

public class Main {

    public static void main(String [] args){

        int [] Array = {4,5,4,3,3,2};


        HavelHakimi obj = new HavelHakimi();


     for(int j = 0; j< Array.length;j++) {
         System.out.printf("%s%n%n",Arrays.toString(Array));
         obj.checker(Array);
         Array = obj.reverseSort(Array);
         int deleted = obj.deleteFirstNumber(Array);
         obj.subtractOnes(Array,deleted);

     }

    }
}
