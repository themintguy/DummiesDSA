package Basics.ArrayB;

import java.util.HashMap;

//7. Count Occurrences of a Target Number in an Array
public class CountOccurence {
    public static void main(String[] args) {
        int arr [] = {1,2,2,34,5,6,2};
        int target=2;
        int count=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(target)){
                count++;
            }
        }
    }
}
