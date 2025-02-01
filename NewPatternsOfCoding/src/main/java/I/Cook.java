package I;

public class Cook implements IWorker{
    @Override
    public void work() {
        System.out.println("I cook");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }
}
