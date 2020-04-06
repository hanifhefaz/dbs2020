/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_dms;

/**
 *
 * @author Hefaz
 */
public class splashClass {
    
    public static void main(String[] args) {
        
        splash sp = new splash();
        sp.setVisible(true);
        Login log = new Login();
        try{
            for(int i=1; i<=100; i++){
                Thread.sleep(18);
                sp.jLabel2.setText(Integer.toString(i)+"%");
                sp.jProgressBar1.setValue(i);
            
           if(i==100)
           {
               log.setVisible(true);
               sp.dispose();
           }
            
            }
        }catch(Exception e){
        }
        }
    }

