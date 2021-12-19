public class FindPairWithGivenDiffren {
    public static int partition(int[] arr,int start,int end){
        int pivote = end;
        int i = start-1;
        for(int j = start;j<=end;j++){
            if(arr[j] <= arr[pivote]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
    public static void Quicksort(int[] arr,int start,int end){
        if(start<end){
            int pivote = partition(arr,start,end);
            Quicksort(arr, start, pivote-1);
            Quicksort(arr, pivote+1,end);
        }
    }//nlogn
    public static int binarySearch(int[] arr,int start,int end,int value){
        int mid = 0;
        mid = start+end/2;
        for(int i=0;i<arr.length;i++){
            if(arr[mid] == value){
                return mid;
            }else if(value <= arr[mid]) {
                end = mid;
            }else if(value >= arr[mid]){
                start = mid+1;
            }
            mid = start+end/2;
        }
        return -1;
    }//logn
    public static void findelementpair(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            int mid = binarySearch(arr,0, arr.length-1,arr[i]+n);
            if(arr[mid] == arr[i]+n){
                System.out.println("("+arr[i]+","+(arr[i]+n)+")");
                break;
            }//nlogn
        }
    }

    public static void main(String[] args) {
        int[] arr ={5,20,3,2,50,80};
        int n = 78;
        Quicksort(arr,0,arr.length-1);
        for(int el:arr){
            System.out.print(el+" ");
        }
        findelementpair(arr,n);
    }
}
