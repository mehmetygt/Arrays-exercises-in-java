
public class Kart {
    private  char değer;
    private boolean tahmin = false;

    public Kart(char değer) {
        this.değer = değer;
    }

    /**
     * @return the değer
     */
    public char getDeğer() {
        return değer;
    }

    /**
     * @param değer the değer to set
     */
    public void setDeğer(char değer) {
        this.değer = değer;
    }

    /**
     * @return the tahmin
     */
    public boolean isTahmin() {
        return tahmin;
    }

    /**
     * @param tahmin the tahmin to set
     */
    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
    
    
    
}
