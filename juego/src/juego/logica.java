
package juego;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logica extends Thread {
   boton[][]botones; 
 int[][]num;

    public void run(){
        while(true){
            
            try {
                int n=0;
                
                for(int i=0;i<botones.length;i++){
                    for(int j=0;j<botones[i].length;j++){
                        
                        
                        //lo de arriba
                        if(i==0&&j==0){
                            
                            if(botones[i][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j+1].getBackground()==Color.BLUE){n=n+1;}
                        }
                        else if(i==0&&j>0&&i==0&&j<(botones[i].length-1)){
                          
                            if(botones[i][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j+1].getBackground()==Color.BLUE){n=n+1;}
                        }
                        else if(i==0&&j==(botones[i].length-1)){
                          
                            if(botones[i][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j].getBackground()==Color.BLUE){n=n+1;}
                            
                        }
                        //lados
                        else if(i>0&&i<(botones[i].length-1)&&j==0){
                            
                            if(botones[i-1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j+1].getBackground()==Color.BLUE){n=n+1;}
                        }
                        else if(i>0&&i<(botones[i].length-1)&&j==(botones[i].length-1)){
                             
                            if(botones[i-1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j-1].getBackground()==Color.BLUE){n=n+1;}
                        }
                        //lo de enmedio 
                        else if(i>0&&i<(botones[i].length-1)&&j>0&&j<(botones[i].length-1)){
                            
                            if(botones[i-1][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i+1][j+1].getBackground()==Color.BLUE){n=n+1;}
                           
                        }
                        //lo de abajo
                        else if(i==(botones[i].length-1)&&j==0){
                            
                            if(botones[i][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j+1].getBackground()==Color.BLUE){n=n+1;}
                        }
                        else if(i==(botones[i].length-1)&&j>0&&i==(botones[i].length-1)&&j<(botones[i].length-1)){
                              
                            if(botones[i][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i][j+1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j+1].getBackground()==Color.BLUE){n=n+1;}
                        }
                        else if(i==(botones[i].length-1)&&j==(botones[i].length-1)){
                         
                            if(botones[i][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j-1].getBackground()==Color.BLUE){n=n+1;}
                            if(botones[i-1][j].getBackground()==Color.BLUE){n=n+1;}
                            
                        }
                        // JOptionPane.showMessageDialog(this, "la celda ["+i+"] ["+j+"] lleva de n "+n);
                        if(botones[i][j].getBackground()==Color.BLUE){
                            if(n==2 || n==3)
                            {
                                // JOptionPane.showMessageDialog(this,"que tiene num["+i+"]["+j+"] " +num[i][j]+" y en n lleva "+n);
                                num[i][j]=1;
                                n=0;
                                
                            }
                            else if(n<2||n>3)
                            {
                                // JOptionPane.showMessageDialog(this,"que tiene num["+i+"]["+j+"] " +num[i][j]+" y en n lleva "+n);
                                num[i][j]=0;
                                n=0;
                            }
                        }
                        else{
                            
                            if(n==3){
                                num[i][j]=1;
                                n=0;
                            }
                            else{
                                num[i][j]=0;
                                n=0;
                            }
                            
                            
                        }
                        
                        
                    }
                    
                    
                }
                for(int i=0;i<num.length;i++){
                    for(int j=0;j<num[i].length;j++){
                        
                        if(num[i][j]==0){
                            
                            botones[i][j].setBackground(Color.LIGHT_GRAY);
                        }
                        else if(num[i][j]==1){
                            botones[i][j].setBackground(Color.BLUE);
                        }
                        
                        
                        System.out.print(num[i][j]);
                    }
                    System.out.println();
                    
                }
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(logica.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    }

    
}
