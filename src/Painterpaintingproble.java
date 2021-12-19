public class Painterpaintingproble {
    static  int findFeasible(int board[],int n,int limit){
        int sum = 0,painter = 1;
        for(int i=0;i<n;i++){
            sum+=board[i];
            if(sum > limit){
                sum = board[i];
                painter++;
            }
        }
        return painter;
    }
    static int painterPartition(int[] boards,int n,int m){
        //n = numberof board m = number of painter
        int totallength = 0,k = 0;
        for(int i=0;i<n;i++){
            k = Math.max(k,boards[i]);
            totallength += boards[i];
        }
        int low = k,high = totallength;
        while(low<high){
            int mid = (low+high)/2;
            System.out.println("low:"+low+",high:"+high);
            System.out.println("mid:"+mid);
            int painter = findFeasible(boards,n,mid);
            System.out.println("painter:"+painter);
            if(painter <= m){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

}
