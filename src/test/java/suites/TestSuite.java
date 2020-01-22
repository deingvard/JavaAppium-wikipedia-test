package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.iOS.ArticleTests;
import tests.GetStartedTest;
import tests.SearchTests;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SearchTests.class,
        GetStartedTest.class,
        ArticleTests.class
})
public class TestSuite {
}
