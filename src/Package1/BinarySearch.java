package Package1;

import java.util.Scanner;

public class BinarySearch {
    public static int binearSearch(int []arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        int target = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result = binearSearch(arr,target);
        if(result==-1){
            System.out.println("not found");
        }
        else
            System.out.println("found: " + result);
    }
}
