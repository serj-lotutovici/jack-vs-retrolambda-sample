package com.github.serjltt.lambdaporn;

/** Collection of interfaces that are meant to be a lambda. */
interface Interfaces {
  interface Getter {
    String get();
  }

  interface Setter {
    void set(String str);
  }

  interface Adapter {
    String adapt(String str);
  }
}
