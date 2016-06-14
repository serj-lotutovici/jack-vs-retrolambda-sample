package com.github.serjltt.lambdaporn;

@SuppressWarnings("ALL") class Case1 implements Case {
  @Override public void act() {
    Operators.getter(this::get);
    Operators.setter(this::set);
    Operators.adapter(this::adapt);
  }

  String get() {
    return "case1";
  }

  void set(String str) {

  }

  String adapt(String adapt) {
    return adapt.toLowerCase();
  }
}
