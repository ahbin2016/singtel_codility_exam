package com.all.singtel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class SolutionTest {

  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  private final PrintStream printStream = System.out;

  @BeforeEach
  public void init() {
    System.out.println("@BeforeEach - Executes");
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  void restoreStreams() {
    System.setOut(printStream);
  }

  @Test
  void walk() {
    new Animal().walk();
    assertThat(outputStream.toString(), containsString("I am walking"));

    new Bird().walk();
    assertThat(outputStream.toString(), containsString("I am walking"));
  }

  @Test
  void fly() {
    new Bird().fly();
    assertThat(outputStream.toString(), containsString("I am flying"));
  }

  @Test
  void sing() {
    new Bird().sing();
    assertThat(outputStream.toString(), containsString("I am singing"));
  }
}
