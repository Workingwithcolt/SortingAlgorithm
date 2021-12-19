public class KthelementoftwoSortedarray {
    public static int findKthelement(int[] arr1,int[] arr2,int k){
        int i=0,j =0,d = 0;
        int[] result= new int[arr1.length+arr2.length+1];
        while(i< arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                result[d++] = arr1[i++];
            }else{
                result[d++] = arr2[j++];
            }
        }
        while(i< arr1.length){
            result[d++] = arr1[i++];
        }
        while(j<arr2.length){
            result[d++] = arr2[j++];
        }
        return result[k-1];
    }//space complexity = o(n+m)
    public static  int findKthelementinOptimizedway(int[] A,int[] B,int m,int n,int k_req){
        int k=0,i=0,j=0;
        while(i< m && j< n){
            if(A[i] < B[j]){
                k++;
                if(k_req == k){
                    return A[k];
                }
                i++;
            }else{
                k++;
                if(k_req == k){
                    return B[k];
                }
                j++;
            }
        }
        while(i< m){
            k++;
            if(k == k_req){
                return A[k];
            }
            i++;
        }
        while(j  < n){
            k++;
            if(k == k_req){
                return B[k];
            }
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,6,7};
        int[] arr2 ={1,4,5,8,9};
        int k= 5;
        System.out.println(findKthelement(arr1,arr2,k)+"element is at the index");
    }
}
