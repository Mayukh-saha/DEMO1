import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test1 {
	
	public static void main(String[] args) throws IOException 
	{
		URL url = new URL("http://google.com1");
		URLConnection urlConnection = url.openConnection();
		System.out.println("content = " + urlConnection.getContent().toString());
	}

}
