package Training;

public class firstLast6 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(nums.length >= 1 && nums[0] == 6 || nums[nums.length-1] == 6);
    }
}
