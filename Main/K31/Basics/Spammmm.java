package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Spammmm {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,3,3};
//        int[] nums = new int[arr.length];

//        for(int i =0;i<nums.length;i++){
//            nums[i] = arr[i];
//        }
//        int[] nums = arr;
//        nums[0] = 31;
//
//        for(int i : nums){
//            System.out.print(i+ " ");
//        }
//        System.out.println();
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
        hashhhyy(arr,6);
    }

    private static void hashhhyy(int[] arr, int target){
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap();

        for(int i =0; i < arr.length;i++){
            int ans = target - arr[i];
            if(map.containsKey(ans)){
                list.add(Arrays.asList(arr[i],ans));
            } else{
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }

        System.out.println(list);


    }
}
