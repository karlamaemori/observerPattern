import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {
    private String agencyName;
    private String headline;
    private NewsCategory category;
    private List<SubObserver> subscriberList;

    public NewsAgency(String agencyName) {
        this.agencyName = agencyName;
        this.subscriberList = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public NewsCategory getCategory() {
        return category;
    }

    public void setCategory(NewsCategory category) {
        this.category = category;
    }

    public List<SubObserver> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<SubObserver> subscriberList) {
        this.subscriberList = subscriberList;
    }

    public String publishNews(String headline, NewsCategory category) {
        this.headline = headline;
        this.category = category;
        return notifySubscriber();
    }

    @Override 
    public void attach(SubObserver subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(SubObserver subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override 
    public String notifySubscriber() {
        String output = new String();
        for (SubObserver subscriber : subscriberList) {
            output += subscriber.updateNews(this);
        }
        return output;
    }
}