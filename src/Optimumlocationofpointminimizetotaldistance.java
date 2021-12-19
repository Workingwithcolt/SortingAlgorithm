import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Optimumlocationofpointminimizetotaldistance{
    public static Node root;
    public Optimumlocationofpointminimizetotaldistance(){
        root  = null;
    }
    public static Node insert(int value,Node node,int[] arr){
        Node newnode = new Node();
        if(node == null){
            node = newnode;
            newnode.value = value;
            newnode.count=1;
            return node;
        }else if(value > node.value){
            node.right =insert(value,node.right,arr);
        }else if(value < node.value){
            node.left = insert(value,node.left,arr);
        }else if(node.value == value){
            System.out.println("node.value"+node.value);
            node.count+=1;
        }
        if(node.value > arr.length/2){
            return node;
        }
        return node;
    }
    public static Node insertall(int[] arr){
        for(int i=0;i<arr.length;i++){
            root = insert(arr[i],root,arr);
        }
        return root;

    }
    public static int findDuplicateinOptimize(int[] arr) {
        int count =0;
        for(int i=0;i< arr.length;i++){
            int number =Math.abs(arr[i]);
            System.out.println("number :"+number);
            if(number > arr.length-1){
                try {
                    System.out.println(arr[number]+" ");
                }catch (ArrayIndexOutOfBoundsException e){
                    number = arr.length-1;
                }
            }
            if(arr[number] < 0){
                count+=1;
                System.out.println("count"+count);
                if(count >= arr.length/2) {
                    return number;
                }else{
                    continue;
                }
            }else{
                arr[number] = -arr[number];
                System.out.println("arr[number]"+arr[number]);
            }
        }
        return -1;
    }//that is work for only the consecutive element which present
    public static int secondfunctionDuplicate(int[] arr){
        //first we take the maj_index which we intialize to currentindex
        //then parallely increment the count pointer if that particular element is
        //same as the maj_index if it is not then we decrement that particular value by 1
        //if the count which becomen zero that time we increment the maj_index pointer to the
        //current element index
        //parallely increment the counter
        int count = 1;
        int maj_index = 0;
        for(int i=1;i< arr.length;i++){
            maj_index = i;
            if(arr[maj_index] == arr[i]){
                count++;
            }else if(count == 0){
            maj_index = i;
            count = 0;
            }
            else {
                count--;
            }
        }
        int counsecond = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[maj_index] == arr[i]){
                counsecond++;
            }
            if(counsecond > arr.length/2){
                return arr[counsecond];
            }else{
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Optimumlocationofpointminimizetotaldistance r = new Optimumlocationofpointminimizetotaldistance();
        int[] arr = {3,3,4,2,4,4,2,4,4};
        System.out.println(secondfunctionDuplicate(arr)+":Duplicate");
    }
}
