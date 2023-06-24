package structural.proxy;

import java.io.IOException;
import java.util.Locale;
import java.util.Objects;

public class CommandExecProxy implements CommandExec {
    private boolean isAdmin;
    private CommandExec exec;

    public CommandExecProxy(String user, String pass) {
        isAdmin = auth(user, pass);
    }

    private boolean auth(String user, String pass) {
        return user.toLowerCase(Locale.ROOT).equals("golo") && Objects.equals(pass, "1234");
    }

    @Override
    public void runCommand(String cmd) throws IOException {
        if (isAdmin) {
            if (exec == null)
                exec = new CommandExecImpl();

            System.out.println("Running command");
            exec.runCommand(cmd);
            System.out.println("Done");
        } else
            throw new RuntimeException("Not allowed");
    }
}
