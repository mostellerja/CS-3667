
public class DisplayLog implements Command {
    private RemoteControl remCon;
    public DisplayLog(RemoteControl remote) {
        remCon = remote;
    }
    @Override
    public void execute() {
        System.out.println("\nRemote's Display Log:\n");
    for (Command i : remCon.commandLog)
        System.out.println(i.display());
    }
    @Override
    public void undo() {

    }
    @Override
    public String display() {
        return null;
    }
}
