package ziyodaPractice;

public class String_Remove_Duplicate {
    public static void main(String[] args) {

        String str = "jhjhututpopo";
        String result = "";
        for(int x=0; x<str.length(); x++){
            if(!result.contains(str.substring(x, x+1))){
                result+=str.substring(x,x+1);
            }
        }
        System.out.println(result);
        System.out.println("========================================================");

        String namesMixed = "ziyodaablattadiljonazatbeksabirasaida";
        String singleLetters = "";
        for (int i = 0; i < namesMixed.length(); i++) {
            if(!singleLetters.contains(namesMixed.substring(i, i+1))){
                singleLetters+=namesMixed.substring(i, i+1);
            }

        }
        System.out.println(singleLetters);
    }
}
