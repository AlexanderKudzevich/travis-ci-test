package me.pavekovt.travisci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestService {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);
  private String testVaribale;

  public TestService(String testVaribale) {
    this.testVaribale = testVaribale;
  }

  public String doWork() {
    LOGGER.info("Did some work!");
    return "work output: " + testVaribale;
  }

  public String getTestVaribale() {
    return testVaribale;
  }
}
