



import com.jscape.inet.ftp.Ftp;

import java.io.IOException;
 
public class FtpConnectDemo {
    public static void main(String[] args) {
    	 Ftp ftp = new Ftp("chqsftp01", "st4ftp", "FT4da");
		 try {
		 // connect to FTP server
		 ftp.connect();
		 // print out directory listing System.out.println(ftp.getDirListingAsString());
		// disconnect from FTP server ftp.disconnect(); } catch(Exception e) { System.out.println(e); } 
		 System.out.println("coneccion correcta");
		 }catch(Exception e){
			 e.printStackTrace();
		 }
    }
}