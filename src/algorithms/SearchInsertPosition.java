package algorithms;

/*
*Given a sorted array of distinct integers and a target value, 
*return the index if the target is found 
*If not , return the index where it would be if it were inserted in order.
*You must write an algorithm with 0(log n )runtime complexity.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                if (target == nums[i]) {
                    return i;
                }
                continue;
            }
            return i;
        }
        return -1;
    }
}