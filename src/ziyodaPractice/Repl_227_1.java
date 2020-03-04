package ziyodaPractice;

public class Repl_227_1 {
    int timeLeft = 0;
    int maxTime;


    public Repl_227_1(int maxTime){
        this.maxTime = maxTime;
    }
    public boolean add(int val){
        if(val==25 && timeLeft<=maxTime){
            timeLeft+=30;
            return true;
        }else{
            return false;
        }

    }
    public void tick(){

        if(timeLeft>0){
            timeLeft--;
        }
    }
    public boolean isExpired(){

    return  timeLeft==0;
    }
}

