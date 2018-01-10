import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarPage {

    private final String title = "testing";

    public CalendarPage isLoaded() {
        $("#drawerMiniMonthNavigator").shouldBe(Condition.visible);
        return this;
    }

    public CalendarPage pressAddEventButton() {
        $(".Ip8zfc").click();
        return this;
    }

    public CalendarPage addEvent(){
        $("#tabEventDetails").shouldBe(Condition.visible);
        $(".mVuQpd").find("#xTiIn").setValue(title);
        $(".dRjtd").click();
        $("#xSaveBu").click();
        return this;
    }

    public void checkEvent() {
        $$(".eADW5d").findBy(Condition.text(title)).shouldBe(Condition.exist).click();
        $(".JtukPc").shouldBe(Condition.visible);
        $(".osAuJb").shouldHave(Condition.text(title));
    }
}
