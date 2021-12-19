public class hackerearth {
    static int findXOR(int n) {
        int mod = n % 4;
        if (mod == 0) {
            return n;
        } else if (mod == 1) {
            return 1;
        } else if (mod == 2) {
            return n + 1;
        } else if (mod == 3) {
            return 0;
        } else {
            return 0;
        }
    }
    static int  findXOR(int l,int r){
        return (findXOR(l-1)^findXOR(r));
    }
    public static void main(String[] args){
        System.out.println(findXOR(1,99));
        System.out.println(findXOR(4,4)+findXOR(4,5)+findXOR(5,5));
    }
}
