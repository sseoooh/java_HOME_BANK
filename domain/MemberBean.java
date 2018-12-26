package domain;

/**
 * @author Lee Chang Jun
 * @date 2018. 12. 26.
 * @desc 은행회원 빈객체
 */
public class MemberBean {
	private String id,pass,name,ssn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "회원정보 [id=" + id + ", pass=" + pass + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
}
