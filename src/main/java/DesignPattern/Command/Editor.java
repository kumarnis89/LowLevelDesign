package DesignPattern.Command;

public class Editor {
    private String clipboard;
    private String text = "";

    public void copy(){
        clipboard = getSelectedText();
        System.out.println("Text copied to clipboard : " + clipboard);
    }

    public void paste(){
        if(clipboard!=null){
            text+=clipboard;
        }
        System.out.println("Text after pasting : " + text);
    }

    private String getSelectedText(){
        return "Selected Text";
    }
}
