package Basics.ArrayB;

//13. Find the Minimum Element in an Array
public class smallestNoArray {
    public static void main(String[] args) {
        int arr[]={11,44,155,2,9,49,98,};
        int smallestNo = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallestNo){
                smallestNo=arr[i];
            }
        }
        System.out.println("smallest no in an array is  : " + smallestNo);
    }
}
