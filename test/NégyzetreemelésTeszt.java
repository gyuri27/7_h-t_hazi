/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import hetedik_het_hazi.Hetedik_het_hazi_kivitel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Soltész M. Bence
 */
public class NégyzetreemelésTeszt {
    
    public NégyzetreemelésTeszt() {
    }
    
 
    
    @Test
    public void NegativÖtNégyzete() throws Hetedik_het_hazi_kivitel {
        int szam = -5;
        int elvárás = 25;
        int eredmény = hetedik_het_hazi.Hetedik_het_hazi.négyzetreEmelés(szam);
        assertEquals(eredmény, elvárás);
    }
     @Test
    public void TizenkettöNégyzete() throws Hetedik_het_hazi_kivitel {
        int szam = 12;
        int elvárás = 144;
        int eredmény = hetedik_het_hazi.Hetedik_het_hazi.négyzetreEmelés(szam);
        assertEquals(eredmény, elvárás);
    }
     @Test
    public void NullaNégyzete() throws Hetedik_het_hazi_kivitel {
        int szam = 0;
        int elvárás = 0;
        int eredmény = hetedik_het_hazi.Hetedik_het_hazi.négyzetreEmelés(szam);
        assertEquals(eredmény, elvárás);
    }
}
