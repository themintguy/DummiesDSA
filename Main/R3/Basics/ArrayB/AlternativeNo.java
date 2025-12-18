package Basics.ArrayB;

//3. Print Alternate Elements of an Array
public class AlternativeNo {
    public static void main(String[] args) {
        int[] arr ={1,22,33,42,56,69};
        for(int i=0 ;i< arr.length;i++){
            if(i%2!=0){
                System.out.println("alternative nos in an array " + arr[i]);
            }
        }
    }
}

