package Basics.ArrayB;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n= arr.length;
        int newArr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            newArr[i]=arr[i];

        }
//        System.out.println(newArr);
        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }

    }
}
