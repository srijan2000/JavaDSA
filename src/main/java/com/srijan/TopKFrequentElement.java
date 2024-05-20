package com.srijan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k){
        List<Integer> []bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], (map.getOrDefault(nums[i], 0) + 1));
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] ans = new int[k];
        int pos = 0;
        for(int i = bucket.length - 1; i>= 0; i--){
            if(bucket[i] != null){
                for(int j = 0; j < bucket[i].size() && pos < k; j++){
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TopKFrequentElement topK = new TopKFrequentElement();
        int nums[] = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int arr[] = topK.topKFrequent(nums, k);
        for(int i = 0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
