import org.apache.commons.lang3.builder.ToStringBuilder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

public class Staff {
	private int id;
	
	private StaffName name;
	
	private String gender;
	
	private String job;
	
	@XmlAttribute(name="id")
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public StaffName getName() {
		return name;
	}
	
	public void setName(StaffName name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
