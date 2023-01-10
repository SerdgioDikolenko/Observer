
package com.mycompany.observer;

import java.io.File;


public class SingleConsoleMonitor {

private static SingleConsoleMonitor instance;

public void InfoFile(String pathNameFile){
File obj       = new File(pathNameFile);
System.out.println(obj.getName());
System.out.println(obj.getPath());
System.out.println(obj.length());
System.out.println(obj.lastModified());
System.out.println(obj.exists());    
}
private SingleConsoleMonitor(){}
public static SingleConsoleMonitor getInstance(){
if(instance == null){
instance = new SingleConsoleMonitor();
}
return instance;    
 }
}
