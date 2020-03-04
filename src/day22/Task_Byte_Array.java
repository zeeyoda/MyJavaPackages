package day22;

public class Task_Byte_Array {
    public static void main(String[] args) {

        byte[] data = new byte[4];
        data[0] = 2;
        data[1] = 8;
        data[2] = 10;
        data[3] = 0;

        System.out.println(data[0]);
        data[0]=99;
        System.out.println(data[0]);
        System.out.println(data[1]);
        data[1]= 85;
        System.out.println(data[1]);
        System.out.println(data[2]);
        data[2]= 15;
        System.out.println(data[2]);
        System.out.println(data[3]);
        data[3] = 13;
        System.out.println(data[3]);




    }
}
