import java.lang.reflect.Array;
import java.util.Arrays;

public class Findfourelementthatsumtogivenvalue {
    void findFourelements(int[] a,int n,int x){
        Arrays.sort(a);
        for(int i=0;i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                for(int k =j+1;k<n-1;k++){
                    for(int l = k+1;l<n;l++){
                        if(a[i]+a[j]+a[k]+a[l] == x){
                            System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]);
                        }
                    }
                }
            }
        }
    }//n^4
    void findFourelementsinoptimize(int[] a,int n,int x){
        Arrays.sort(a);
        int l,r;
        for(int i=0;i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                l = j+1;
                r = n-1;
                while(l<r){
                    if(a[i]+a[j]+a[l]+a[r] == x){
                        System.out.println(a[i]+" "+a[j]+" "+a[r]+" "+a[l]);
                        l++;
                        r--;
                    }else if(a[i]+a[j]+a[l]+a[r] < x){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
    }//n^3
}
