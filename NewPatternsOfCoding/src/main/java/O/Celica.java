package O;

public class Celica extends Toyta{
    void getPassanger() {
        System.out.println("Get one passanger");;
    }

    @Override
    public void workInTaxis() {
        getPassanger();
    }
}
