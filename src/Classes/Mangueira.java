package Classes;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mangueira {
    private String msg;
    private String dataFormatada;
    private String horaFormatada;
    
    public Mangueira(){
      
    }
    
    public String getMsg(){
        return this.msg;
    }
    public void setMsg(int umidade){
        
        DateTimeFormatter formatador;
        if(umidade < 200){
            this.msg = "Umidade alta. Não irrigado!";
        }else{
            if(umidade >= 200 && umidade < 500){
                this.msg = "Umidade média-alta. Não irrigado!";
            }else{
                if(umidade >= 500  && umidade < 800){
                    this.msg = "Umidade média. Não Irrigado!";
                }else{
                    if(umidade >= 800 && umidade < 900){
                        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        this.msg  = "Umidade baixa. *Irrigado!*";
                        LocalDate data = LocalDate.now();
                        this.dataFormatada = data.format(formatador);
                        LocalTime time = LocalTime.now();
                        formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
                        this.horaFormatada = time.format(formatador);
                    }else{
                        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        this.msg  = "Umidade muito baixa. *Irrigado*!";
                        LocalDate data = LocalDate.now();
                        this.dataFormatada = data.format(formatador);
                        LocalTime time = LocalTime.now();
                        formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
                        this.horaFormatada = time.format(formatador);
                    }
                }
                
            }
        }
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public String getHoraFormatada() {
        return horaFormatada;
    }

    public void setHoraFormatada(String horaFormatada) {
        this.horaFormatada = horaFormatada;
    }
    
    
    
}

