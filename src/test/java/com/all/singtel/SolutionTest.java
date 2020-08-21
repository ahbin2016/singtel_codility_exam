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
    new Bird().canWalk();
    assertThat(outputStream.toString(), containsString("I am walking"));

    new Chicken().canWalk();
    assertThat(outputStream.toString(), containsString("I am walking"));

    new Duck().canWalk();
    assertThat(outputStream.toString(), containsString("I am walking"));

    new Rooster().canWalk();
    assertThat(outputStream.toString(), containsString("I am walking"));
  }

  @Test
  void fly() {
    new Duck().canFly();
    assertThat(outputStream.toString(), containsString("I am flying"));
  }

  @Test
  void sing() {
    new Bird().callSound("I am singing");
    assertThat(outputStream.toString(), containsString("I am singing"));

    new Duck().callSound("Quack, quack");
    assertThat(outputStream.toString(), containsString("Quack"));

    new Chicken().callSound("Cluck cluck");
    assertThat(outputStream.toString(), containsString("Cluck"));

    new Rooster().callSound("Cock-a-doodle-doo");
    assertThat(outputStream.toString(), containsString("Cock-a-doodle-doo"));
  }

  @Test
  void swim() {
    new Duck().canSwim();
    assertThat(outputStream.toString(), containsString("I am swimming"));
  }
}
