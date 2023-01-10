

package com.mycompany.observer;



public class Observer {

    public static void main(String[] args) {
//Создаем объект  FileStatus
        FileStatus  usrFile  =  new FileStatus("user.txt");
        System.out.println(usrFile.getInfomsg());
        
//        System.out.println(usrFile.exist);
//        System.out.println(usrFile.lastModif);
//        System.out.println(usrFile.length);
//        System.out.println(usrFile.nameFile);
//        System.out.println(usrFile.pathFile);
      
        boolean doCycle = true;
        while(doCycle == true){
        

        if(usrFile.UpdateInfo() == true)
        {
            
        System.out.println(usrFile.getInfomsg());
//        System.out.println(usrFile.exist);
//        Date d = new Date(usrFile.lastModif);
//        System.out.println(d);
//        System.out.println(usrFile.length);
//        System.out.println(usrFile.nameFile);
//        System.out.println(usrFile.pathFile);
        
       }
        
      //  System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
        }
    }
        
        
        
        
        
    }
