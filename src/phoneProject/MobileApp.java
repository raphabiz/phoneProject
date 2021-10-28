package phoneProject;

/**
 * Classe représentant une application mobile contenue dans un téléphone (phone).
 * Une application mobile possède un nom (appname) et une taille mémoire (appsize).
 *
 * @author  raphabiz
 * @version 08/10/21
 */
public class MobileApp
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String appname;
    private double appsize;
    private Phone phone;
    
    /**
     * Constructeur d'objets de classe MobileApp
     */
    public MobileApp()
    {
        // initialisation des variables d'instance
    }
    
    public String getAppName() {
       return appname;
    }

    public void setAppName(String appname) {
       this.appname = appname;
    }
    
    public double getAppSize() {
       return appsize;
    }

    public void setAppSize(double appsize) {
       this.appsize = appsize;
    }
    
    public String getPhone() {
       return phone.toString();
    }

    public void setPhone(Phone phone) {
       this.phone = phone;
    }
 
    public String toString() {
       return "App : " + this.getAppName() + " Size : " + this.getAppSize() +" Mo";
    }
    
}

