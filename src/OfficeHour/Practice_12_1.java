package OfficeHour;

public class Practice_12_1 {
    public static void main(String[] args) {
        //              012345678901234564567890123
        String item = "Echo Dot (3rd Gen) Charcoal";
        // get whatever is inside parenthesis ()

        // find out index of (and index of), use them for substring to get the text

        System.out.println( item.substring(10, 18));
        System.out.println( item.substring(9, 17));

        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");

        String wordInsideParenthesis = item.substring(indexOfOpeningParenthesis+1, indexOfEndingParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);
    }
}
