public class Level2TaskHandler extends TaskHandler{
    @Override
    public void handleRequest(Request request){
        if(request.getPriority() == Priority.MEDIUM){
            System.out.println("Processing task level of 2 (medium): " + request.getTask());
        }else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
