package S;

public class EmployeeFacade {
    Cook cook=new Cook();
    Junitor junitor=new Junitor();
    void cook(){
        cook.cook();
    }
    void cleanFloor(){
        junitor.cleanFloor();
    }
}
