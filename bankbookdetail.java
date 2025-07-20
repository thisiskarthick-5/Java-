import java.time.LocalDate;


public class Main{
  public static void main(String[] args){
    acc_holder per1 = new acc_holder();
    per1.name = "karthick";
    per1.MICR = 60000200085L;
    per1.email = "karthfire@gmail.com";
    per1.IFSC = "IOBA0001469";
    per1.tel = 9840457818L;
    per1.acc_no = 1786427864986L;
    per1.sch_code = "SUVB4433";
    per1.date = LocalDate.now();
    per1.address = "no 24 vatchellapuram thiruninravur";
    per1.custid = 15451;
    per1.display();
    
    
  }
}

class acc_holder{
  String name;
  Long MICR;
  String email;
  Long tel;
  String IFSC;
  Long acc_no;
  String sch_code;
  LocalDate date;
  int custid;
  String address;
  
  public void display(){
    System.out.println("Name :  " + name + '\t'  + "E-MAIL : " + email);
    System.out.println("MICR : " + MICR + '\t' + "IFSC : " + IFSC + '\t' + "tel : " + tel );
    System.out.println("ACCOUNT NO : "+ acc_no + '\t' + "Scheme code : "  + sch_code + '\t' + "opened on : " + date );
    System.out.println("CUT ID : " + custid + '\t' + "Adrress : " + address);
  }
 
}
