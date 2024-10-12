public class RedoCommand implements Command{
    private TextEditor editor;

    public RedoCommand(TextEditor editor){
        this.editor = editor;
    }
    @Override
    public void execute(){
        editor.redo();
    }
}
