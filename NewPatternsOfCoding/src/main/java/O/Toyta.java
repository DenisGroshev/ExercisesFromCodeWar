package O;

public class Toyta implements Car{

    void getPassangers() {
        System.out.println("get passangers");
    }
    @Override
    public void workInTaxis() {
        getPassangers();
    }
}

