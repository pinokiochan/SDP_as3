public class CutTextCommand implements Command{
    private TextEditor editor;

    public CutTextCommand(TextEditor editor){
        this.editor = editor;
    }

    @Override
    public void execute(){
        editor.cutText();
    }
}
