public class Main{
    public static void main(String[] args){
        System.out.println("hello world");
        
        car bmw = new car("bmw" , "red" ,true);
        bmw.moving();
        
        
        
    }
    
}

class car{
    
    String name;
    String color;
    boolean tf;
    
    void moving(){
        
        if(tf == true){
            System.out.println("the car : " + name + " is moving");
        }
        else{
            System.out.println("the car is stopped standing unused");
        }
        
    }
    
    car(String n , String c , boolean t){
        name = n;
        color = c;
        tf = t;
    }
}
