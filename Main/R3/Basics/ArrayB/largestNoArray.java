package Basics.ArrayB;

//12. Find the Maximum Element in an Array
public class largestNoArray {
    public static void main(String[] args) {
        int arr[]={11,44,155,2,9,49,98,};
        int largestNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largestNo){
                largestNo=arr[i];
            }
        }
        System.out.println("largest no in an array is  : " + largestNo);

    }
}
