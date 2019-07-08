public class Wilder {

    // attributs
    private String firstname;
    private boolean aware;

    // constructeurs
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
   
    // méthode instanciée
    public String whoAmI() {
    	if (String.valueOf(this.aware) == "false")
        {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
        else {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }
    }
    
    // accesseurs (getters)

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }
    
    // mutateurs (setters)
       
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
}

