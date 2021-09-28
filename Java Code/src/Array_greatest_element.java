public class Array_greatest_element {
    public static void main(String[] args) {
        int n[] = {1,5,7,3,10};
        for(int i=0;i<n.length;i++){
            if(n[i] > n[0]){
                n[0] = n[i];
            }
        }
        System.out.println(n[0]);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+",");
        }
    }
}
