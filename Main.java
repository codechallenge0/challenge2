import java.util.*; 
import java.io.*;
import java.net.*;

class Main {  
  public static void main (String[] args) { 
    System.setProperty("http.agent", "Chrome");
    try { 
      URL url = new URL("https://bw21vyrff2.execute-api.us-west-2.amazonaws.com/default/codeChallenge");
      try {
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String response = br.readLine();
        response = response.substring(response.indexOf(":"));
        
        
// Print the String 
System.out.println("String: " + response); 
      } catch (IOException ioEx) {
        System.out.println(ioEx);
      }
    } catch (MalformedURLException malEx) {
      System.out.println(malEx);
    }
  }   
}