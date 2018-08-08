import javax.lang.model.element.NestingKind;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesIO {
    public static void main(String[] args) {
        String directory = "testy";
        String filename = "test-info.text";

//        Path thisFile = Paths.get("src", "FilesIO.java");
//        System.out.println(thisFile.toAbsolutePath());

        // getting
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        // creating
        if(Files.notExists(dataDirectory)) {
            try{
                Files.createDirectories(dataDirectory);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        if(Files.notExists(dataFile)){
            try {
                Files.createFile(dataFile);
            } catch(IOException e){
                e.printStackTrace();
            }
        }

        List<String> names = new ArrayList<>();
        names.add("mike | " + "12345");
        names.add("stuff two");

        // writing
        try {                           // NEED THIS TO NOT OVERWRITE FILE!!!
            Files.write(dataFile, names, StandardOpenOption.APPEND);
        } catch(IOException e) {
            e.printStackTrace();
        }




        // reading
        try {
            List<String> contents = Files.readAllLines(dataFile);
            System.out.println(contents.toString()); // THIS ONLY 'PEAKS' INTO ARRAY
        } catch(IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

        // Listing after read
        List<String> listStuff = null;
        try {
            listStuff = Files.readAllLines(dataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i =0; i < listStuff.size(); i++){
            System.out.println((i + 1) + ": " + listStuff.get(i));
        }

        // add a line w/ number to each list from for loop
        try {
            Files.write(dataFile, Arrays.asList("eggs"), StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }


//        // Replace items in List
//        List<String> listStuff2 = null;
//        try {
//            listStuff2 = Files.readAllLines(dataFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<String> newList = new ArrayList<>();
//
//        for(String eachLine: listStuff2){
//            if(eachLine.equalsIgnoreCase("eggs")){
//                newList.add("something else");
//                continue;
//            }
//            newList.add(eachLine); // CREATES A NEW FILEish to OVERIDE test.txt file
//            // w/ this new array
//        }
//
//        try {
//            Files.write(dataFile, newList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Listing after you edit file
//
//        for (int i =1; i < listStuff2.size() - 1; i++){
//            System.out.println((i) + ": " + listStuff2.get(i));
//            //System.out.println(i);
//        }
    }
}
