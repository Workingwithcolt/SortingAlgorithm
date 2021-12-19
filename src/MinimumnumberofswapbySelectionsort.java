public class MinimumnumberofswapbySelectionsort {
    public static int Selection(int[] arr){
        int count = 0;
        for(int j=0;j< arr.length;j++){
            int minimumindex = j;
            for(int i=j+1;i< arr.length;i++){
                if(arr[i] < arr[minimumindex]){
                    minimumindex = i;
                }
            }
            if(minimumindex != j) {
                int temp = arr[j];
                arr[j] = arr[minimumindex];
                arr[minimumindex]= temp;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={1,5,4,3,2};
        System.out.println("Swap required to swap"+Selection(arr));
    }
}
