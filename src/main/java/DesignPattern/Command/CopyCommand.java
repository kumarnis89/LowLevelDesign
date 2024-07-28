package DesignPattern.Command;

public class CopyCommand implements Command{
    private Editor editor;

    public CopyCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }
}
