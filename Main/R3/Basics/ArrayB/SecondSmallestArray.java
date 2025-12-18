package Basics.ArrayB;

//Find the Second Minimum Element; if None, Print -1
public class SecondSmallestArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,};
        System.out.println("Second highest no is : " + SecondMinimum(arr));
    }
    public static int SecondMinimum(int arr[]){

        int smallestNo = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if(arr.length==0  ){
            return -1;
        }

        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]<smallestNo){
                secondSmallest=smallestNo;
                smallestNo=arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]>smallestNo){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
}
