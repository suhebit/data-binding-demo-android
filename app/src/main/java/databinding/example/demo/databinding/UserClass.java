package databinding.example.demo.databinding;

/*
created by suheb on 24/11/16
*/


public class UserClass {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String name;

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    boolean isPremium;
    String city;

    UserClass(String name,
              String city, boolean isPremium) {
        this.name = name;
        this.city = city;
        this.isPremium=isPremium;
    }
}
