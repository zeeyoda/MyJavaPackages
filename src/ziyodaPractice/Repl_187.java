package ziyodaPractice;

public class Repl_187 {
    public static void main(String[] args) {
        String db = "1etsy#2wooden#3spoon";
        String op = "edit";
        String id = "2";
        String data = "bbb";
        String[]dbSplit = db.split("#");


        String result;
        if(op.equals("add")){
            result = db.concat(op).concat(id).concat(data);
            System.out.println(result);
        }else if(op.equals("edit") && id.equals("2")){
          // result = db.replace(db.('2', ))
        }

    }
}
