package classwork.chapter12;

public enum Language {
    HY("Armenia"),
    RU("Russia"),
    ENG();
    private String country;

    Language(String country) {
        this.country = country;
    }

    Language() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
