package Tests;

import javax.swing.*;


public class Mail {
    public static void main(String[] args) {

        int arroba=0;
        boolean point=false;

        String mail= JOptionPane.showInputDialog("Introduce tu e-mail");

       for (int i=0;i<mail.length();i++){

           if (mail.charAt(i)=='@'){
               arroba++;
           }
           if (mail.charAt(i)=='.'){
               point=true;
           }

        }

       if (arroba==1 && point==true){
           System.out.println("Es correcto");
       }
       else{
           System.out.println("No es correcto");
       }
        //System.out.println(mail.length());
    }
}
