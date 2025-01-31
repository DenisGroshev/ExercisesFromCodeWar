package O;

public class Main {
    public static void main(String[] args) {
        Toyta   toyta=new Toyta();
        Celica celica=new Celica();
        Celica2012 celica2012=new Celica2012();

        toyta.workInTaxi();
        celica.workInTaxi();
        celica2012.workInTaxi();

    }
    static void workInTaxi(Car car) {
        car.workInTaxis();
    }
}
