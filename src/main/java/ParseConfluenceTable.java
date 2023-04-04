import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ParseConfluenceTable {

    public static void main(String[] args) {

        Document doc2 = Jsoup.parse("https://fcbayern.atlassian.net/wiki/spaces/DEV/pages/115540048/12-2022+Dezember");
        Elements elements = doc2.select("body").first().children();

        ZoneId z = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt = ZonedDateTime.now( z );
        Year valueY = Year.of(zdt.getYear());
        Month valueM = zdt.getMonth();
        System.out.println("year: " + valueY + ", month: " + valueM);

        int monthSheetID = 38746523;
        int year = 2023;
        String CE1stPOString = "https://fcbayern.atlassian.net/wiki/spaces/DEV/pages/";
        System.out.format("%s%s/%s", CE1stPOString, monthSheetID, year);


        switch(valueM){
//            case JANUARY:
//                int monthNum = 1;
//                break;
//            case FEBRUARY:
//                monthNum = 2;
//                break;
//            case MARCH:
//                monthNum = 3;
//                break;
//            case APRIL:
//                monthNum = 4;
//                break;
//            case MAY:
//                monthNum = 5;
//                break;
//            case JUNE:
//                monthNum = 6;
//                break;
//            case JULY:
//                monthNum = 7;
//                break;
//            case AUGUST:
//                monthNum = 8;
//                break;
//            case SEPTEMBER:
//                monthNum = 9;
//                break;
//            case OCTOBER:
//                monthNum = 10;
//                break;
//            case NOVEMBER:
//                monthNum = 11;
//                break;
//            case DECEMBER:
//                monthNum = 12;
//                break;
        }




        //int i = 1;
        //use an encapsulated for loop that iterates through the different Strings

   }

    public static void ConnectToTable() {
//Konstruieren eines einzelnen Strings, welcher die Grund-URL mit der ID des Kalenderblatts
//und dem String hinter dem letzten Schrägstrich, verknüpft

        ZoneId z = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt = ZonedDateTime.now( z );
        Year valueY = Year.of(zdt.getYear());
//        switch(valueY){
//            case 2023:
//                //code block
//                Document doc2 = Jsoup.parse("https://fcbayern.atlassian.net/wiki/spaces/DEV/pages/120291436/2023");
//
//            case 2024:
//                //code block
//
//            case 2025:
//                //code block
//
//            case 2026:
//                //code block
//
//            case 2027:
//                //code block
//            case 2028:
//                //code block
//            case 2029:
//                //code block
//            case 2030:
//                //code block
//            case 2031:
//                //code block
//            case 2032:
//                //code block
//            case 2033:
//                //code block
//            case 2034:
//                //code block
//            case 2035:
//                //code block
//            case 2036:
//                //code block
//

        }

    Document doc2 = Jsoup.parse("https://fcbayern.atlassian.net/wiki/spaces/DEV/pages/115540048/12-2022+Dezember");
        Elements elements = doc2.select("body").first().children();
        //oder nur `<td>` elemente
        //Elements elements = doc.select("td");
//        for (Element el : elements)
//            System.out.println("element: "+el);

        //Next steps:
        //in switch case -> compare zdt to the singular date ranges per month of the years
        //construct a single String that is created by adding the base URL String to the result of the switch case String formatted to the right format to be able to perfectly imitate the last part of the
        //Confluence Table Link after the last two or one slashes
        //therefore parse the page and analyse it according to the html Elements

        public static void test(){
            System.out.println("Test");
        }

    }


