package Training;

public class commonEnd {
    public static void main(String[] args) {
        int[] a = {1,2,5,4,5,8,2};
        int[] b = {3,1,4,5,6,4,2};
        boolean result = a.length >= 1 && b.length >= 1 && a[0]==b[0] || a[a.length-1] == b[b.length-1];
        System.out.println(result);

    }
}
