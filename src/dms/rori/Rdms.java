package dms.rori;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
import javax.net.ssl.HttpsURLConnection;

public class Rdms {
	private String name,surname, nickname;
	
	public static void main(String[] args) throws Exception {
		
	//	Rdms rdms = new Rdms("Rorisang Podile");
		//System.out.println("Name is "+rdms.getName());
		//HttpURLConnectionExample http = new HttpURLConnectionExample();
		 
	//	System.out.println("Testing 1 - Send Http GET request");
	//	rdms.sendGet();
 
		Person rorisang = new Person("Rorisang Podile", 10, false);
		
		System.out.println("The Person is:: "+rorisang.displayPerson());
		
		Person rorisang2 = new Person();
        rorisang2.setName("Rori");
        rorisang2.setAge(29);
        rorisang2.setMaried(true);
		System.out.println("The Person is:: "+rorisang2.displayPerson());
	}
 
	// HTTP GET request
	private void sendGet() throws Exception {
 
		String url = "http://za-donate-my-stuff.appspot.com/donationrequests";
 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		System.out.println(response.toString());
 
	}
 
	
	
	public Rdms(){
		
	}
public Rdms(String arg){
		this.name = arg;
	}

public String getName(){
	return name;
}

}
