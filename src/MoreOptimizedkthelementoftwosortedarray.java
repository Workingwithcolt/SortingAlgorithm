import java.util.Arrays;

public class MoreOptimizedkthelementoftwosortedarray {
    static  int kth(int[] arr1,int m,int[] arr2,int n,int k){
        if(k > (m+n) || k< 1){
            return -1;
        }
        if(m > n){
            return kth(arr2,n,arr1,m,k);
        }
        if(m == 0){
            return arr2[k-1];
        }
        if(k == 1){
            return Math.min(arr1[0],arr2[0]);
        }
        int i =Math.min(m,k/2);
        int j = Math.min(n,k/2);
        System.out.println("i:"+i+"j:"+j);
        if(arr1[i-1] > arr2[j-1]){
            System.out.println("arr[i-1]"+arr1[i-1]+"arr[j-1]"+arr2[j-1]);
            System.out.println("if is executed");
            int temp[] = Arrays.copyOfRange(arr2,j,n);
            for(int el:temp){
                System.out.print(el+" ");
            }
            return kth(arr1,m,temp,n-j,k-j);
        }
        System.out.println("else is executed");
        int temp[] = Arrays.copyOfRange(arr1,i,m);
        return kth(temp,m-i,arr2,n,k-i);
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,6,7,9};
        int[] arr2 = {1,4,8,10};
        int m = arr1.length;
        int n = arr2.length;
        int k = 5;
        int ans = kth(arr1,m,arr2,n,k);
        if(ans == -1){
            System.out.println("Invalid query");
        }else{
            System.out.println();
            System.out.println(ans);
        }
    }
}
