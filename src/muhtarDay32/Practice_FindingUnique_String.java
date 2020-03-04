package muhtarDay32;

public class Practice_FindingUnique_String {
    public static void main(String[] args) {
        String str = "ldfjlfgjnzxsdglkb";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += str.charAt(i);
            }
        }
            System.out.println(result);
        }
    }

