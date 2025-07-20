public class Main{
  public static void main(String[] args){
  bank mem = new bank();
  mem.acc_no = 928899;
  mem.balance_amount = 1000;
  mem.balance();
  mem.withdraw(900);
   mem.balance();
  mem.deposit(1000);
  mem.balance();
}
  
}

class bank{
  
  int acc_no;
  double balance_amount ;
  
  
  
  public void deposit(double amount){
    balance_amount += amount;
    System.out.println("the deposit amount : " +amount);
  
  }
  
  public void withdraw(double amount){
    if(amount <= balance_amount){
      
      balance_amount -= amount;
      System.out.println("withdraw amount : " + amount);
    }
    else{
      System.out.println("there is no enough amount");
    }
  }
  
  public void balance(){
    System.out.println("the balance : " + balance_amount);
    
  }
}

