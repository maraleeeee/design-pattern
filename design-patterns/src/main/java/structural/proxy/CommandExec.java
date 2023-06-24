package structural.proxy;

import java.io.IOException;

public interface CommandExec {
    void runCommand(String cmd) throws IOException;
}
