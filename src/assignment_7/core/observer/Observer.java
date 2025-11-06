package assignment_7.core.observer;

import assignment_7.core.model.TaxiEventData;

public interface Observer {
    void onTaxiUpdate(TaxiEventData eventData);
}
