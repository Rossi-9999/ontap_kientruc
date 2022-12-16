package observer_design_pattern;

public interface Subject {
void attach(Observer observer);
void detach(Observer observer);
void notifyUpdate(Message message);
}
