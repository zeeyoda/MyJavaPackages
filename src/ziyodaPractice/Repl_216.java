package ziyodaPractice;
import java.util.*;

class Repl_216 {
    public static void main(String[] args) {
        Repl_216 m = new Repl_216();
        ArrayList<String[]> arr = new ArrayList<String[]>();
        arr.add(new String[]{"1", "title 1", "content"});
        arr.add(new String[]{"2", "title 2", "content"});
        arr.add(new String[]{"3", "title 3", "content3"});

        String id = "1";
        String[] sptlitID = id.split(" ");
        String result = "";
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i)[j].equals(id)) {
                    result = result + arr.get(i)[j + 1] + "\n" + arr.get(i)[j + 2];
                }
            }
        }
            System.out.println(result);




        }





//        String post = m.blogDb(arr, "3");
//        System.out.print(post);
//        //should output:
//        //title 3
//        //content3
    }

//    public String blogDb(ArrayList<String[]> r, String id) {
//        String result = "";
//        for (int i = 0; i < r.size(); i++) {
//            if (r.get(i).equals(id)) {
//                result = result+r.get(i) + "\n" + r.get(i + 1);
//            }
//
//        }
//        return result;
//    }
//}

