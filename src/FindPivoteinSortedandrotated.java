public class FindPivoteinSortedandrotated {
    int peakElement(int[] arr,int low,int high,int lowerBound,int uppwerbound){
        int mid = (low)+(high-low)/2;
        if(mid == lowerBound) {
            if (mid == uppwerbound) {
                return mid;//only one element is present in the array
            } else if (arr[mid] >= arr[mid + 1]) {
                return mid;//the mid is the first element before the mid+1 it is greater therefore it is pivote
            }
        }else if(mid == uppwerbound){
            if(arr[mid] >= arr[mid-1]){
                return mid;
            }
        }else{
            if(arr[mid] >= arr[mid+1] && arr[mid] >= arr[mid-1]){
                return mid;
            }else if(arr[mid] > arr[high]){
                return peakElement(arr,mid+1,high,lowerBound,uppwerbound);
            }else if(arr[mid] < arr[high]){
                return peakElement(arr,low,mid-1,lowerBound,uppwerbound);
            }
        }
        return -1;
    }
}
