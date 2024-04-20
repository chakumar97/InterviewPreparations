package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayOperation {

    private Integer getSecondHighest(Integer[] nums){
        return Arrays.asList(nums).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        //return Arrays.asList(nums).stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().orElse(-1);
    }

    private Integer getMax(Integer[] nums1) {
        int[] nums = new int[]{3,2,4,1,6,7,5};
        //return Arrays.stream(nums).max().getAsInt();
        return Arrays.asList(nums1).stream().max(Comparator.naturalOrder())
                .orElseThrow(()-> new RuntimeException("No maximum value found"));
    }

    private int getMin(Integer[] nums) {
        return Arrays.asList(nums).stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("No minmum element found"));
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{3,2,4,1,6,4 ,7,5};
        int target = 4;
        ArrayOperation ob = new ArrayOperation();
        System.out.println("Second Highest is: " + ob.getSecondHighest(nums));
        System.out.println("Max element is: " + ob.getMax(nums));
        System.out.println("Min element is: " + ob.getMin(nums));
        System.out.println("Occurrence of " + target + " is: " + ob.findOccurrences(nums, 4) );
    }

    private long findOccurrences(Integer[] nums, int i) {

        return Arrays.asList(nums).stream().filter(n-> n==i).count();
    }


}
