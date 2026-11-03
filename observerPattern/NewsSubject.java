public interface NewsSubject {
    public void attach(SubObserver subscriber);
    public void detach(SubObserver subscriber);
    public String notifySubscriber();
}