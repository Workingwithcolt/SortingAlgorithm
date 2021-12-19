public class TripletSumlessthanx {
    public static void TripletsumlessthanX(int[] arr,int X){
        int first =0,second =1,third =2;
        while (first < arr.length-2){
            if(arr[first]+arr[second]+arr[third] < X){
                System.out.println(arr[first]+","+arr[second]+","+arr[third]);
            }
            if(third == arr.length-1 && second < arr.length-2){
                second++;
                third =second+1;
            }else if(second == arr.length-2 && third == arr.length-1 && first == arr.length-3){
                if(arr[first]+arr[second]+arr[third] < X){
                    System.out.println(arr[first]+","+arr[second]+","+arr[third]);
                }
                break;
            }else if(second == arr.length-2 && third == arr.length-1 && first < arr.length-2){
                first++;
                second = first+1;
                third = second+1;
            }else{
                if (third < arr.length - 1) {
                    third++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,7};
       TripletsumlessthanX(arr,12);
    }
}
