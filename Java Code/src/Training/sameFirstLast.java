package Training;

public class sameFirstLast {
    public static void main(String[] args) {
        int[] nums = {6,2,3,4,5,6};
        System.out.println(nums.length >= 1 && nums[0] == nums[nums.length-1]);
    }
}
