package ziyodaPractice;

public class Repl_200 {
    public static void main(String[] args) {



    }
    public static boolean isError(String line){
        String[] split = line.split(" ");
        boolean isError = true;
        if(split[0].equals("error")){
            return true;
        }else {
            return false;
        }
    }
}
