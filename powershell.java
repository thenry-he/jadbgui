package main_form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class powershell {
    
    public static String line;
    public static String sufex;
    public static String Mom = "";
    public static String aLine = "";
    public static String adbDir = "";
    
    public powershell(){   
    }

public static void mainImput() throws IOException{
      String command;
      command = "powershell.exe " + adbDir + "\""+ sufex;
  // Executing the command
  Process powerShellProcess = Runtime.getRuntime().exec(command);
  // Getting the results
  powerShellProcess.getOutputStream().close();
        try (BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()))) {
            while ((line = stdout.readLine()) != null) {
                 //output = line;
                    if(line != null){
                         
                        Mom += line + "\r\n" ;
                      returnLine();  
                    }                  
            }
            //For everyline of text that isnt empty add it to Mom and make a new line
            
        }
        sufex = "";
        // clear whatever command was last added to sufex
}

public static void mainImput(boolean oneLine) throws IOException{
      String command;
  command = "powershell.exe " + sufex;
  // Executing the command
  Process powerShellProcess = Runtime.getRuntime().exec(command);
  // Getting the resuls
  powerShellProcess.getOutputStream().close();
        try (BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()))) {
            while ((line = stdout.readLine()) != null) {
                 //output = line;
                    if(line != null){
                        if(oneLine ==true){
                        aLine += line + "\r\n" ;
                        
                      returnLine();  
                      oneLine = false;
                        }
                    }
                    
            }
            //Does the same as the above method except can be overloaded with a Boolean so you can get a line of text instead of a whole output
        }
        sufex = "";
        //Clears sufex
}

public static  void returnLine(){
    
    
    main_ui.outputSet(Mom);
   //Runs outputSet in main_ui and set the resulting text to Mom

}
public static void sufexCOM(String com) {
    
    sufex = "./adb.exe " + com;
  //Used to pass commands over from Main. Helps get rid of clutter instead of making alot of methods for diffrent commands
}
public static String returnLineOne(){
    
   return aLine;
   // returns a single line used when mainUI need to know the IP of the device
}
public static void setDIR(String dir){
    
    adbDir = dir;
   // allows the directory to be set for where adb is located
}
}
