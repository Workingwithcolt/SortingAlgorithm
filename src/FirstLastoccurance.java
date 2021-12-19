public class FirstLastoccurance {
    public static void check(int x,int[] arr){
        int first = 0;
        int last = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                if(first == 0){
                    first = i;
                }
                last = i;
                if(arr[i+1] == x){
                    continue;
                }else{
                    System.out.println("first:"+first+",Last:"+last);
                    return;
                }
            }
        }
    }
    public static int binarySearchFirst(int[] arr,int low,int high,int x,int n){
        if(high >= low){
            int mid = (low+high)/2;
            if((mid == 0) || x > arr[mid-1] && arr[mid] == x){
                return mid;
            }else if(x > arr[mid]){
                return binarySearchLast(arr,(mid+1),high,x,n);
            }else{
                return binarySearchLast(arr,low,(mid-1),x,n);
            }
        }
        return 0;
    }
    public static int binarySearchLast(int[] arr,int low,int high,int x,int n){
        if(high>=low){
            int mid = low+high/2;
            if(mid== n-1 || x < arr[mid+1] && arr[mid] == x){
                return mid;
            }else if(x < arr[mid]){
                return binarySearchLast(arr,low,mid-1,x,n);
            }else{
                return binarySearchLast(arr,mid+1,high,x,n);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,3,3,4,5};
        check(3,arr);
    }
}
