
package com.mycompany.observer;


public interface IFileMonitor {
    
void AddConsoleMonitor(IConsoleMonitor cmObj);    
void DelConsoleMonitor(IConsoleMonitor cmObj);    
void NotifyConsoleMonitor();    
    
}
