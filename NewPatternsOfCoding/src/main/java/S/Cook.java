package S;

public class Cook implements Employee {
    void cook(){
        System.out.println("Cooking in process");
    }

    @Override
    public int getSalary() {
        return 1;
    }
}
