import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.Test;

public class CreateEventInCalendar {
    @Rule
    public TextReport textReport = new TextReport();

    @Test
    public void CreateEvent(){
        new MainPage().openLogInForm()
                .logIn()
                .openGoogleApplicationsList()
                .selectCalendar();
        new CalendarPage().isLoaded().pressAddEventButton()
                .addEvent()
                .checkEvent();
    }
}
