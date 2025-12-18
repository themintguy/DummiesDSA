package Basics.ArrayB;//Create Two Arrays for Odd and Even Elements

import java.util.HashSet;

public class SplitArray {
    public static void main(String[] args) {
        HashSet<Integer> evenset = new HashSet<>();
        HashSet<Integer> oddset = new HashSet<>();
        int arr[]={10,12,15,17,5,16};
        for(int i =0 ; i< arr.length;i++){
//            even nos
            if(arr[i]%2==0){
                evenset.add(arr[i]);
            }
            else{
                oddset.add(arr[i]);
            }
        }
//        hashset to array even
        int [] even =  new int[evenset.size()];
        int i=0;
        for( int r :evenset){
           even[i++]=r;
        }
        System.out.println("the even array elements are :");
        for (int j = 0; j < even.length; j++) {
            System.out.print(" "+even[j]);
        }
//        hashset to array odd
        int k=0;
        int [] odd =  new int[ oddset.size()];
        for(int x :oddset){
            odd[k++]=x;
        }
        System.out.println();
        System.out.println("the odd array elements are :");
        for (int j = 0; j < odd.length; j++) {
            System.out.print(" "+ odd[j]);

        }
    }
}
