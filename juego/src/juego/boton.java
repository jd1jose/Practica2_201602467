

package juego;

import java.awt.Color;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public final class boton extends JButton implements ActionListener {
    public ImageIcon fin, finv;
    //-------- Constructor con parametros para posicionar a los botones ------//
    public boton( int pos_x, int pos_y, int ancho, int alto ){ 
        ImageIcon im =new ImageIcon(getClass().getResource("/imagenes/4.png/"));
        Image con = im.getImage();
        Image tamaño = con.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        fin= new ImageIcon(tamaño);
        
        ImageIcon imv =new ImageIcon(getClass().getResource("/imagenes/3.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        finv= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        setBounds(pos_x, pos_y, ancho, alto);
        setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(fin);
       
    }
    //------------------------------------------------------------------------//
    
    //---------------------- Se asigna una el nombre del boton ---------------//
    public void setNombre( int f, int c ){
        setText( f + " , " + c );
    }
    //------------------------------------------------------------------------//
    
    //------------------ Al darle click realizara este metodo ----------------//
    public void actionPerformed( ActionEvent e ){
       
       if(getBackground()==Color.BLUE){
         setBackground(Color.LIGHT_GRAY);
           setIcon(fin);
           
            
        //Se asigna un color de letra color blanco
        setForeground(Color.BLACK);
       }
       else if(getBackground()==Color.LIGHT_GRAY){
        setBackground(Color.BLUE);
          setIcon(finv);
        //Se asigna un color de letra color blanco
        setForeground(Color.WHITE);
        //Se asigna el color de fondo azul
      
       }
      
       
    }
    
    public void imagenm (){
        setIcon(fin);
        
    }
    public void imagenv (){
       setIcon(finv);
    }
    //------------------------------------------------------------------------//
}