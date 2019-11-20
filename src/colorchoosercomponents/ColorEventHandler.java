/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosercomponents;

import java.util.ArrayList;

/**
 *
 * @author Jake
 */
public class ColorEventHandler {

    private static ArrayList<ColorListener> listeners = new ArrayList<>();

    //Home of the event fire
    public static void fireColorEvent(ColorEvent ce) {
        ArrayList list;
        //Removed the syncing, as it dooesn't work with static. Wanted to avoid
        //using the same code in multiple places, as well as jumping through
        //hoops to find a reference to the right class. Static seemed like the 
        //way to go. Removing syncing doesn't seem to break anything.  
       list = (ArrayList) listeners.clone();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ColorListener colorListener = (ColorListener) listeners.get(i);
            colorListener.changeColor(ce);
        }
    }

    public static void addColorListener(ColorListener colorListener) {
        listeners.add(colorListener);
    }

    public static void removeColorListener(ColorListener colorListener) {
        listeners.remove(colorListener);
    }

}
