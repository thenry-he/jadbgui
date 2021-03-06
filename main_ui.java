
package main_form;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class main_ui extends javax.swing.JFrame {
    /**
     *
     */
    public static String command = "";
private boolean swtich;
public static String directoryChosen ="";
    /**
     * Creates new form main_ui
     */
    public main_ui() {
        this.swtich = false;
        initComponents();
        jcommandOutput.setEditable(false);
        //Disables adding text to the output of commands entered
            
    }
    /*
    
    
    */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        deviceList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcommandOutput = new javax.swing.JTextArea();
        installApp = new javax.swing.JButton();
        wirelessADB = new javax.swing.JButton();
        chooseFile = new javax.swing.JButton();
        sendFile = new javax.swing.JButton();
        adbDIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deviceList.setText("List Devices");
        deviceList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceListActionPerformed(evt);
            }
        });

        jcommandOutput.setColumns(20);
        jcommandOutput.setRows(5);
        jScrollPane1.setViewportView(jcommandOutput);

        installApp.setText("Install app");
        installApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installAppActionPerformed(evt);
            }
        });

        wirelessADB.setText("WIFI ADB");
        wirelessADB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wirelessADBActionPerformed(evt);
            }
        });

        chooseFile.setText("Choose File");
        chooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileActionPerformed(evt);
            }
        });

        sendFile.setText("Send File");
        sendFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendFileActionPerformed(evt);
            }
        });

        adbDIR.setText("ADB Folder");
        adbDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbDIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(adbDIR)
                        .addGap(43, 43, 43)
                        .addComponent(deviceList)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wirelessADB)
                            .addComponent(chooseFile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(installApp)
                            .addComponent(sendFile))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deviceList)
                            .addComponent(adbDIR))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(installApp)
                            .addComponent(wirelessADB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chooseFile)
                            .addComponent(sendFile))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main_ui().setVisible(true);
            }
        });
    }
    private void deviceListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceListActionPerformed
        
            // TODO add your handling code here:

                         powershell.sufexCOM(" devices");
                         runPower();
                         //Lists all devices that adb can see
    
    }//GEN-LAST:event_deviceListActionPerformed

    private void installAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installAppActionPerformed
        // TODO add your handling code here:
        //String dir = ""
       // outputSet("put app into main Directoy as app.apk");
        if(directoryChosen.equals("") || directoryChosen.substring(directoryChosen.lastIndexOf("."), directoryChosen.length()).equals(".apk") == false){
            outputSet("File not chosen or wrong file type");
            System.out.println(directoryChosen.substring(directoryChosen.lastIndexOf("."), directoryChosen.length()));
        }else{
        powershell.sufexCOM(" install " + "'" + directoryChosen + "'");
        runPower();
        //Checks if the file chosen ends in apk or has anything selected at all
        //Single Quotes are used around directory incase spaces are whithin it
        }
    }//GEN-LAST:event_installAppActionPerformed

    private void wirelessADBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wirelessADBActionPerformed
       boolean oneLine = true;
      
        powershell.sufexCOM(" shell ip route '|' awk '''{print $9}'''");
       runPower(oneLine);
        powershell.sufexCOM(" tcpip 5555");
       runPower();
       powershell.sufexCOM(" connect "+ powershell.returnLineOne() );
       runPower();
       // List all ips on the device connected. In each case we want the first one
       // runPower(boolean) is used so only the first line is taken from output
       // connects adb to the ip that was returned
    }//GEN-LAST:event_wirelessADBActionPerformed

    private void chooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileActionPerformed
        // TODO add your handling code here:
        final JFileChooser chooser = new JFileChooser();
chooser.setFileSelectionMode( JFileChooser.FILES_ONLY );
int returnVal = chooser.showOpenDialog( this );
        
if( returnVal == JFileChooser.APPROVE_OPTION ) {
    directoryChosen = chooser.getSelectedFile().getAbsolutePath();
}
//Opens a new file window that gives the option to choose only a file. So no folders or drives
    }//GEN-LAST:event_chooseFileActionPerformed

    private void sendFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendFileActionPerformed
        // TODO add your handling code here:
        if(directoryChosen.equals("")){
            outputSet("File not chosen");
            System.out.println(directoryChosen.substring(directoryChosen.lastIndexOf("."), directoryChosen.length()));
        }else{
        powershell.sufexCOM(" push " + "'"+ directoryChosen+ "'"+" /storage/emulated/0/Download"  );
        runPower();
        }
        //Gets the chosen directory from before then send it to the downloads folder on the device
        //Single Quotes are used around directory incase spaces are whithin it
    }//GEN-LAST:event_sendFileActionPerformed

    private void adbDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbDIRActionPerformed
        // TODO add your handling code here:
                final JFileChooser chooser = new JFileChooser();
chooser.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
int returnVal = chooser.showOpenDialog( this );       
if( returnVal == JFileChooser.APPROVE_OPTION ) {
    directoryChosen = chooser.getSelectedFile().getAbsolutePath();
    powershell.setDIR(directoryChosen);
}
//Lets the user select what directory ADB is in. This is needed for the program to work
    }//GEN-LAST:event_adbDIRActionPerformed
                                             
private void runPower(){
    
    try {
            powershell.mainImput();          
        } catch (IOException ex) {
            Logger.getLogger(main_ui.class.getName()).log(Level.SEVERE, null, ex);
        }
} 
//Called from multiple methods to send commands to other class. Tidys up code so IO exceptions arent needed whenever a command is needed
 private void runPower(boolean oneLine){
    
    try {
            powershell.mainImput(oneLine);
        } catch (IOException ex) {
            Logger.getLogger(main_ui.class.getName()).log(Level.SEVERE, null, ex);
        }
}// Does the same as mentiond above but takes a boolean for getting a single line of output    
public static String returnFile(){
        return directoryChosen;
}
   // returns the directoryChosen string

public static String returnCommand(){
    return command;   
}
public static void outputSet(String mom){
   
jcommandOutput.setText(mom);   
}
//sets text of output of textarea(commandOutput)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adbDIR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chooseFile;
    private javax.swing.JButton deviceList;
    private javax.swing.JButton installApp;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jcommandOutput;
    private javax.swing.JButton sendFile;
    private javax.swing.JButton wirelessADB;
    // End of variables declaration//GEN-END:variables
}
