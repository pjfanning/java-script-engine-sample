/*
Copyright 2021 PJ Fanning

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.github.pjfanning.scriptengine;

import javax.script.ScriptEngine;
import java.util.Objects;

import static com.github.pjfanning.scriptengine.Utilities.createScriptEngine;

public class ExecWithSecurityManager {
    public static void main(String[] args) {
        try {
            //you should look at configuring the SecurityManager but this default one prevents the file system
            //access that allows this script to work in `ExecWithoutSecurityManager`
            System.setSecurityManager(new SecurityManager());
            final ScriptEngine scriptEngine = createScriptEngine("javascript");
            System.out.println(Objects.toString(scriptEngine.eval(Utilities.SCRIPT), null));
            System.out.println("script has been run");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
