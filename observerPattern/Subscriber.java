public class Subscriber implements SubObserver {
    private String subscriberName;
    private NewsCategory preference;

    public Subscriber(String subscriberName, NewsCategory preference) {
        this.subscriberName = subscriberName;
        this.preference = preference;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public NewsCategory getPreference() {
        return preference;
    }

    public void setPreference(NewsCategory preference) {
        this.preference = preference;
    }

    @Override 
    public String updateNews(NewsAgency na) {
        if (preference != NewsCategory.ALL && preference != na.getCategory()) {
            return "";
        }
        String output = new String();
        output += "Hey, " + subscriberName + "!\n";
        output += "BREAKING [" + na.getCategory() + "] from " + na.getAgencyName() + ": " + na.getHeadline() + "\n\n";
        return output;
    }
}