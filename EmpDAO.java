package pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empDAO")
public class EmpDAO {

	@Autowired
	private DBconfig dbConfig;

	public DBconfig getDbConfig() {
		return dbConfig;
	}

	public void setDbConfig(DBconfig dbConfig) {
		this.dbConfig = dbConfig;
	}

	@Override
	public String toString() {
		return "EmpDAO [dbConfig=" + dbConfig + "]";
	}
	
	
}
