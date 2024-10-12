public class CopyTextCommand implements Command{
    private TextEditor editor;

    public CopyTextCommand(TextEditor editor){
        this.editor = editor;
    }

    @Override
    public void execute(){
        editor.copyText();
    }
}
