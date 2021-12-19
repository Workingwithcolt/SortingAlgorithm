public class ProductArrayPuzzle {
    public static void productExceptself(int[] arr){
        int prod =1;
        for(int i=0;i< arr.length;i++){
            prod = prod*arr[i];
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(prod/arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,3,5,6,2};
        productExceptself(nums);
    }
}
