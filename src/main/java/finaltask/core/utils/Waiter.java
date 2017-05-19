package finaltask.core.utils;

public final class Waiter {

  public static void waitWithNoCondition(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      e.getMessage();
    }
  }
}
