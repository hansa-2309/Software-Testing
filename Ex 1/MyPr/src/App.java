import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestCase;

public class App {
    public static void main(String[] args) throws Exception {
        Result result=JUnitCore.runClasses(TestCase.class);
        for(Failure failure :result.getFailures())
        {
            System.out.println(failure.getMessage());
        }
        System.out.println(result.wasSuccessful());
    }
}
