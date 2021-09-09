package Classes;

import java.util.Random;

public class Sensor_Umidade {
    private int umidade;
    
    public Sensor_Umidade() {
    
    }
    //separa as views de umidade e temperatura, ACHA NO CODE AIII
    
    public void setUmidade(int temperatura){
        Random random = new Random();
        if(temperatura < 15){
            this.umidade = random.nextInt(200);//umidade alta
        }else{
            if(temperatura >= 15 && temperatura  < 25){
                this.umidade = 200 + random.nextInt(500 - 200);//umidade media-alta
            }else{
                if(temperatura >=25 && temperatura < 30){
                    this.umidade = 500 + random.nextInt(800 - 500);//umidade media
                }else{
                    if(temperatura >= 30 && temperatura < 35){
                        this.umidade = 800 + random.nextInt(900 - 800);//umidade baixa
                    }else{
                        this.umidade = 900 + random.nextInt(1023 - 900);//umidade muito baixa
                    }
                }
                
            }
        }
    }
    
    
    public int getUmidade() {
        return umidade;
    }

    
}