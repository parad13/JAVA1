// Event.java
   import java.util.*;
public class  Event{
    private String eventName,organiserName;
    private double eventCost;
    Event(String eventName, String organiserName, Double eventCost){
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
   }
   void setEventCost(double eventCost){this.eventCost = eventCost;}
   double getEventCost(){return eventCost;}
   
   void setEventName(String eventName){this.eventName = eventName;}
   String getEventName(){return eventName;}
   
   void setOrganiserName(String organiserName){this.organiserName = organiserName;}
   String getOrganiserName(){return organiserName ;}
   static void display(List<Event> eventList){
       eventList.forEach(
           (n)-> System.out.println(n)
       );
   }
   public String toString(){
       return eventName+"|"+organiserName+"|"+eventCost;
   }
}   

// Main.java
import java.io.*;
import java.util.*;
public class Main{

   public static void main(String[] args) throws IOException{
       InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(r);
        System.out.println("Enter the number of events");
        int n = Integer.parseInt(br.readLine());
        List<Event> eventList = new ArrayList<>(); 
        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");
        String input = new String();
        for(int i=0;i<n;i++){
            input = br.readLine();
            String[] data = input.split(",");
            eventList.add(new Event(data[0],data[1],Double.parseDouble(data[2])));
        }
        Event.display(eventList);
   }
}   