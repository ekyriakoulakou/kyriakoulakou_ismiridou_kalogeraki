import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);


		Painter leo = new Painter ("Leonardo Da Vinci",1452,"Italy","https://en.wikipedia.org/wiki/Leonardo_da_Vinci");
		new Painting ("Mona Lisa",leo,1510);
		new Painting ("The Last Supper",leo,1490);

		Painter van = new Painter ("Vincent Van Gogh",1853,"Netherlands","https://en.wikipedia.org/wiki/Vincent_van_Gogh");
		new Painting ("The Starry Night",van, 1889 );

		Painter picasso = new Painter ("Pablo Picasso",1881,"Spain","https://en.wikipedia.org/wiki/Pablo_Picasso");
		new Painting ("Guernica",picasso,1937 );

		Painter botti= new Painter ("Sandro Botticelli",1445,"Italy","https://en.wikipedia.org/wiki/Sandro_Botticelli");
		new Painting ("The Birth of Venus",botti,1485);

		Painter klimt = new Painter ("Gustav Klimt",1862,"Austria","https://en.wikipedia.org/wiki/Gustav_Klimt");
		new Painting ("The Kiss",klimt, 1907);



		while (true){//η συνθήκη θα είναι πάντα αληθής
			System.out.println("");
			System.out.println("");
			System.out.println("**************** Welcome to our Gallery****************");
			System.out.println("------ Menu ------");
			System.out.println("Type 1 to display Painters' paintings");
			System.out.println("Type 2 to search Painters' information according to birthcountry");
			System.out.println("Type 3 to add a new Painter");
			System.out.println("Type 4 to find the oldest painting");
			System.out.println("Type 5 to find a painting and change it's year of creation");
			System.out.println("Type here:");

			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("\nList of Painters: ");
				for (Painter  painter: Painter.paint){//Εκτύπωση όλων των αντικειμένων του πίνακα
					if (painter!= null)//αν υπάρχει αντικείμενο στη θέση
						System.out.println(painter.toString());//Καλεί την toString
				}
			}


			else if (choice == 2){
				System.out.println("");
				System.out.println(" Give Painter's Birth Country ");
				System.out.println(" Type here: ");
				String BirthCountry=scanner.next();
						int counter=0;
						for(int y=0; y<Painter.paint.length; y++){
							if(Painter.paint[y] != null){

								if (Painter.paint[y].getCountry().equals(BirthCountry))
									System.out.println(Painter.paint[y].toString());
									counter++;

							}
						}

						if (counter==0) {
							System.out.println("No results found regarding your search");
						}

			}

			else if (choice==3) {
				System.out.println("Insert painter's name:");
				String name=scanner.next();
				System.out.println("Insert painter's birthdate:");
				int birthdate=scanner.nextInt();
				System.out.println("Insert painter's birthcountry:");
				String birthcountry=scanner.next();
				System.out.println("Insert painter's wikipedia page url:");
				String url=scanner.next();
				Painter NewPainter = new Painter(name,birthdate,birthcountry,url);
				System.out.println(name +" "+"has been stored");
			}

			else if(choice==4){
				int max=0;
				int thesi=0;
				int y;
				for(y=0; y<Painting.painting.length; y++){
					if(Painting.painting[y]!= null){
						if(max<Painting.painting[y].getDate()){
							max=Painting.painting[y].getDate();
							thesi=y;
						}
					}
				}
				System.out.println("the oldest painting dates"+" "+max+" "+"and it's name is"+" "+Painting.painting[thesi].getTitle());
			}
			else if(choice==5){
				System.out.println("Insert a number between 0 and 9 to to reveal the painting in this index");
								int number=scanner.nextInt();
								if(number<0||number>=10){
									System.out.println("No valid number");
								}
								else{
									if(Painting.painting[number]!= null){
										System.out.println("A painting was found in index"+" "+number+":"+Painting.painting[number].getTitle());
										System.out.println("The creation date was:" +Painting.painting[number].getDate()+" "+"Try changing the year of creation");
										System.out.print("New year:"+" ");
										int NewYear=scanner.nextInt();
										Painting.painting[number].setDate(NewYear);
										System.out.println("New painting information:"+Painting.painting[number].toString());
									}
									else{
									System.out.println("Not painting found");
									}
								}

			}
			else{
				System.out.println("wrong input");
				System.out.println("----------------------------------------\n");
			}
		}
	}
}
