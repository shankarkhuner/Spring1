package pack1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBconfig {

	@Value("oracal.jdbc")
	private String driverName;
	@Value("jdbc:oracal:@localhost")
	private String url;
	@Value("john@123")
	private String userName;
	@Value("pass@123")
	private String password;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DBconfig [driverName=" + driverName + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
}
