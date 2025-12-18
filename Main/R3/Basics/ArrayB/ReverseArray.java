package Basics.ArrayB;//2. Print Elements of an Array in Reverse Order

public class ReverseArray {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5};
//        for(int i =arr.length-1 ;i>=0;i--){
//            System.out.print("Reverse order : " + arr[i]);
//        }
//
//    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int s =0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
