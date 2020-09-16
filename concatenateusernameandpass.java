/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.util.Scanner;

/**
 *
 * @author BHARATH sharan
 */
public class concatenateusernameandpass {
     public static void main(String[] args) {
        
        login a=new login(); 
        a.getstring();
        a.checkstring();   
    }
    
    
}
class login{
      String name,password;
      
void getstring()
{
     Scanner o=new Scanner(System.in);
        System.out.println("Enter USERNAME");
        name=o.next();
        System.out.println("Enter PASSWORD");
        password=o.next();
}
    


      
void checkstring(){
if(name.equals(password))
        {
            System.out.println("Concatenated USERNAME & PASSWORD -->");
            System.out.println(name+password);
        }
        else
        {
            System.out.println("The USERNAME and PASSWORD are UNEQUAL:");
        }
}
}
