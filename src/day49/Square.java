package day49;

public class Square extends Shape implements Drawable {

    int length;

    public Square(int len){

        length = len;
    }
    @Override
    public void draw() {

    }
    @Override
    public void calculateArea(){
        int area =length*length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

}
