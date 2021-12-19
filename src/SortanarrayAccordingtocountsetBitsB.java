public class SortanarrayAccordingtocountsetBitsB {
    static int countBits(int a){
        int count = 0;
        while(a>0){
            if((a&1)>0){
                count+=1;
            }
            a = a>>1;
        }
        return count;
    }
    static void insertionSort(int[] arr,int[] aux,int n) {
        for(int i=1;i<n;i++){
            int key1= aux[i];
            System.out.println("key1:"+key1);
            int key2 = arr[i];
            System.out.println("key2:"+key2);
            int j = i-1;
            System.out.println("i:"+i);
            while(j>=0 && aux[j] < key1){
                System.out.println("j:"+j);
                aux[j+1] = aux[j];
                arr[j+1] = arr[j];
                j--;
                for(int t=0;t<arr.length;t++){
                    System.out.print(aux[t]+" ");
                }
                System.out.println();
                for(int t=0;t<arr.length;t++){
                    System.out.print(arr[t]+" ");
                }
            }
            aux[j+1] =key1;
            System.out.println("aux[j+1] else"+aux[j+1]);
            arr[j+1] = key2;
        }
        for (int el:arr) {
            System.out.print(el+" ");
        }
    }
    static void sortBySetBitCount(int[] arr,int n){
        int aux[] = new int[n];
        for(int i=0;i<n;i++){
            aux[i] = countBits(arr[i]);
        }
        for(int el:aux){
            System.out.print(el+" ");
        }
        insertionSort(arr,aux,n);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        sortBySetBitCount(arr,n);
    }
}
