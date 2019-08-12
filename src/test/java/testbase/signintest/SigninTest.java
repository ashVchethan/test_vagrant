package testbase.signintest;
import pages.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class SigninTest extends TestBase {

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing(){
        Assert.assertEquals(Pages.signIn().signin(),"There were errors in your submission");
    }

}
