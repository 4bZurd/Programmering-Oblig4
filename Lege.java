import java.util.Calendar;

public class Lege extends Person
{/*Skriv klassedefinisjonens første linje frem til {.
	Programmer en konstruktør som mottar nødvendig informasjon via parametre og foretar nødvendig
    initialisering.*/
	private String adresse;
	private int telefonnr;
	private boolean lisens;
	private Resept[] resept;
	public static final int MAX = 100;
	private int antrespt;

/*	Legens adresse
	Legens telefonnummer
	En variabel som viser om legen har lisens eller ikke.
	(En lege som ikke har lisens har ikke lov til å skrive ut resepter)
	En array av typen Resept.(Se skisse av klassen Resept foran i oppgaven.)
	En konstant for det maskimale antall resepter (Resept-objekter) arrayen skal kunne inneholde.
	Konstantens verdi kan du sette til 100.
	En variabel som holder rede på antall resepter (Resept-objekter) som arrayen til enhver tid
	inneholder */



	public Lege( String n, String f, String t, int nr, boolean l, String a)
	{
		super(n,f);
		adresse = a;
		telefonnr = nr;
		lisens = l;
		resept = new Resept[MAX];

    }
    
    
    
	/*Programmer en get-metode for datafeltet som angir om legen har lisens eller ikke.*/
	public boolean getLisens()
	{
		return lisens;
	}
	
	
    /*Programmer en toString-metode som returnerer alle opplysninger som er lagret om legen, samt
	alle reseptene vedkommende lege har skrevet ut.*/
	public String toString()
	{
		return "Lege: " + super.n + "Adresse: " + adresse + " Telefon: " + telefonnr + "\n" + " Resepter: " + antresept;
		
	}
	



  /* Metoden mottar en resept som parameter og setter den, om mulig,
	inn i arrayen av resepter. Hvis dette gikk bra, skal metoden returnere
	informasjon om selve resepten, og i motsatt fall skal den returnere
	informasjon om at det ikke var plass i arrayen. */


	public String nyResept( Resept r )
	{
		
	
    }




	public String utskrevneResepter()
	{
	< Metoden skal returnere en tekst som inneholder informasjon om
	alle reseptene legen har skrevet ut. Reseptene skal skrives ut i
	omvendt kronologisk rekkefølge slik at de nyeste reseptene kommer
	første og de eldste sist. Hvis legen ikke har skrevet ut noen
	resepter, skal metoden returnere informasjon om det. >
}

}

*/
