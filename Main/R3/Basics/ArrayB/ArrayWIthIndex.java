package Basics.ArrayB;

//1. Print Each Element and Its Index in an Array
public class ArrayWIthIndex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" index is " + i);
        }
    }
}
