package cbtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public final class MyLibTest {
  @Test
  public void testTheValue() {
    assertEquals(MyLib.getValue(), 123);
  }
}
