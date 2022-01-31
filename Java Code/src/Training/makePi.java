package Training;

public class makePi {
    public static void main(String[] args) {
        double pi = Math.PI;
        String piString = String.valueOf(pi);
        piString = piString.replace(".","");
        int first = Integer.parseInt(String.valueOf(piString.charAt(0)));
        int second = Integer.parseInt(String.valueOf(piString.charAt(1)));
        int third = Integer.parseInt(String.valueOf(piString.charAt(2)));
        int[] nums = {first,second,third};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
