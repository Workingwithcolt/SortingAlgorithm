public class Simple {

    public static void  main(String[] args){
        int x = 6;
        int k =1;
        int[] arr ={4,5,6,7,6};
        int diff =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != x ){
                continue;
            }else if(i == 0 && arr[i] == x){
                 diff = Math.abs(arr[i]- arr[i+1]);
            }else if(i == arr.length-1 && arr[i] == x){
                diff = Math.abs(arr[i-1]-x);
            }else if(arr[i] == x){
                diff = Math.abs(arr[i-1]-x)+ Math.abs(arr[i+1]-x);
            }else{
                continue;
            }
            if(diff == k+k){
                System.out.println("i:"+i);
            }
            diff = 0;
        }
    }
}
