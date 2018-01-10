import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    //TestData
    private final String email = "testing.10.01.2018@gmail.com";
    private final String password = "qzwxecrvtb";


    public MainPage openLogInForm(){
        Configuration.browser = "chrome";
        open("https://www.google.com.ua");
        $("#gb_70").click();
        return this;
    }

    public MainPage logIn(){
        $("[type='email']").shouldBe(Condition.visible).setValue(email);
        $("#identifierNext").click();
        $("[type='password']").shouldBe(Condition.visible).setValue(password);
        $("#passwordNext").click();
        $(".sbibtd").shouldBe(Condition.visible);
        return this;
    }

    public MainPage openGoogleApplicationsList(){
        $(".gb_Mc").click();
        $(".gb_Z").shouldBe(Condition.visible);
        return this;
    }

    public void selectCalendar(){
        $("[data-pid='24']").click();
    }

}
