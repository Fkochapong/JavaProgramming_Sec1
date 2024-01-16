
public class Author {
	private String name,email;
	private char gender;
	
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	Author(String name,String email){
		this.name=name;
		this.email=email;
	}
	Author(){
		this.name="";
		this.email="";
		this.gender=' ';
		
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(this.gender=='M')
			return "Male";
		if(this.gender=='F')
			return "Female";
	}
	public String toString() {
		return "Author name : "+name+"+email";
	}

}
