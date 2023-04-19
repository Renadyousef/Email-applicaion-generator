
package emailapplication;

import java.util.Scanner;

/**
 *
 * @author renad
 */
public class EmailApplication {

    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
       Email emp1=new Email("Jhon","Smith");
        System.out.println(emp1);
        System.out.println("do you want to modfiy the default password \n If yes press 1 or 0 for no ");
        int dec=in.nextInt();
        if(dec==1){
            System.out.println("enter the new Pass");
            String pass=in.next();
            emp1.changePassword(pass);
            System.out.println("the password changed \nyour new password is:"+emp1.getPassword());
        }else ;
        System.out.println("if you want to change the mail capacity press 1 \nalthough we will inform the IT specialist first,and we will maximize it automatically after their primission");
        int newCap=in.nextInt();
        if(emp1.capLimit(newCap))
       emp1.setMaleBoxCap(newCap);
        System.out.println("Altrntive emails are optoinal if you want to add it enter 1 ");
     int dec2=in.nextInt(); if(dec2==1){
         System.out.println("enter the altrntive email");
         String alt=in.next();
         emp1.setAlternateMail(alt);
     }
        System.out.println("Alright you're all set here's yout informtion"); 
        System.out.println(emp1);
          
        
    }
    
}
