package convertHour;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Solucao {

  
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

    
   public static String timeConversion(String s) {
      
       String type = (s.contains("AM")) ? "AM" : "PM"; 
       
       String[] aux = s.substring(0, 8).split(":");
       
       int horas = Integer.parseInt(aux[0]);
       int minutos = Integer.parseInt(aux[1]);
       int segundos = Integer.parseInt(aux[2]);
       
       if (type.equalsIgnoreCase("AM")){
           if (horas >= 12) horas = horas - 12; 
       }
       else {
           if (horas < 12) horas = horas + 12;
       }
       
       String res = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.of(horas, minutos, segundos));
       return res;
   }

   
    
}
