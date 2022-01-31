package Training;

public class sum3 {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {4,7,2};
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
