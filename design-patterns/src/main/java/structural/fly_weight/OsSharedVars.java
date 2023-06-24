package structural.fly_weight;

import java.util.HashMap;

public class OsSharedVars {
    private static OsSharedVars instance;

    public static OsSharedVars getInstance() {
        if (instance == null)
            instance = new OsSharedVars();

        return instance;
    }

    private HashMap<String, Os> osMap = new HashMap<>();

    private OsSharedVars() {
    }

    public Os getOs(OsType type, Bit bit) {
        String key = genKey(type, bit);
        Os os = osMap.get(key);
        if (os == null) {
            os = new Os(type, bit);
            osMap.put(key, os);
        }
        return os;
    }

    private String genKey(OsType type, Bit bit) {
        return type.name() + bit;
    }
}
