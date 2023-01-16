
package com.mycompany.observer;

import java.util.ArrayList;


public class FaleMonitor implements IConsoleMonitor {
    
private ArrayList<ConsoleMonitor> observer;    
private ArrayList<FileStatus> FileObj;    
    
   
    FaleMonitor(){
    ArrayList<ConsoleMonitor> observers = new ArrayList<ConsoleMonitor>();
    ArrayList<FileStatus> fileObj = new ArrayList<FileStatus>();
            }
    public void addFile(String filePath){
        // add is equal & проверку файла с одинаковыми полями
    FileStatus Obj = new FileStatus(filePath);
    FileObj.add(Obj);
    }
    public void AddConsoleMonitor(IConsoleMonitor cmObj) {
        if(cmObj!=null)
        { 
            Iterable<IConsoleMonitor> observers = null;
            for(IConsoleMonitor Obj:observers){
            if( Obj ==cmObj)
                return;
            }
        
        }
    }

    public void DelConsoleMonitor(IConsoleMonitor cmObj) {
       
    }

    public void NotifyConsoleMonitor() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    ArrayList<String> list = new ArrayList<String>();
    Iterable<FileStatus> fileObj = null;
      
        for(FileStatus objF: fileObj)
        {   if(objF.UpdateInfo()==true){
                list.add(objF.getInfomsg());
            }       
        }
        if(!list.isEmpty()){
        Iterable<IConsoleMonitor> observers = null;
        for(IConsoleMonitor obj: observers)
        {
            obj.UpdateConsoleMonitor(list);
        }
      } 
    }        

    @Override
    public void UpdateConsoleMonitor(ArrayList<String> str) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}