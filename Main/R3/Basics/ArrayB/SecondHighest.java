package Basics.ArrayB;

//14. Find the Second Maximum Element; if None, Print -1
public class SecondHighest {
    public static void main(String[] args) {
        int arr[]={11,44,155,2,9,49,98,};
        System.out.println("Second highest no is : " + SecondHighestNO(arr));
    }
    public static int SecondHighestNO(int arr[]){

        if(arr.length==0){
            return -1;
        }
        int highestNo = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;


        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>highestNo){
                secondhighest=highestNo;
                highestNo=arr[i];
            }
            else if(arr[i]>secondhighest && arr[i]<highestNo){
                secondhighest=arr[i];
            }
        }
        return secondhighest;
    }
}
