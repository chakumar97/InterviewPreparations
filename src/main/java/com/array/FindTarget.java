package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTarget {

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{2,3,4,5,6,1};
        int target = 5;
        List<Integer[]> result = findArraysWithTarget(nums, target);
        result.stream().forEach(num -> System.out.println(num[0] + " " + num[1]));
    }

    public static List<Integer[]> findArraysWithTarget(Integer[] nums, int target){
        Arrays.sort(nums);
        int start =0, end = nums.length-1;
        Integer[] tuple = new Integer[2];
        List<Integer[]> result = new ArrayList<>();
        while(start<end){
            if(nums[start] + nums[end] > target){
                end--;
            }else if(nums[start] + nums[end] < target){
                start++;
            }else{
                tuple[0] = nums[start];
                tuple[1] = nums[end];
                result.add(tuple);
                start++;
                end--;
            }
        }
        return result;
    }

}
