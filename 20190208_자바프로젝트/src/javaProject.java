// Hello GitHub

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class javaProject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		interparkCatagory();
	}

	
	static interparkData [] interparkCatagory() throws Exception {
		interparkData [] ipd = new interparkData[10];
		Document doc=Jsoup.connect("http://ticket.interpark.com/TPGoodsList.asp?Ca=Liv").get();
		Elements title=doc.select("div.stit span.fw_bold a");
		Elements addr=doc.select("div.stit td.Rkdate a");
		Elements period=doc.select("div.stit td.Rkdate");
		Elements poster=doc.select("div.stit td.RKthumb a");
		
		for(int i=0; i<10; i++) {
			System.out.println("번호:"+(i+1));
			System.out.println("제목:"+title.get(i).text());
			System.out.println("장소:"+addr.get(i).text());
			System.out.println("기간:"+period.get(i).text());
			System.out.println("링크:"+poster.get(i).attr("href"));
			System.out.println("==================================");
			
//			interparkData ipda=new interparkData();
//			ipda.num=i+1;
//			ipda.title=title.get(i).text();
//			ipda.addr=addr.get(i).text();
//			ipda.period=period.get(i).text();
//			ipda.poster="http://ticket.interpark.com/"+poster.get(i).attr("href");
//			
//			ipd[i]=ipda;
			
		}
		
		
		return ipd;
	}
}
