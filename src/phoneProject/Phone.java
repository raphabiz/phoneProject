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
    private String phonename;
    private ArrayList<MobileApp> mobileapps = new ArrayList<MobileApp>();

    /**
     * Constructeur d'objets de classe CopyOfPhone
     */
    public Phone()
    {
        // initialisation des variables d'instance
        this.battery = 100;
        this.phonename = "default name";
        
        MobileApp call = new MobileApp();
        call.setAppName("call");
        call.setAppSize(26.0);
        this.mobileapps.add(call);
        
        MobileApp messages = new MobileApp();
        messages.setAppName("messages");
        messages.setAppSize(20.0);
        this.mobileapps.add(messages);
    }
    
    public ArrayList<MobileApp> getMobileApps() {
        return this.mobileapps;
    }
    public void setMobileApps (MobileApp mobileapp) {
    	if(verifyUnicityOf(mobileapp)) {
    		this.mobileapps.add(mobileapp);
    	}
    }

	/**
	 * @param mobileapp
	 */
	private boolean verifyUnicityOf(MobileApp mobileapp) {
		// Creation of tampon
		 String tampon = new String();
		 // Iteration on arraylist mobileapps
		 for (int i=0; i<this.mobileapps.size();i++) {
			 // We check if there is already same appname than mobileapp in mobileapps  
			 if(this.mobileapps.get(i).getAppName() == mobileapp.getAppName()) {
				 // We store tampon appname if we found same appname 
				 tampon = this.mobileapps.get(i).getAppName();
			 }
			// We store nothing
		 }
		 // tampon is empty signify that mobileapp appname isn't in mobileapps arraylist 
		 if (tampon.isEmpty()) {
			 // We store mobileapp as an unique app.
			 return true;
		 }
		 return false;
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
       return phonename;
    }

     public void setName(String name) {
       this.phonename = name;
    }
    
    public String toString() {
       return "Phone : " + this.getName() + " Battery : " + this.getBattery() +"%"+
      " Memory size : " + this.getMemorySize() + " Mo " + this.getMobileApps()+"" ;
    }
    
}

