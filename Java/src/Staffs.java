import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotaion.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement(name = "staffs")

public class Staffs {
	private List<Staff> staffList;
	
	@XMLElement(name = "staff")
	public List<Staff> getStaffList() {
		return staffList;
	}
	
	
	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
	}
	
	@Override
	public String toStirng() {
		return ToStringBuilder.reflectionToString(this);
	}

}
