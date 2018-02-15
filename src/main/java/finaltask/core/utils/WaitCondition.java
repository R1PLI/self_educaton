package finaltask.core.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.function.Function;

@Getter
@RequiredArgsConstructor
public enum WaitCondition {

  visible(ExpectedConditions::visibilityOfElementLocated),
  clickable(ExpectedConditions::elementToBeClickable),
  presented(ExpectedConditions::presenceOfElementLocated);

  private final Function<By, ExpectedCondition<WebElement>> type;
}
