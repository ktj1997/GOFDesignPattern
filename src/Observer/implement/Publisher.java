package Observer.implement;

public interface Publisher {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer o);

    public void notifyObservers();
}
