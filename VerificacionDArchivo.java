import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



public class VerificacionDArchivo {
    ArrayList<ArrayList<String>> Ver = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> CorrectosES = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> ErroresES = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> CorrectosRS = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> ErroresRS = new ArrayList<ArrayList<String>>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");

    public boolean verificareventos(ArrayList<ArrayList<String>> Ver) {
        this.Ver = Ver;
        if (Ver.size() == 0) {
            return false;
        } else {
            Ver.remove(0);
            for (int i = 0; i < Ver.size(); i++) {
                if (Ver.get(i).size() == 7) {
                    try{
                        int ide = Integer.parseInt(Ver.get(i).get(0));
                        int idp = Integer.parseInt(Ver.get(i).get(1));
                        LocalDate fecha = LocalDate.parse(Ver.get(i).get(3), formatter);
                        LocalTime time = LocalTime.parse(Ver.get(i).get(4), formatter2);
                        int dur = Integer.parseInt(Ver.get(i).get(5));
                        int asis = Integer.parseInt(Ver.get(i).get(6));

                        CorrectosES.add(Ver.get(i));

                    }catch(Exception e){
                        ErroresES.add(Ver.get(i));
                    }
                }
                else{
                    ErroresES.add(Ver.get(i));
                }
            }
            
            
        }
        return true;

    }

    public boolean verificarrecintos(ArrayList<ArrayList<String>> Ver) {
        this.Ver = Ver;
        if (Ver.size() == 0) {
            return false;
        } else {
            Ver.remove(0);
            for (int i = 0; i < Ver.size(); i++) {
                if (Ver.get(i).size() == 4) {
                    try{
                        int idp = Integer.parseInt(Ver.get(i).get(0));
                        int idr = Integer.parseInt(Ver.get(i).get(2));
                        int cap = Integer.parseInt(Ver.get(i).get(3));
                        CorrectosRS.add(Ver.get(i));

                    }catch(Exception e){
                        ErroresRS.add(Ver.get(i));
                    }
                }
                else{
                    ErroresRS.add(Ver.get(i));
                }
            }
            
            
        }
        return true;

    }

    public ArrayList<ArrayList<String>> getCorrectosES() {
        return CorrectosES;
    }

    public ArrayList<ArrayList<String>> getErroresES() {
        return ErroresES;
    }

    public ArrayList<ArrayList<String>> getCorrectosRS() {
        return CorrectosRS;
    }

    public ArrayList<ArrayList<String>> getErroresRS() {
        return ErroresRS;
    }
}
