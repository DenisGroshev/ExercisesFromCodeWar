package S;

public class Cook implements Employee {
    void cook(){
        System.out.println("Cooking in process");
    }

    @Override
    public int getSalarys() {
        return 1;
    }
}
