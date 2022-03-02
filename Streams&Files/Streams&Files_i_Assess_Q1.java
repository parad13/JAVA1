import java.io.*;
import java.lang.*;
public   class Main{
    public static void main(String[] args) throws Exception{
        InputStreamReader r = new InputStreamReader(System.in);
        FileWriter fr = new FileWriter("airport.csv");
        BufferedReader br = new BufferedReader(r);
        BufferedWriter bw = new BufferedWriter(fr);
        System.out.println("Enter the name of the airport");
        String airportName = br.readLine();
        System.out.println("Enter the city name");
        String cityName = br.readLine();
        System.out.println("Enter the country code");
        String countryCode = br.readLine();
        String data = airportName +","+cityName+","+countryCode;
        bw.write(data,0,data.length());
        bw.flush();
        bw.close(); r.close();br.close();fr.close();
    }
}