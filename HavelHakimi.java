
/*This program tries to implementS the havel Hakimi Algorithm using an Array
//Computer Engineering students @CBU
//@aurthor Makai aka Micro
//@aurthor Mutale Chanda Metals
//MA320 notes by T.W.S
/Started: 26/05/2021   Completed:27/05/2021
//
 */

public class HavelHakimi {

public int deleteFirstNumber(int []arr){
   int deletedNumber=arr[0];
   for(int i=0;i<arr.length-1;i++){
       if(arr[i+1]==0)
           break;
       arr[i] = arr[i+1];
       arr[i+1] = 0;
   }
    return deletedNumber;
}

    //method to loop through an array "Deleted Element" times, subtract 1 from all "Deleted array" preceding numbers.
public void subtractOnes(int []arr, int deleted){

    for(int i = 0; i<deleted;i++){
        arr[i]--;
    }
}
//Method to check if all elements in the array equals zero and to check if the array has a negative integer
public void checker(int []arr) {
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            ++counter;
        }
        if (arr[i] < 0 || arr[i]>arr.length-1) {
            System.out.println( " This is Non-Graphical");
            System.exit(0);

        }
    }
    if (counter == arr.length) {
        System.out.println( " This is Graphical");
        System.exit(0);
    }
}

    //Method to reorder the array in descending order (Reverse Selection sort)
       public int [] reverseSort(int []arr){
        for (int j = 0;j< arr.length;j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    return arr;
    }


}
