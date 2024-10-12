import java.util.Stack;

public class TextEditorInvoker {
    private Command command;
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();
    public void setCommand(Command command){
        this.command = command;
    }
    public void executeCommand(){
        if(command != null){
            command.execute();
            commandHistory.push(command);
            redoStack.clear();
        }

    }
    public void undoCommand(){
        if(!commandHistory.isEmpty()){
            Command lastCommand = commandHistory.pop();
            redoStack.push(lastCommand);
            System.out.println("Last Command undone");
        }
    }
    public void redoCommand(){
        if(!commandHistory.isEmpty()){
            Command lastUndoneCommand = redoStack.pop();
            lastUndoneCommand.execute();
            commandHistory.push(lastUndoneCommand);
            System.out.println("Last command redone.");
        }
    }
}
