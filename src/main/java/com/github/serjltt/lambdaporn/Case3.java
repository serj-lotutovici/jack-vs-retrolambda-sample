package com.github.serjltt.lambdaporn;

@SuppressWarnings("ALL") class Case3 implements Case {
  @Override public void act() {
    Operators.getter(() -> {
      visible();
      return get();
    });
    Operators.setter(str -> {
      invisible();
    });
    Operators.adapter(str -> {
      invisible();
      return adapt(str);
    });
  }

  String get() {
    return "case3";
  }

  String adapt(String adapt) {
    return adapt.toLowerCase();
  }

  void visible() {
  }

  private void invisible() {

  }
}
