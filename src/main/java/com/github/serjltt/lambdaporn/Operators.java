package com.github.serjltt.lambdaporn;

/** Static operators to simulate getter use. */
final class Operators {

  static void getter(Interfaces.Getter getter) {
    getter.get();
  }

  static void setter(Interfaces.Setter setter) {
    setter.set("setter");
  }

  static void adapter(Interfaces.Adapter adapter) {
    adapter.adapt("adapt");
  }

  private Operators() {
  }
}
