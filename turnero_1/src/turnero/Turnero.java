/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnero;

import turnero.vista.VistaAsesor;
import turnero.vista.VistaTurnero;
/**
 *
 * @author jpala
 */
public class Turnero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaTurnero vt = new VistaTurnero();
        VistaAsesor va = new VistaAsesor();
        vt.setVisible(true);
        va.setVisible(true);
        
    }
}
