package Automation_Questions;

import org.json.JSONException;
//import org.json.JSONObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;

//read Json object
public class PrintJsonData {
    public static void main(String[] args) {
        String fileName = "/Users/rustem/Projects/IdeaProjects/siteSeleniumTest/params.json";
        JSONParser jParser = new JSONParser();
        try {
            FileReader fr = new FileReader(fileName);
            Object obj = jParser.parse(fr);
            JSONObject jObj = (JSONObject) obj;
            System.out.println(jObj);
            String fromCity = (String) jObj.get("From");
            String toCity = (String) jObj.get("To");
            String startDate = (String) jObj.get("Start");
//            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
//            Date startDate = sdf.parse(start);
            String endDate = (String) jObj.get("End");
            int adults = Integer.parseInt((String) jObj.get("Adults"));
            int youth = Integer.parseInt((String) jObj.get("youth"));
            int children = Integer.parseInt((String) jObj.get("children"));
            int infants = Integer.parseInt((String) jObj.get("infants"));
            int lapinfants = Integer.parseInt((String) jObj.get("lapinfants"));
            System.out.println(fileName);
            System.out.println(fromCity);
            System.out.println(toCity);
            System.out.println(startDate);
            System.out.println(endDate);
            System.out.println(adults);
            System.out.println(youth);

        } catch (org.json.simple.parser.ParseException | JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}