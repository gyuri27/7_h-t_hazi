
package hetedik_het_hazi;

/**
 *
 * @author gyurk
 */
public class Hetedik_het_hazi {

    public static int osztás(int osztó, int nevező) throws Hetedik_het_hazi_kivitel{
        if(nevező == 0) throw new Hetedik_het_hazi_kivitel("Nem lehet nulla a nvező!");
        if(osztó == nevező) {return 1;};
        return osztó/nevező;
    }
    public static int négyzetreEmelés(int x) throws Hetedik_het_hazi_kivitel
     {
         if(x==0) throw new Hetedik_het_hazi_kivitel("0-nak a négyzete 0");
         return x*x;
     }

    public static void main(String[] args) {
        
    }
  
    
}
