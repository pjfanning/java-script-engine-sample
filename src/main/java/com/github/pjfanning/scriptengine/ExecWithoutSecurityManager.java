package com.github.pjfanning.scriptengine;

import javax.script.ScriptEngine;
import java.util.Objects;

import static com.github.pjfanning.scriptengine.Utilities.createScriptEngine;

public class ExecWithoutSecurityManager {
    public static void main(String[] args) {
        try {
            final ScriptEngine scriptEngine = createScriptEngine("javascript");
            System.out.println(Objects.toString(scriptEngine.eval(Utilities.SCRIPT), null));
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
