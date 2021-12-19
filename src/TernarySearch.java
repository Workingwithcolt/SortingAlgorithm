public class TernarySearch {
    static int ternarySearch(int low,int r,int key,int ar[]){
        if(r>=low){
            int mid1 = low+(r-low)/3;
            int mid2 = r-(r-low)/3;
            if(ar[mid1] == key) {
                return mid1;
            }
            if(ar[mid2] == key){
                return mid2;
            }
            if(key < ar[mid1]){
                return ternarySearch(low,mid1-1,key,ar);
            }else if(key > ar[mid2]){
                return ternarySearch(mid2+1,r,key,ar);
            }else {
                return ternarySearch(mid1+1,mid2-1,key,ar);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(ternarySearch(0,arr.length,2,arr));
    }
}
