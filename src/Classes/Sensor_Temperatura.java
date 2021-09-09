package Classes;
import java.util.Random;

public class Sensor_Temperatura {
    private int temperatura;
   
    public Sensor_Temperatura(){
        
    }
        
    public int getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura() {
        Random random = new Random();
        this.temperatura = random.nextInt(50 - (-10) + 1)+(-10);
    }
    
}
