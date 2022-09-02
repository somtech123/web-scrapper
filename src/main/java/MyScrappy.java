import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class MyScrappy {
    public static void main(String[] args)  throws IOException {
        URL url = new URL("https://www.waterless-toilet.com/top-6-best-composting-toilets-to-choose/");
        Document page = Jsoup.connect(String.valueOf(url)).get();

        Elements pageElements = page.select("a[href]");
        ArrayList<String> hyperLinks = new ArrayList<>();

        //iterating and extracting
        for (Element e : pageElements){
            // add elements to arraylist
            hyperLinks.add("Text: " + e.text());
            hyperLinks.add("Links: " + e.attr("href"));
        }
        for (String s : hyperLinks){
            System.out.println(s);
        }


    }
}
