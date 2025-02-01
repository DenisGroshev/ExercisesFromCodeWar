package S;

public class EmployeeFacade implements Employee{
    Cook cook=new Cook();
    Junitor junitor=new Junitor();
    void cook(){
        cook.cook();
    }
    void cleanFloor(){
        junitor.cleanFloor();
    }

    @Override
    public int getSalarys() {
        return 10;
    }
}
