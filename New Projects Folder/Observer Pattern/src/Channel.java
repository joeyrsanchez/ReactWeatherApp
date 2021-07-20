import java.util.ArrayList;

public class Channel implements Subject{
    public ArrayList<Observer> observers = new ArrayList<>();
	public String channelName;
	public String status;

	public Channel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.delete(index);
	}

	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(status);
		} 
	}
}

