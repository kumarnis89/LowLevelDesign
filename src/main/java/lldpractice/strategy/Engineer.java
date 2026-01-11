package lldpractice.strategy;

public class Engineer {
      String name;
      Designation designation;
      BaseStrategy baseStrategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Engineer(String name, Designation designation) {
        this.name = name;
        this.designation = designation;

        switch (designation){
            case SDE1:
                this.baseStrategy = new Sde1Strategy();
                break;
            case SDE2:
                this.baseStrategy = new Sde2Strategy();
                break;
            case SDE3:
                this.baseStrategy = new Sde3Strategy();
                break;
            default:
                break;
        }

    }

    public double calculateIncrement(){
        return this.baseStrategy.calculate();
    }
}
