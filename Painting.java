
public class Painting {
	static Painting painting[]= new Painting[10];
	private String title; //titlos pinaka
	private Painter painter; //o zwgrafos pou to dhmiourghse
	private int date; //xronologia kataskeuhs
	static int counterPainting=0;

	public Painting(String title,Painter painter,int date) {
			this.title=title;
			this.painter=painter;
			this.date=date;
			painting[counterPainting]=this;
			++counterPainting;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public Painter getPainter() {
		return painter;
	}
	public void setPainter(Painter painter) {
		this.painter=painter;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		if(date>0){						//Periorismos ws pros thn eiserxomenh apo to xrhsth hmeromhnia
			this.date=date;
		}
		else{
			System.out.println("Date hasn't changed");
		}
	}
	public String toString() {
		return "Painting [title="+" "+title +" "+ ",painter =" +" "+painter+" "+ ",year of creation=" +" "+date+ "]";
	}

}
