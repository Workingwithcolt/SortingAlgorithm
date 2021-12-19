public class FindtheElementinbybinarysearchinnotsorteeddata {
    public static int BinarySearch(int[] arr,int target){
        int n = arr.length;

        if(n == 0){
            return 0;
        }
        int low =0,high = arr.length-1;
        int first = arr[0];
        while(low <= high){
            int mid = (low+high)/2;
            int value= arr[mid];
            if(value == target){
                return mid;
            }
            boolean am_big = value >= first;//that says that the array of element are in the increase order
            boolean target_big = target>=first;///here we check the target is wether is greater than the first
            if(am_big == target_big){
                if(value<target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }else{
                if(am_big){
                    low = mid+1;
                }else{
                    high = mid-1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={4,5,6,7,1,2};
        System.out.println(BinarySearch(arr,1));
    }
}
