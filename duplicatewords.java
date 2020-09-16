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
public class duplicatewords {
    public static void main(String[] args) {
       
     copyofwords o=new copyofwords();
     o.getstring();
     o.tofindrepword();
       
    }
  
}
class copyofwords
{
    String sentance;
    int count,i,j;
    void getstring(){
           System.out.println("write a sentance to find a repeated words ");
        Scanner obj=new Scanner(System.in);
        sentance=obj.nextLine();
    }
    void tofindrepword(){
        sentance=sentance.toLowerCase();
        String words[]=sentance.split(" ");
        for(i=0;i<words.length;i++)
        {
            count=1;
            for(j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    words[j]="0";
                }
           
           
            }
                if(count>1&&words[i]!="0")
                {
                   System.out.println("THE DUPLICATE WORDS is -->"+words[i]);
                   System.out.println("NUMBER OF OCCURRENCES is -->:"+count);
                }
                else
                {
                  
                  
                    continue;
                }
    
}
}
}