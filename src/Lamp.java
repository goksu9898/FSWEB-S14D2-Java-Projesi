
public class Lamp {

    private boolean battery;
    private int globRating;
    private LampType style;
    public Lamp(boolean battery, int globRating,LampType style){
        this.battery=battery;
        this.globRating=globRating;
        this.style=style;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
    public LampType getSyle(){
        return this.style;
    }

    public boolean isBattery(){
       return this.battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }
}
