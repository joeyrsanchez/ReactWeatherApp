import java.util.ArrayList;
import java.util.Observer;

public class Employee {

    private String name;
    private int id;
    private String title;
    private long salary;
    private ArrayList<Observer> observers;

    Employee(String name, int id, String title) {
        this.name = name;
        this.id = id;
        this.title = title;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public long getSalary() {return this.salary;}
    public void setSalary(long salary) {this.salary = salary;}
    
    private void notifyObservers() {
        for(Observer observer: observers) {
            System.out.println("Notified");
        }
    }

	public String getNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNumber(Integer number) {
		// TODO Auto-generated method stub
		
	}

}

