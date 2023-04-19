
package emailapplication;

import java.util.Scanner;


public class Email {
    private String firstName,lastName,department,password,alternateMail,email;
     private int maleBoxCap=500;
  private  static final int DEFAULT_PASS_LEN=8;
 private String companySuffix ="xycompany.com";
//constructer to recive last and first name 
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //call private methodes genrating private info
      department= SetDepartment(); 
        password=randomPass(DEFAULT_PASS_LEN);
        System.out.println("your recommended Password is:"+password);
        //combine elments to genrate email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
       
    }
  
  //ask for the department
  private String SetDepartment(){
      System.out.println("Hello "+firstName+"\nThe Department Codes \n 1 for sales \n 2 for development \n 3 for accounting  \n 0 for none\nEnter Department Code");
      Scanner input=new Scanner(System.in);
      int dep=input.nextInt();
      String choice="";
    switch(dep){
        case 1:
       return "Sales";     
      case 2:
      return "development";   
     case 3:
         return"accounting ";
      case 4:
          return"";
      }
        return "";
      
  }
  
  
  //genrate random pass
  private String randomPass(int length){
      String passSet="abcdefghijclmnopqrstuvwxyz123456789@#-_";
        char[]password=new char[length];
        for(int i=0;i<length;i++){
           int Rand= (int)(Math.random()*passSet.length());
          password[i]=passSet.charAt(Rand);
        }
      return new String(password);//to convert an array of char to string
  }
  
  
  //set mailBox capacity
    public void setMaleBoxCap(int maleBoxCap) {
        this.maleBoxCap = maleBoxCap;
    } 
  
  
  //set alt email 
    public void setAlternateMail(String alternateMail) {
        this.alternateMail = alternateMail;
    }
  
  //change the password

    public void changePassword(String password) {
        this.password = password;
    }

    public String getAlternateMail() {
        return alternateMail;
    }

    public int getMaleBoxCap() {
        return maleBoxCap;
    }

    public String getPassword() {
        return password;
    }

  
    public String toString() {
        return  " Email genrated for :"+firstName +lastName+"\n company email:" + email + "\n maleBoxCap:" + maleBoxCap+"Mb";
    }

 public boolean capLimit(int cap){
     if(cap>500 &&cap<2000) return true ;
     else return false;
 }

   

  
}