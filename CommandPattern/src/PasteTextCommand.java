public class PasteTextCommand implements Command{
    private TextEditor editor;

    public PasteTextCommand(TextEditor editor){
        this.editor = editor;
    }
    @Override
    public void execute(){
        editor.pasteText();
    }
}
