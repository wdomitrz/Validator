
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author witek
 */
public class EMail {
    
    private String adress;
    
    private boolean isCorrect;
    
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        changeSupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener){
        changeSupport.removePropertyChangeListener(listener);
    }

    public String getAdress() {
        return adress;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setAdress(String adress) {
        this.adress = adress;
        setIsCorrect(!correctEmail());
    }

    private void setIsCorrect(boolean isCorrect) {
        boolean old = this.isCorrect;
        this.isCorrect = isCorrect;
        changeSupport.firePropertyChange("isCorrect",old,this.isCorrect);
    }

    private boolean correctEmail() {
        return adress.equals("asd");
    }
}
