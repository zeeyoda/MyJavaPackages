package ziyodaPractice;

public class Repl_176_boolean_Return {
    public static void main(String[] args) {

    }
    public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {

        return isAvailable && (month!=7||!(day>1 &&day<8)) && year==2018;

    }
}
