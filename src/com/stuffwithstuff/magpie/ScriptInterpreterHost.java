package com.stuffwithstuff.magpie;

import com.stuffwithstuff.magpie.interpreter.InterpreterHost;
import com.stuffwithstuff.magpie.interpreter.ModuleInfo;

public class ScriptInterpreterHost implements InterpreterHost {
  @Override
  public boolean allowTopLevelRedefinition() {
    return false;
  }

  @Override
  public void print(String text) {
    System.out.print(text);
  }

  @Override
  public ModuleInfo loadModule(String name) {
    return Script.loadModule(name);
  }
}
