package com.all.singtel;

import com.all.singtel.util.SoundEnum;
import com.all.singtel.util.SoundHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
  void walkTest() {
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
  void flyTest() {
    new Duck().canFly();
    assertThat(outputStream.toString(), containsString("I am flying"));

    new Parrot().canFly();
    assertThat(outputStream.toString(), containsString("I am flying"));
  }

  @Test
  void singTest() {
    new Bird().callSound();
    assertThat(outputStream.toString(), containsString("I am singing"));

    new Duck().callSound();
    assertThat(outputStream.toString(), containsString("Quack"));

    new Chicken().callSound();
    assertThat(outputStream.toString(), containsString("Cluck"));

    new Rooster().callSound();
    assertThat(outputStream.toString(), containsString("Cock-a-doodle-doo"));

    new Parrot().callSound();
    assertThat(outputStream.toString(), containsString("I am singing"));

    new Parrot(new SoundHelper(SoundEnum.DOG)).callSound();
    assertThat(outputStream.toString(), containsString("Woof, woof"));

    new Parrot(new SoundHelper(SoundEnum.CAT)).callSound();
    assertThat(outputStream.toString(), containsString("Meow"));

    new Parrot(new SoundHelper(SoundEnum.ROOSTER)).callSound();
    assertThat(outputStream.toString(), containsString("Cock-a-doodle-doo"));
  }

  @Test
  void swimTest() {
    new Duck().canSwim();
    assertThat(outputStream.toString(), containsString("I am swimming"));

    new Fish().canSwim();
    assertThat(outputStream.toString(), containsString("I am swimming"));
  }

  @Test
  void colorTest() {
    assertEquals(new Fish().color(), "");
    assertEquals(new Shark().color(), "grey");
    assertEquals(new Clownfish().color(), "orange");
  }

  @Test
  void sizeTest() {
    assertEquals(new Fish().size(), "");
    assertEquals(new Shark().size(), "large");
    assertEquals(new Clownfish().size(), "small");
  }

  @Test
  void specialFishTest() {
    new Shark().canEat();
    assertThat(outputStream.toString(), containsString("eat fish"));

    new Clownfish().makeJoke();
    assertThat(outputStream.toString(), containsString("jokes"));
  }
}
