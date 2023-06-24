package structural.proxy;

import java.io.IOException;

public class MainProxy {
    public static void main(String[] args) throws IOException {
        System.out.println("Proxy");
        CommandExec commandExec;
        String cmd = "dir";
        try {
            commandExec = new CommandExecProxy("a", "");
            commandExec.runCommand(cmd);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            commandExec = new CommandExecProxy("golo", "1234");
            commandExec.runCommand(cmd);
        }
    }
}
