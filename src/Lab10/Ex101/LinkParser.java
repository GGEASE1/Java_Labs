package Lab10.Ex101;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LinkParser
{
    public static void main(String[] args)
    {
       String url = "https://itlearn.ru/first-steps";
    try
    {
        Document document = Jsoup.connect(url).get();
        Elements links = document.select("a[href]");
        for(Element link: links)
        {
            System.out.println(link.attr("abs:href"));
        }
    }
    catch (IOException e)
    {
        System.out.println(e.getMessage());
    }
    }

}
