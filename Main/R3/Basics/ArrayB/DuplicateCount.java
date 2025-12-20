package Basics.ArrayB;

import java.util.HashMap;

public class DuplicateCount {
    static void main() {
        int [] arr = {1,2,2,3,3,4,4,4,5,6,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
