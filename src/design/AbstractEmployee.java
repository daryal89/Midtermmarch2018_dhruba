package design;

public abstract class AbstractEmployee implements Employee {
    public final String founderName = "Abubokor Hanip";
    static String address = "32-72 Steinway Street, Suite # B02, Astoria, NY 11103";

    public void describeCompany() {
        System.out.println("In the year 2005 " + founderName + " founded the company located at " + address + ".");
    }
    public abstract void describeCompany(String Mission);
}
