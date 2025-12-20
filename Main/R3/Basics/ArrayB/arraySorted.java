package Basics.ArrayB;

public class arraySorted {
    static void main() {
        int [] arr ={3,2,1};
        System.out.println(isSorted(arr));

        }
        private static boolean isSorted(int arr[]){
            boolean Accending = true;
            boolean Decending=true;

            for(int i=0;i< arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    Accending = false;
                }
                if(arr[i]<arr[i+1]){
                    Decending=false;
                }
                if(!Accending && !Decending){
                    return  false;
                }
            }
            return true;
        }
    }

