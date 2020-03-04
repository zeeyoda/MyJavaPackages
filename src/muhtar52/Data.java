package muhtar52;

public abstract class Data {

    protected abstract int add(int a, int b);
}
class Sam extends Data{

    public int add(int a, int b){
        return a+b;
    }

}
class AllInOne{
    public static void main(String[] args) {
      Sam obj = new Sam();
        System.out.println(obj.add(10, 20));

    }
}
