import java.util.*;

public class largetNum {

    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
                if(largest < number[i]){
                largest = number[i];
            }

        }
        return largest;

    }

     public static int getSmallest(int number[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++){
                if(smallest > number[i]){
                smallest = number[i];
            }

        }
        return smallest;

    }

    public static void main(String[] args) {
        int number[] = {1, 2, 6, 5, 3};
        System.out.println("Largest number in the array is: " + getLargest(number));
        System.out.println("Smallest number in the array is: " + getSmallest(number));
    }
}
