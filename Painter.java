
public class Painter {
	static Painter paint[]=new Painter [10];
	private String name; //onoma zwgrafou
	private int birthyear; //hmeromhnia gennhshs
	private String country; //xwra katagwghs
	private String url; //url istoselidas wikipedia me plhrofories gia to zwgrafo
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
		return "Painter [info: name="+" "+ name +" "+ ",birthyear =" +" "+ birthyear +" "+ ",birthcountry =" +" "+ country+" "+",wikipedia information ="+" "+  url +"]";
	}
}
