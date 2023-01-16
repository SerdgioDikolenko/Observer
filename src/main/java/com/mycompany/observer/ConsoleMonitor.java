
package com.mycompany.observer;

import java.util.ArrayList;

public class ConsoleMonitor implements IConsoleMonitor {

    @Override
    public void UpdateConsoleMonitor(ArrayList<String> str) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private ArrayList<FileObj> fileList = new ArrayList<>();            // список объектов для работы с файлами
    private ArrayList<IFileObserver> observers = new ArrayList<>();     // список наблюдателей
    private ArrayList<String> updateFileMessage = new ArrayList<>();    // список всех изменений в файлах
    
    
     // конструктор создающий объект класса ConsoleFileMonitor
    ConsoleMonitor(){  

    }
    
    // конструктор принимающий один путь на файл
    ConsoleMonitor(String path){   
        fileList.add(new FileObj(path));
    }
    
    // конструктор принимающий массив путей на файлы
    ConsoleMonitor(String[] pathArr){   
        for(String path: pathArr)
            fileList.add(new FileObj(path));
    }
    
    // добавление файла для слежения
    public boolean addFile(String path) {
        FileObj fileObj = new FileObj(path);
        
        if(fileList.lastIndexOf(fileObj) == -1) {
            fileList.add(fileObj);
            return true;
        }
        else
            return false;
    }
    
    // удаление файла для слежения
    public boolean removeFile(String path) {
        return fileList.remove(new FileObj(path));
    }
    
    public void addFileObserver(IFileObserver Obj) {
        if(Obj != null)
            observers.add(Obj);
    }

    public void removeFileObserver(IFileObserver Obj) {
        if(Obj != null)
            fileList.remove(Obj);
    }
    
    
    public void notifyFileObserver() {      
        for(IFileObserver fileObserv: observers)
            fileObserv.updateFileHandler(updateFileMessage);
    }
    
    // проверка состояния файлов
    public void checkFile() 
    {
        boolean status = false;
        updateFileMessage.clear();
        
        for(FileObj file: fileList)
            if(file.getUpdateStatus()) {
                updateFileMessage.add(file.getUpdateMessage());
                status = true;
            }
  
        if(status) 
            this.notifyFileObserver();
    }
}
