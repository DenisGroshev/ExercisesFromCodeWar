package S;

public class Junitor implements Employee {
    void cleanFloor(){
        System.out.println("Cleaning floor");
    }

    @Override
    public int getSalarys() {
        return 10;
    }
}
