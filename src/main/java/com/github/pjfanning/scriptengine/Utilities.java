package com.github.pjfanning.scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Utilities {
    public static String COMMAND = "open /Users/pj.fanning/Downloads/Trim_Customer_code.docx";
    public static String SCRIPT = "java.lang.Runtime.getRuntime().exec('" + COMMAND + "')";

    public static ScriptEngine createScriptEngine(String engineName) {
        final ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName(engineName);
        if (scriptEngine == null) {
            throw new IllegalArgumentException("No script engine named " + engineName);
        }
        return scriptEngine;
    }
}
