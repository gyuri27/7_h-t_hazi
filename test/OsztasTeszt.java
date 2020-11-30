/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hetedik_het_hazi.Hetedik_het_hazi_kivitel;
import org.junit.Test;
import static org.junit.Assert.*;

public class OsztasTeszt {
    
    public OsztasTeszt() {
    }
    
    @Test
    public void osztasÖttel() throws Hetedik_het_hazi_kivitel {
        int oszto = 10;
        int nevezo = 5;
        int elvárás = 2;
        int eredmény = hetedik_het_hazi.Hetedik_het_hazi.osztás(oszto, nevezo);
        assertEquals(eredmény, elvárás);
    }
    
    @Test
    public void osztasÖnmagaval() throws Hetedik_het_hazi_kivitel {
        int oszto = 10;
        int nevezo = 10;
        int elvárás = 1;
        int eredmény = hetedik_het_hazi.Hetedik_het_hazi.osztás(oszto, nevezo);
        assertEquals(eredmény, elvárás);
    }
    
    @Test
    public void osztasNullaval() throws Hetedik_het_hazi_kivitel {
        int oszto = 10;
        int nevezo = 0;
        int elvárás = 0;
        int eredmény = hetedik_het_hazi.Hetedik_het_hazi.osztás(oszto, nevezo);
        assertEquals(eredmény, elvárás);
    }
    
    
    
    
}
