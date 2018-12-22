
package test3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JFrame;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        
        NewJFrame NewJFrame=new NewJFrame();
        NewJFrame3 New=new NewJFrame3();
                
        NewJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      NewJFrame.setSize(850,500);
      NewJFrame.setVisible(true);
      music();
      
      
    }


    public static void music() 
    {       
        File file = new File("src\\123.au");
        try{
AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

AudioFormat format = audioStream.getFormat();
DataLine.Info info = new DataLine.Info(Clip.class, format);
Clip audioClip = (Clip) AudioSystem.getLine(info);

audioClip.open(audioStream);
audioClip.start();
        }
        catch(Exception e){System.err.print("Not");}
    }

    
}