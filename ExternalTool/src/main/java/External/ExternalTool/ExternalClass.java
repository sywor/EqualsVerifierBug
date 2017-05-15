package External.ExternalTool;


public abstract class ExternalClass
{
    
    private String dni;
    public ExternalClass() 
    {
    };
      
    public ExternalClass( String dni ) 
    {
           this.dni=dni;
    }

    /**
     * @return the dni
     */
    public String getDni()
    {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni)
    {
        this.dni = dni;
    }
    
    public abstract String testDNI();
    
    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        
        if (!(obj instanceof ExternalClass)) {
            return false;
        }
        
        ExternalClass other = (ExternalClass) obj;

        if(dni == null) return false;

        return dni.equals(other.dni);
    }
    
    @Override
    public int hashCode() {
        int hash = 1;
        if(dni == null)
            hash = hash * 31;
        else
            hash = hash * 31 + dni.hashCode();

        return hash;
    }


}
