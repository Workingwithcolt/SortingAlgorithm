import java.util.Arrays;
import java.util.Comparator;

public class SortanarrayAccordingtocountofsetBits {
    public static void printAll(Integer[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static Integer[] sortbySetBitcount(Integer[] arr,int n){
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int c1 = Integer.bitCount(o1);
                int c2 = Integer.bitCount(o2);
                if(c1<=c2){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        return arr;
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        int n =6;
        sortbySetBitcount(arr,n);
        printAll(arr,n);
        System.out.println();
    }
}
