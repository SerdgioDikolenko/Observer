
package com.mycompany.observer;

import java.io.File;
import java.util.Date;

public class FileStatus {
    

    File obj;
    String nameFile;
    String pathFile;
    long length;
    long lastModif;
    boolean exist;
    String msgStatus;
    String []statusData;
    
// Инициализируем все параметры
    FileStatus(String pathNameFile) {
        obj       = new File(pathNameFile);
        nameFile  = obj.getName();
        pathFile  = obj.getPath();
        length    = obj.length();
        lastModif = obj.lastModified();
        exist     = obj.exists();
        statusData = new String[5];
        
        statusData[0] = nameFile;
        statusData[1] = pathFile;
        statusData[2] = String.valueOf(exist);
        statusData[3] = String.valueOf(new Date(lastModif));
        statusData[3] = String.valueOf(length);       
        
        //Date d = new Date(lastModif);
        msgStatus = "File name - " + nameFile +"\n" +
               "File exist - " +  exist +"\n" +
               "Last modify - " + new Date(lastModif)+ "\n" +
               "File size - " + length +"\n";
    }
    
    
    boolean UpdateInfo() {
        boolean infoChanged = false;
        if (exist != obj.exists()) {
            exist = obj.exists();
            infoChanged = true;
            if (exist == true) {
                length = obj.length();
                lastModif = obj.lastModified();
            } else {
                length = 0;
                lastModif = 0;
            }
        }
        else
        {
            if(this.lastModif != obj.lastModified())
            {
                this.lastModif = obj.lastModified();
                this.length = obj.length();
                infoChanged = true;
            }                
        }
        
       if(infoChanged == true){
       
        statusData[0] = nameFile;
        statusData[1] = pathFile;
        statusData[2] = String.valueOf(exist);
        statusData[3] = String.valueOf(new Date(lastModif));
        statusData[3] = String.valueOf(length);           
           
           
           
//хард код           
        msgStatus =  "File name - " + nameFile +"\n" +
                     "File exist - " +  exist +"\n" +
                     "Last modify - " + new Date(lastModif)+ "\n" +
                     "File size - " + length +"\n";
       } 
           
        return infoChanged;
    }
    
    
    String getInfomsg()
    {
    return msgStatus ;
    }
    String[] getStatusData()
    {
    return statusData ;
    }
    
}

