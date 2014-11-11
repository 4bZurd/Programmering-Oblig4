import java.util.Calendar;

public class Resept
{
private boolean utlevert = false;
private String tekst;
private Calendar dato;
private Pasient pasient;
private Lege lege;
private int nr;
private static int nesteNr = 0;
/*< Konstruktøren mottar reseptens tekst, legen og pasienten som parametre.
Resepten blir tildelt et unikt nummer, datoen for opprettelsen
av resepten blir registert, i tillegg til at annen nødvendig initialisering
blir foretatt. >*/


	public Resept( String t, Pasient p, Lege l)
	{
		tekst = t;
		pasient = p;
		lege = l;

		nr = nesteNr++;

	}
	
//< get-metoder for datafeltene nr og utlevert >

	public int getNr()
	{
		return nr;
	}
	

	public boolean getUtlevert()
	{
		return utlevert;
	}





/*< Metoden registrerer at den medisinen resepten foreskriver er utlevert. >*/
	public void registrerUtlevert()
	{
	    utlevert = true;

	}
/*< Metoden returnerer en tekst som innholder all informasjon på resepten,
samt opplysninger om medisinen resepten foreskriver er utlevert eller
ikke. >*/
	public String toString()
	{
		return "Resept nr: " + nr + "\n" + " Lege: " + lege + " \n" + " Dato : " + dato + "\n" + " Utlevert: " + utlevert + "\n" +
				" Pasient: " + pasient + "\n" + tekst;
	}
} // end of class Resept
