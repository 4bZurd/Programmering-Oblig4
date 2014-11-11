public class Person
{
	private String navn;
	private String fødselsdato;
	//< Konstruktør som mottar navn og fødselsdato som
	//	parametre og foretar initialisering av datafeltene. >
	public Person( String n, String f)
	{
		navn = n;
		fødselsdato = f;
	}

    //< get-metode for navn >
	//< get-metode for fødselsdato >
	public String getNavn()
	{
		return navn;
	}

	public String getFødselsdato()
	{
		return fødselsdato;
	}


	//< Metoden skal returnere navn og fødselsdato i form av tekst. >
	public String toString()
	{
	  return "Navn: " + navn + "fødselsdato: " + fødselsdato;
	}
} // end of class Person
