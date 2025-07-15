public class Main{
    public static void main(String[] args){
        
        int[] arr = { 1,23,3,4,5,5,6,7};
        int low = 0;
        int target = 89;
        int found = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (high + low)/2;
            
            if(arr[mid] == target){
                System.out.println("element found at : " + (mid+1));
                found = 1;
                break;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        
        if(found == 0){
            System.out.println("element not found");
        }
    }
}
