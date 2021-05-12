import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Condition;


public class TestePrincipalPages {

        public TestePrincipalPages argentina() {
            open("https://site.gympass.com/ar/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/ar/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages brasil() {
            open("https://site.gympass.com/br/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/br/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages chile() {
            open("https://site.gympass.com/cl/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/cl/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages alemanha() {
            open("https://site.gympass.com/de/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/de/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages espanha() {
            open("https://site.gympass.com/es/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/es/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages italia() {
            open("https://site.gympass.com/it/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/it/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages mexico() {
            open("https://site.gympass.com/mx/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/mx/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages portugal() {
            open("https://site.gympass.com/pt/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/pt/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages united_kingdom() {
            open("https://site.gympass.com/uk/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/uk/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }

        public TestePrincipalPages estados_unidos() {
            open("https://site.gympass.com/us/");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            open("https://site.gympass.com/us/companies");
            $(".alert-danger").shouldNot(Condition.appear);
            $(".journal-template-error").shouldNot(Condition.appear);
            return this;
        }


    }

