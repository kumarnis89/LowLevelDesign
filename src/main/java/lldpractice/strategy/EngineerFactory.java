package lldpractice.strategy;

public class EngineerFactory {
    private EngineerFactory(){

    }

    public static Engineer createEngineer(String name, Designation designation){
        Engineer engineer = null;
        switch (designation){
            case SDE1:
                engineer = new SDE1Engineer(name, designation, new Sde1Strategy());
                break;
            case SDE2:
                engineer =  new SDE2Engineer(name, designation, new Sde2Strategy());
                break;
            case SDE3:
                engineer =  new SDE3Engineer(name, designation, new Sde3Strategy());
                break;
            default:
                break;
        }
        return engineer;
    }
}
