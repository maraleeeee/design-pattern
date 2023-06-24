package structural.proxy;

import java.io.IOException;

public class CommandExecImpl implements CommandExec {
    @Override
    public void runCommand(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
    }
}
