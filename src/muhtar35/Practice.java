package muhtar35;



public class Practice {
    public static void main(String[] args) {
        Practice p1 = new Practice(10, 20);

        Practice p2 = new Practice(true);

    }
    public Practice(int a, int b){
       System.out.println("This is a 2 arg constructor "+a+", "+b);

    }
    public Practice(boolean a){
        this(5, 9);
        System.out.println("This is a one arg boolean constructor "+a);
    }
}
