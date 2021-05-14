package classes;

public class Date {
    private String day;
    private String month;
    private String year;

    public Date(String day, String month, String year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
          return day + '\'' + month + '\'' + year + '\'';
    }
}
