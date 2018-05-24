import static org.assertj.core.api.Java6Assertions.assertThat;

import me.pavekovt.travisci.TestService;
import org.junit.jupiter.api.Test;

public class TestServiceTests {

  @Test
  void TestExpectedWorkOutput() {
    final String expected = "expected";
    TestService testService = new TestService(expected);

    assertThat(testService.doWork())
        .isSameAs(expected);
  }

}
