import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Minimumnumberofswap {
    public static int  Sort(int[] arr){
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i]) == i){
                    continue;
                }else{
                    int index = map.get(arr[i]);
                    int temp = arr[index];
                    arr[index] = arr[i];
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr ={1,5,4,3,2};
        System.out.println("Number of swaps"+Sort(arr));
    }
}
