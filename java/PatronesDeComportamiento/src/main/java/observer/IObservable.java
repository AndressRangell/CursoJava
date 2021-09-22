package observer;

public interface IObservable {

    void addObserver(IObserver observer);
    
    void notificar();
    
}
