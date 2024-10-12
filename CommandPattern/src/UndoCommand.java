public class UndoCommand implements Command{
    private TextEditor editor;

    public UndoCommand(TextEditor editor){
        this.editor = editor;
    }
    @Override
    public void execute(){
        editor.undo();
    }
}
