import java.io.*;
import java.util.ArrayList;


public class FilesManager {
    public static ArrayList<ArrayList<String>> readFiles(String path) {
        ArrayList<ArrayList<String>> file = new ArrayList<ArrayList<String>>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitWords = line.split(",");
                ArrayList<String> list = new ArrayList<String>();
                for (String word : splitWords) {
                    list.add(word.trim());
                }
                file.add(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return file;
    }

    public static void writeFiles(String path, ArrayList<String> file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (String word : file) {
                writer.write(word);
                writer.write(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendline(String path, ArrayList<String> file){
        try {
            FileWriter fw = new FileWriter(path, true);
            for (String word : file) {
                fw.write(word);
                fw.write(",");
            }
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }




    public static void savePath(String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("path.txt"))) {
            writer.write(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String[] readPath(){
        try (BufferedReader reader = new BufferedReader(new FileReader("path.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitWords = line.split(",");
                return splitWords;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }



}
