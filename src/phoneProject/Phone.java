package phoneProject;

import java.util.*;

/**
 * Classe représentant un téléphone contenant des applications (mobileapps).
 * Le téléphone possède un nom (name), un niveau de batterie (battery) et une taille mémoire (memorysize).
 *
 * @author  raphabiz
 * @version 08/10/21
 */
public class Phone
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int battery;
    private double memorysize;
    private String name;
    private ArrayList<MobileApp> mobileapps = new ArrayList<MobileApp>();

    /**
     * Constructeur d'objets de classe CopyOfPhone
     */
    public Phone()
    {
        // initialisation des variables d'instance
        this.battery = 100;
        this.name = "default name";
        
        MobileApp call = new MobileApp();
        this.mobileapps.add(call);
        call.setAppName("call");
        call.setAppSize(26.0);
        
        MobileApp messages = new MobileApp();
        this.mobileapps.add(messages);
        messages.setAppName("messages");
        messages.setAppSize(20.0);
    }
    
    public ArrayList<MobileApp> getMobileApps() {
        return this.mobileapps;
    }
    public void setMobileApps (MobileApp mobileapp) {
       this.mobileapps.add(mobileapp);
    }
    
    public int getBattery() {
       return battery;
    }

    public void setBattery(int battery) {
       this.battery = battery;
    }
    
    public double getMemorySize() {
       return memorysize;
    }

     public void setMemorySize(double memorysize) {
       this.memorysize = memorysize;
    }
    
    public String getName() {
       return name;
    }

     public void setName(String name) {
       this.name = name;
    }
    
    public String toString() {
       return "Phone : " + this.getName() + " Battery : " + this.getBattery() +"%"+
      " Memory size : " + this.getMemorySize() + " Mo " + this.getMobileApps()+"" ;
    }
    
}

