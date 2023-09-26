import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {

    public void showMenu() {
		String opt = "";
        String PATHEs;
        String PATHRs;
		ArrayList<ArrayList<String>> RS = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> ES = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> CorrectosES = new ArrayList<ArrayList<String>>();
    	ArrayList<ArrayList<String>> ErroresES = new ArrayList<ArrayList<String>>();
    	ArrayList<ArrayList<String>> CorrectosRS = new ArrayList<ArrayList<String>>();
    	ArrayList<ArrayList<String>> ErroresRS = new ArrayList<ArrayList<String>>();
		VerificacionDArchivo verificacionDArchivo = new VerificacionDArchivo();
        
        

		do {
            String[] PATH = FilesManager.readPath();
            System.out.println("Path de eventos: " + PATH[0]);
            System.out.println("Path de reservas: " + PATH[1]);
			System.out.println("Bienvenido a la plataformas de reserva");
			System.out.println("Seleccione su opcion");
			System.out.println("1. Consultar Recinto");
			System.out.println("2. Asignar Recinto");
			System.out.println("3. cargar archivos csv");
            System.out.println("4. Salir");
			
			Scanner in = new Scanner(System.in);
			opt = in.nextLine();
			
			if (opt.equals("1")) {
                
                

			} else if (opt.equals("2")) {
                
                


			} else if (opt.equals("3")) {
                System.out.println("Ingrese el path de el archivo eventos");
                PATHEs = in.nextLine();
                System.out.println("Ingrese el path de el archivo reservas");
                PATHRs = in.nextLine();
                String paths = PATHEs+ ","+ PATHRs;
                FilesManager.savePath(paths);
				RS = FilesManager.readFiles(PATHRs);
				ES = FilesManager.readFiles(PATHEs);
				if (verificacionDArchivo.verificareventos(ES) == true) {
					if (verificacionDArchivo.verificarrecintos(RS) == true) {
						System.out.println("Se han cargado los archivos correctamente");
						CorrectosES = verificacionDArchivo.getCorrectosES();
						ErroresES = verificacionDArchivo.getErroresES();
						CorrectosRS = verificacionDArchivo.getCorrectosRS();
						ErroresRS = verificacionDArchivo.getErroresRS();
					} else {
						System.out.println("No se han cargado los archivos correctamente");
					}
				} else {
					System.out.println("No se han cargado los eventos correctamente");
				}
				
				
				


			} else if (opt.equals("4")) {
				System.out.println("Adios");
                in.close();
			} else {
				System.out.println("Opcion no valida");
			}
			
			
		}while(!opt.equals("4"));
        
	}

}
