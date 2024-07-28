package DesignPattern.Command;

public class Button {
    private String label;
    private Command command;

    public Button(String label) {
        this.label = label;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void click(){
        if(command!=null){
            command.execute();
        }
    }

    public String getLabel(){
        return label;
    }
}
