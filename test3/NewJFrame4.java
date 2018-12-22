/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Launcher
 */





public class NewJFrame4 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame4
     */

    public static Integer score[]=new Integer[]{0,0};
    
    public NewJFrame4() {
        initComponents();   
    }
    
   static Hashtable<String, Integer>h=new Hashtable();
   static HashSet <String >a=new HashSet();
   static int house=9;  
    private static  int own[][]={{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
    private static int arr[]=new int[9];
    static String[]nameofp=new String[2];
    private static  int []p={0,1};
    private  static int m=0;
    //first player moves in the first
    private static  int b=9;
    private static int s=0;
    static String pics[]={"pic1.png","pic2.png"};
    static String pl[]={"Blue","Red"};
    public void play(int a){try{
        if (m==0) {
             InputStream test = new FileInputStream("src\\p1.au");
             AudioStream t=new AudioStream(test);
           AudioPlayer.player.start(t);
        }
        else{
             InputStream test = new FileInputStream("src\\p2.au");
             AudioStream t=new AudioStream(test);
           AudioPlayer.player.start(t);
        }
        
           
           
        
        }
        catch(Exception e3){System.err.println("Not found procc.mp3");}
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        lc = new javax.swing.JLabel();
        lc1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("               KING");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Move!");

        l.setFont(new java.awt.Font("Microsoft Uighur", 0, 36)); // NOI18N
        l.setText("BLUE");

        jLabel3.setText("jLabel3");

        jLabel6.setText("jLabel6");

        btn10.setText("Resign!");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });

        l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });

        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });

        l7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });

        l8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });

        l9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });

        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/12.png"))); // NOI18N
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });

        lc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/c1.png"))); // NOI18N

        lc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/c2.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/c12.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/c22.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test3/colo.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)))
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(208, 208, 208))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l7))
                            .addComponent(l1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lc)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lc1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addComponent(jLabel7)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(l)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lc)
                                    .addComponent(lc1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(l3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(l5)
                                            .addComponent(l6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(l8)
                                            .addComponent(l9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l7)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel17)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       static int n=0;
public static int f(int m){
    house--;
    for (int k = 0; k < 3; k++) {
        for (int l = 0; l < 3; l++) {
            if (own[l][k]==p[m]) {
              n++;
              
            }
        }
        if (n==3) {
            //Victory of p[i] player
            s=2;
           
        }else
            n=0;
    }
    if(s==2)
        return 2;
    
    for (int l = 0; l< 3; l++) {
        for (int k = 0; k < 3; k++) {
            if (own[l][k]==p[m]) {
              n++;
              
            }
        }
        if (n==3) {
            //Victory of p[i] player
            s=2;
           
        }else
            n=0;
    }
    if (s==2)
        return 2;
    
        if (own[1][1]==p[m]) {
            int k=0;
            int l=0;
            int n=0;
            while(k!=3){
            
                if (own[l][k]==p[m]) {
                    n++;
                }
                
                
            k++;
            l++;
            }
            if (n==3) {
                //victory
                s=2;
                return s;
            }else{
            
                k=0;
                l=2;
                n=0;
                while(l!=-1){
                    if (own[l][k]==p[m]) {
                    n++;    
                    }
                
                k++;
                l--;
                }
                if (n==3) {
                    //victory
                    
                    s=2;
                    return s;
                }
            
            }
            
            }  //JOptionPane.showMessageDialog(null, house);
      if (house==0) {
            //Draw
            s=0;
            return s;
        }
        s=1;
        return s;
        
        }
public void check(int a){
//Clorful Robent
     if (p[m]==0) {
                 lc1.show();
                 lc.hide();
             }else{
                lc.show();lc1.hide();}
                 
     if (a==2) {
            //p[m] won
            
             if(m==0){
                
                 score[0]+=3;
                 score[1]-=1;
              }else{
               score[1]+=3;
                 score[0]-=1;
             }
             h.put(NewJFrame2.nam,score[0]);
             h.put(NewJFrame3.nam, score[1]);
            File file = new File("src\\victory.au");
        try{
AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

AudioFormat format = audioStream.getFormat();
DataLine.Info info = new DataLine.Info(Clip.class, format);
Clip audioClip = (Clip) AudioSystem.getLine(info);

audioClip.open(audioStream);
audioClip.start();
        }
        catch(Exception e){System.err.print("Not");}
               JOptionPane.showMessageDialog(null, pl[m]+" Won!");
               for (int k2 = 0; k2 < 3; k2++) {
                  for (int o = 0; o < 3; o++) {
                       own[k2][o]=-1;
                  }}
               house=9;
             m=0;
            this.dispose();
            NewJFrame ng=new NewJFrame();
            ng.setVisible(true);
            
        }else if(a==0){
        house=9;
        
              JOptionPane.showMessageDialog(null,"Draw!!!");
              for (int k = 0; k < 3; k++) {
                  for (int o = 0; o < 3; o++) {
                       own[k][o]=-1;
                  }
         }
               score[0]+=1;
               score[1]+=1;
              h.put(NewJFrame2.nam, score[0]);
              h.put(NewJFrame3.nam,score[1]);
              m=0;
           this.dispose();
            NewJFrame ng=new NewJFrame();
            ng.setVisible(true);
            //Draw
        
        }else{
        
            if(m==1)
                m=0;
            else 
                m=1;}
            


}
            
    
    
    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked

         if (own[0][0]==-1) {try{
             play(m);
        l1.setIcon(new ImageIcon(ImageIO.read(NewJFrame4.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
           own[0][0]=p[m];
         int status=f(p[m]);
         check(status);
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
        
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked

          if (own[1][0]==-1) {try{
              play(m); 
        l2.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
        
       
           own[1][0]=p[m];
         int status=f(p[m]);
         check(status);
                 
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked

         if (own[2][0]==-1) {try{
             play(m); 
        l3.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
           own[2][0]=p[m];
         int status=f(p[m]);
         check(status);
                 
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
if (own[0][1]==-1) {try{
    play(m); 
        l4.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
           own[0][1]=p[m];
         int status=f(p[m]);
         check(status);
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked

         if (own[1][1]==-1) {try{
             play(m); 
        l5.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
        
       
           own[1][1]=p[m];
         int status=f(p[m]);
         check(status);
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked

        if (own[2][1]==-1) {try{
            play(m); 
        l6.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
           own[2][1]=p[m];
         int status=f(p[m]);
         check(status);
                 
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l6MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        
         if (own[0][2]==-1) {try{
             play(m); 
        l7.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
           own[0][2]=p[m];
         int status=f(p[m]);
         check(status);
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked

if (own[1][2]==-1) {try{
    play(m); 
        l8.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
           own[1][2]=p[m];
         int status=f(p[m]);
         check(status);
                 
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l8MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked

if (own[2][2]==-1) {try{
    play(m); 
        l9.setIcon(new ImageIcon(ImageIO.read(firstui.class.getResource(pics[p[m]]))));}
        catch(Exception e2){System.err.println("Error in reading");}
        
       
           own[2][2]=p[m];
         int status=f(p[m]);
         check(status);
            
            l.setText(pl[m]);
        } 
       else{
            JOptionPane.showMessageDialog(null, "You must choose another house");
        
        }
    }//GEN-LAST:event_l9MouseClicked

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
    
        if (p[m]==0) {
            score[p[1]]+=3;
            JOptionPane.showMessageDialog(null, p[0]+" Resigned and Lost\n"+p[1]+" Won!");
            this.dispose();
            NewJFrame yours=new NewJFrame();
            yours.setVisible(true);
        }else{
         score[p[0]]+=3;
            JOptionPane.showMessageDialog(null, p[1]+" Resigned and Lost\n"+p[0]+" Won!");
            this.dispose();
            NewJFrame yours=new NewJFrame();
            yours.setVisible(true);
        
        }
        
        
        
    }//GEN-LAST:event_btn10ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        s=0;
        jLabel3.setText(NewJFrame2.nam);
       jLabel6.setText(NewJFrame3.nam);
        lc1.hide();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                own[i][j]=-1;
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
  



    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel lc;
    private javax.swing.JLabel lc1;
    // End of variables declaration//GEN-END:variables
}
