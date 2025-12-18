package Basics.ArrayB;

//6. Calculate Sum and Product of Array Elements
public class SumandprdArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,0,0,0};
        int n = arr.length-1;
        System.out.println("sum of an array is  : " + SumofArray(arr,n));
        System.out.println("product of an array is  : " + ProductofArray(arr,n));
        System.out.println( normalLoop(arr));
    }
    public static int SumofArray(int arr[],int n){
        if(n==0){
            return arr[n];
        }
        return arr[n]+SumofArray(arr,n-1);
    }
    public  static  int ProductofArray(int arr[],int n){
        if(n==0){
            return arr[n];
        }
        return arr[n]*ProductofArray(arr,n-1);
    }

    public static boolean normalLoop(int arr[]){
        int sum =0;
        int product=1;
        for(int i =0 ;i< arr.length;i++){
            if(arr[i]!=0) {
                sum += arr[i];
            }
        }

        for(int i =0 ;i< arr.length;i++){
            if(arr[i]!=0) {
                product *= arr[i];
            }
        }
        System.out.println("sum without recursion : " + sum);
        System.out.println("product without recursion : " + product);
       return  true;
    }
}
