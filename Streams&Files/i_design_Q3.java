// Event.Java
public class Event {
	//fill your code here
	private String eventName , ownerName;
	private Integer attendeesCount;
	Event(){}
	Event(String eventName, Integer attendeesCount, String ownerName){
		this.eventName=eventName;
		this.attendeesCount=attendeesCount;
		this.ownerName=ownerName;
	}
	void setEventName(String eventName){this.eventName=eventName;}
	String getEventName(){return eventName;}
	void setOwnerName(String ownerName){this.ownerName=ownerName;}
	String getOwnerName(){return ownerName;}
	void setAttendeesCount(Integer attendeesCount){this.attendeesCount=attendeesCount;}
	Integer getAttendeesCount(){return attendeesCount;}
}
// EventBO.java
import java.io.*;
import java.util.*;
public class EventBO {
	//fill your code here
	public List<Event> readFromFile(BufferedReader br) throws Exception{
		List<Event> a = new ArrayList<Event>();
		
		String input = br.readLine();
		while(input != null){
			String[] data = input.split(",");
			if(data.length !=3) break;
			a.add(new Event(data[0],Integer.parseInt(data[1]),data[2]));
			input = br.readLine();
		}
        return a;
	}
	void writeFile(List<Event> eventList,FileWriter fr) throws Exception{
		BufferedWriter bw = new BufferedWriter(fr);
		HashSet<String> hs = new HashSet<>();
		for(Event x : eventList){
			if(hs.contains(x.getOwnerName())) continue;
			hs.add(x.getOwnerName());
			String data = x.getEventName()+","+x.getAttendeesCount()+","+x.getOwnerName();
			bw.write(data,0,data.length());
			bw.newLine();
		}
		bw.flush();
	}
}
// Main.java
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		//fill your code here
		FileWriter fr  = new FileWriter("output.txt");
		FileReader f = new FileReader("input.txt");
		EventBO ubo = new EventBO();
		BufferedReader br = new BufferedReader(f);
		List<Event> list = ubo.readFromFile(br);
		ubo.writeFile(list,fr);
	}
}