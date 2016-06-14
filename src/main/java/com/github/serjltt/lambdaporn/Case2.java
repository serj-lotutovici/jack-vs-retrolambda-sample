package com.github.serjltt.lambdaporn;

@SuppressWarnings("ALL") class Case2 implements Case {
  @Override public void act() {
    Operators.setter(this::set);
    Operators.getter(this::get);
    Operators.adapter(this::adapt);
  }

  private String get() {
    return "case2";
  }

  private void set(String str) {

  }

  private String adapt(String adapt) {
    return adapt.toUpperCase();
  }
}
