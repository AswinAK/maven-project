package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Howdy , %s!", someone);
  }
}
