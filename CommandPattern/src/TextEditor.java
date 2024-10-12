public class TextEditor {
    public void copyText(){
        System.out.println("Text copied.");
    }
    public void pasteText(){
        System.out.println("Text pasted.");
    }
    public void cutText(){
        System.out.println("Text cut.");
    }
    public void undo(){
        System.out.println("Last action undone.");
    }
    public void redo(){
        System.out.println("Last action redone.");
    }
    public void formatText(String formatType){
        System.out.println("Text formatted as " + formatType + ".");
    }
}
