/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerbilmap;
import gerbil.Gerbil;
import java.util.*;
/**
 *
 * @author Jose
 */
public class GerbilMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("John", new Gerbil(1));
        map.put("Hannah", new Gerbil(2));
        map.put("Joey", new Gerbil(3));
        map.put("King", new Gerbil(4));
        map.put("kingston",new Gerbil(5));
        
        Iterator hi = map.keySet().iterator();
        while (hi.hasNext()) {
            String key = (String)hi.next();
            ((Gerbil)map.get(key)).hop();
            
        }
    }
}
