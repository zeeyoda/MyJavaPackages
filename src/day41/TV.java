package day41;

public class TV {
    String brand;
    boolean isOn;
    int currentChannel;
    /**
     *  behaviours :
     *    	turnOn
     *    	turnOff
     *    	getcurrentChannel
     *    	setcurrentChannel (newChannelNumber)
     *    	moveForward
     * 	moveBackward
     */
    public void turnOn(){


        if(isOn==false) {
            System.out.println("Turning on TV.");
            isOn = true;
        }
    }

    public  void turnOff(){
        if(isOn==true) { //same as if(isOn==true)
            System.out.println("Turning off TV.");
            isOn = false;
        }
    }
    public int getCurrentChannel(){
        return currentChannel;
    }
    // we cannot set the channel if the TV is off
    //valid channel if from 1-50
    public void setChannel(int newChannel){
        if(newChannel<0 || newChannel>50){
            System.out.println("Invalid Channel");
        }
        if(isOn==true) {
            currentChannel = newChannel;
        }else{
            System.out.println("Turn on the TV first");
        }
    }

    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
