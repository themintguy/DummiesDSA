package Basics;

import java.util.HashMap;
import java.util.Map;

public class Arrays {

    private static void printArray(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }

        for(int i =0;i<arr.length;i++){
            System.out.println("index of " +i + arr[i]);
        }
    }

    private static void printRevArray(int[] arr){
        for(int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    private static void printAlt(int[] arr){
        for(int i =0;i<arr.length;i+=2){
            System.out.println(arr[i]);
        }
    }

    private static void printDuplicateArray(int[] arr){
        int[] nums = new int[arr.length];
        nums = arr; // shallow copy with reference (not deep copy)
        nums[3] = 31;
        printArray(arr);
    }

    private static void sumAndProduct(int[] arr){
        int sum =0, product = 1;
        for(int i : arr){
            sum+=i;
            product*=i;
        }
        System.out.println("Summation "+ sum);
        System.out.println("Product "+product);
    }

    private static int countOcurrences(int[] arr , int target){
        int count =0;
        for(int i : arr){
            if(i == target){
                count++;
            }
        }
        return count;
    }

  private static boolean isSorted(int[] arr){
        boolean Aflag = true, Dflag = true;

        for(int i =0; i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                Aflag = false;
            }
            if(arr[i] < arr[i+1]){
                Dflag = false;
            }
            if(!Aflag && !Dflag){
                return false;
            }
        }
      return Aflag || Dflag;
  }

  private static void countUniqueDuplicate(int[] arr){
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i =0;i<arr.length;i++){
          map.put(arr[i], map.getOrDefault(arr[i],0)+1);
      }

      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          System.out.println(entry.getKey() + " " + entry.getValue());
      }
  }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        countUniqueDuplicate(arr);
    }
}