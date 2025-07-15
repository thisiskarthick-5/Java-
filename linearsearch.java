public class Main{
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5,6,7};
        int target = 8;
        int found = 0;
        
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] == target){
                System.out.println("the element found at : " + (i + 1));
                found = 1;
                break;
            }
            
        }
        
        if(found == 0){
            System.out.println("element not found");
        }
        
        
    }
}
