package StringsAndArrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for (int i : nums) {
            if (hset.contains(i)) {
                return true;
            }
            hset.add(i);
        }
        return false;
    }
}



