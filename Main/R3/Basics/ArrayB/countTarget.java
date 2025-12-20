package Basics.ArrayB;

public class countTarget {
    public static void main(String[] args) {
     int [] arr = {1,2,2,3,44,5,7,2};
     int target =2;
     int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
            }
        }

        System.out.println(count);
    }

}
