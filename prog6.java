import java.util.Arrays;
/**
 * prog6
 */
 
public class prog6 {
    public static void main(String[] args) {
        int [] arr= new int[] {9,1,4,3,7,4,8,5};
 
        boolean s = false;
        int max;
        while(!s) {
            s = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    s = false;
                    max = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = max;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}