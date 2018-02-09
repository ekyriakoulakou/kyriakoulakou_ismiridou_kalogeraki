
public class Painter {
	static Painter paint[]=new Painter [10];
	private String name;
	private int birthyear;
	private String country;
	private String url;
	static int counterPainters=0;

	public Painter(String name, int birthyear, String country, String url) {
		this.name=name;
		this.birthyear=birthyear;
		this.country=country;
		this.url=url;
		paint[counterPainters]=this;
		++counterPainters;


	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear=birthyear;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url=url;
	}


	public String toString() {
		return "Painter [name="+ name +  ",birthyear =" + birthyear + ",country =" + country+",wikipedia information =" + url +"]";
	}
}
