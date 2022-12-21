package mib;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class MIB
{
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException {
        try {
            idb = new InfDB ("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(MIB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
