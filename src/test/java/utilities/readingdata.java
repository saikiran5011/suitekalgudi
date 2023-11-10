package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readingdata {
	Properties pro;
	public  readingdata (){
		
		
		File file=new File("./configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
		pro=new Properties();
		pro.load(fis);
	}
		
		catch(Exception e) {
			System.out.println("exception is : "+ e.getMessage());
		}
	}
	public String getapplicationurl() {
		String url=pro.getProperty("baseURL");
		return url;
	}
		public String getEmail() {
			String Email=pro.getProperty("Email");
			return Email;
		}

public  String getName() {
	String Name=pro.getProperty("Name");
	return Name;
	
}
public String getloginmail() {
	String loginmail=pro.getProperty("loginemail");
	return loginmail;
}
public String setpassword() {
	String password=pro.getProperty("password");
	return password;
	

}
public String getChromepath() {
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
}
}
