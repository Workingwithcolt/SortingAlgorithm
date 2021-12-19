import java.util.HashMap;
import java.util.Map;

public class ZerosumSubarray {
    public static void allpossiblesum(int[] arr){
        int sum  = 0;
        String sumstring =" ";
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum == 0){
                    System.out.println("("+"i:"+i+","+j+")");
                }
            }
            sum= 0;
            sumstring = "";
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,-1,-3,4,-2,2,4,6,-12,-7};
        allpossiblesum(arr);
    }
}
