package O;

public class Celica2012 extends Toyta{
    void getPassangers() {
        System.out.println("get two passangers");
    }
    @Override
    public void workInTaxi(){
        getPassangers();
    }
}
