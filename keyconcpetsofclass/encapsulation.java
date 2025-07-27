public class Main{
    public static void main(String[] args){
        bank obj = new bank(90);
        //accesing the private attribute from tha class
       
    }
}

class bank{
    
    private int  balance ;
    
    public  bank(int amount){
        this.balance = amount;
        System.out.println(balance);
         
    }
    
   
    
    
}
