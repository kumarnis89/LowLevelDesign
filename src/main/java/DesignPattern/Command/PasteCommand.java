package DesignPattern.Command;

public class PasteCommand implements Command{
    private Editor editor;

    public PasteCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }
}
