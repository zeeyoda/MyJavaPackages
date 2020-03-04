package day63MapWord_Character_Frequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException  {

      List<String> allData = Files.readAllLines(Paths.get("src\\day63MapWord_Character_Frequency\\employeedata.txt"));
        System.out.println(allData);//printing the whole data in one line

        Map<Integer, String> idPair = new HashMap<>();
        for(String eachLine:allData){
            int id = Integer.parseInt(eachLine.split("\\.")[0]);
        String name = eachLine.split("\\.")[1];
            System.out.println("id is "+id);
            System.out.println("name is "+name);
            idPair.put(id, name);
        }
        System.out.println("idPair = "+idPair);

        //how to get the person with id 6
        System.out.println("idPair.get(=) = "+idPair.get(6));
//        Map<Integer, String> idPair = new HashMap<>();
//        idPair.put(id, name);
//        System.out.println(idPair);
//           // System.out.println("each data = "+eachLine);
//        }
        //1.sabira --- 1  sabira --> I want to get number and name separately

//        String line = "1.sabira";
//        int id = Integer.parseInt(line.split("\\.")[0]);
//        String name = line.split("\\.")[1];
        //allData.forEach(eachLine ->System.out.println("each data = "+eachLine));



    }
}
