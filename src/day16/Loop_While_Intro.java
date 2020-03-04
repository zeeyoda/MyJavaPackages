package day16;

public class Loop_While_Intro {
    public static void main(String[] args) {
        //print Hello World 5 times
        //also keep the count of how many times u said hello
        int count = 1 ;
        System.out.println("Hell World");
        //count = count + 1;
        //count += 1;
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        System.out.println("Hello World");
        ++count;
        System.out.println("Count is " + count);
       // -------------------------------------------------------------

        int cnt = 1;
        while(cnt<=5){
            System.out.println("Hello");
            ++cnt; // this will increase this value by one

        }
        /*1st time in the loop:
        check this 1<=5 -->> true
            hello world
            cnt value is 1
            increase the cnt value to 2

            2nd time:
            check this 2>=5 -->>true
                    hello world
                    cnt value is 2
                    increase the cnt value to 3

            3rd time:
            check this 3>=5 -->>true
                    hello world
                    cnt value is 3
                    increase the cnt value to 4
                    2nd time:
           4th time:
            check this 4>=5 -->>true
                    hello world
                    cnt value is 4
                    increase the cnt value to 5

           5th time:
            check this 5=5 -->>true
                    hello world
                    cnt value is 5
                    increase the cnt value to 6

            6th time:
            count = 6
             check this 6<=5 -->>false
             GET OUT OF THE LOOP
         */





    }
}
