package ma.pavekovt.travisci;

import static org.assertj.core.api.Java6Assertions.assertThat;

import me.pavekovt.travisci.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestServiceTests {

  @Test
  public void TestExpectedWorkOutput() {
    final String expected = "expected";
    TestService testService = new TestService(expected);

    assertThat(testService.doWork())
        .isEqualTo("work output: " + expected);
  }

}
