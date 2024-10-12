import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        TextEditorInvoker invoker = new TextEditorInvoker();
        FormatTextCommand formatCommand = new FormatTextCommand(editor);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nChoose  an action:");
            System.out.println("1. Copy text");
            System.out.println("2. Paste text");
            System.out.println("3. Cut text");
            System.out.println("4. Format text");
            System.out.println("5. Undo");
            System.out.println("6, Redo");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    invoker.setCommand(new CopyTextCommand(editor));
                    break;
                case 2 :
                    invoker.setCommand(new PasteTextCommand(editor));
                    break;
                case 3 :
                    invoker.setCommand(new CutTextCommand(editor));
                    break;
                case 4 :
                    System.out.println("Select format type (Bold, Italic, Underline):");
                    String formatType = scanner.next();
                    formatCommand.setFormatType(formatType);
                    invoker.setCommand(formatCommand);
                    break;
                case 5 :
                    invoker.setCommand(new UndoCommand(editor));
                    continue;
                case 6 :
                    invoker.setCommand(new RedoCommand(editor));
                    continue;
                case 7 :
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    continue;

            }
            invoker.executeCommand();
        }

    }
}
