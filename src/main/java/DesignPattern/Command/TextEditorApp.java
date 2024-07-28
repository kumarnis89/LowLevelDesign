package DesignPattern.Command;

public class TextEditorApp {

    public static void main(String[] args) {
        Editor editor = new Editor();

        CopyCommand copyCommand = new CopyCommand(editor);
        PasteCommand pasteCommand = new PasteCommand(editor);

        Button copyBtn = new Button("Copy");
        copyBtn.setCommand(copyCommand);

        Button pasteBtn = new Button("Paste");
        pasteBtn.setCommand(pasteCommand);

        copyBtn.click();
        pasteBtn.click();

    }
}
