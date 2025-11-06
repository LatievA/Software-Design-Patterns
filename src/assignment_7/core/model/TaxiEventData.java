package assignment_7.core.model;

public class TaxiEventData {
    private final String taxiId;
    private final TaxiStatus status;
    private final String location;

    public TaxiEventData(String taxiId, TaxiStatus status, String location) {
        this.taxiId = taxiId;
        this.status = status;
        this.location = location;
    }

    public String getTaxiId() {
        return taxiId;
    }

    public TaxiStatus getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "TaxiEventData{" +
                "taxiId='" + taxiId + '\'' +
                ", status=" + status +
                ", location='" + location + '\'' +
                '}';
    }
}
