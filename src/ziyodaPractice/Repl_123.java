package ziyodaPractice;

public class Repl_123 {
    public static void main(String[] args) {

        int growth = 1;
        int size = 0;
        for (int i = 0; i <=10; i++) {
            if(i<3){
                growth=1;
                size = size+1;
                System.out.println("year "+i+" - growth "+growth+" cm");
                System.out.println("tree size: "+size+" cm");
            }
            if(i>3){
                growth=2;
                size = size +2;
                System.out.println("year "+i+" - growth "+growth+" cm");
                System.out.println("tree size: "+size+" cm");
            }

        }

    }
}
