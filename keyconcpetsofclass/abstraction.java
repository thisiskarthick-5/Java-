public class Main{
    public static void main(String[] args){
        student obj = new stud1("karthick" , 19);
        obj.details();
        student obj2 = new stud1("akash" , 19);
        obj2.details();
        
        
    }
}

abstract class student{
    abstract  void details();
}

class stud1 extends student {
    
    String n ;
    int a;
    
    
    
    public void details(){
        System.out.println("name : " + n + "\n" + "age : " + a);
    }
    
    stud1(String name , int age ){
        n = name;
        a = age;
    }
    
}
