public class Theifhouse {
    public static int[] Maximumamount(int[] arr){
        int current = 0,jump = 0;
        int sum = 0;
        int count =0;
        int[] maxamount = new int[arr.length];
        while(current < arr.length){
            if(jump > arr.length-1){
                maxamount[count] = sum;
                count+=1;
                jump = 0;
                sum =  0;
                current++;
                jump = current;
                System.out.println("jump:"+jump);
            }else {
                sum = sum + arr[jump];
                jump += 2;
            }
        }
        return maxamount;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] a = Maximumamount(arr);
        int Maxvalue = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>Maxvalue){
                Maxvalue = a[i];
            }
        }
        System.out.println("Maximum amount"+Maxvalue);
    }
}
