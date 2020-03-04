package CodingBat;

public class String_Boolean {
    public static void main(String[] args) {
//        String str = "bad";
//        boolean isIt = true;
//        if(str.substring(0, 3).equals("bad")){
//            System.out.println(isIt);
//        }else if(str.substring(1, 4).equals("bad")){
//            System.out.println(isIt);
//        }else{
//            System.out.println(!isIt);
//        }

        String a = "hi";
        String b = "guy";

        if(a.length()>=1 && b.length()>=1){
            String com = (""+a.charAt(0)+b.charAt(b.length()-1));
            System.out.println(com);
        }
    }
}
