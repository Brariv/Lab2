import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class DateTime {
     

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");

    public void Calculate(ArrayList<ArrayList<String>> car, String Date){
        
        ArrayList<LocalDate> Fecha = new ArrayList<LocalDate>();
        


        LocalDate fecha = LocalDate.parse(Date, formatter);
        LocalTime time = LocalTime.parse("00:00", formatter2);
        
        for (int i = 0; i < Fecha.size(); i++) {
            //for (LocalDate date = StartDate; date.isBefore(FinalDate); date = date.plusDays(1)) {
            //    if (Fecha.get(i).equals(date)) {
                    
            //    }
            }
        }
        



    }

    

