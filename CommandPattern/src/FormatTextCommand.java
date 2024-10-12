public class FormatTextCommand implements Command{
    private TextEditor editor;
    private String formatType;

    public FormatTextCommand(TextEditor editor){
        this.editor = editor;
    }
    public void setFormatType(String formatType){
        this.formatType = formatType;
    }
    @Override
    public void execute(){
        if(formatType != null){
            editor.formatText(formatType);
        }else{
            System.out.println("Format type not set.");
        }
    }
}
