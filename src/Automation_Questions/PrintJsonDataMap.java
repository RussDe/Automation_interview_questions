package Automation_Questions;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//import org.json.JSONObject;

//read Json object
public class PrintJsonDataMap {
    public static void main(String[] args) {
        String fileName = "/Users/rustem/Projects/IdeaProjects/siteSeleniumTest/params.json";
        JSONParser jParser = new JSONParser();
        try {
            FileReader fr = new FileReader(fileName);
            Object obj = jParser.parse(fr);
            JSONObject jObj = (JSONObject) obj;

            String fromCity = (String) jObj.get("From");
            String toCity = (String) jObj.get("To");
            String startDate = (String) jObj.get("Start");
//            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
//            Date startDate = sdf.parse(start);
            String endDate = (String) jObj.get("End");
            Set<String> keys = jObj.keySet();
            for (String str : keys) {
                System.out.println();
                System.out.println(str + " : " + jObj.get(str));
            }
            int adults = Integer.parseInt((String) jObj.get("Adults"));
            int youth = Integer.parseInt((String) jObj.get("youth"));
            int children = Integer.parseInt((String) jObj.get("children"));
            int infants = Integer.parseInt((String) jObj.get("infants"));
            int lapinfants = Integer.parseInt((String) jObj.get("lapinfants"));

        } catch (org.json.simple.parser.ParseException | JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}