public class Pasient extends Person
{
  private Resept[] resepter;
  private int antall = 0;
  /*< En konstant MAX lik 100 for det maskimale antall
    resepter arrayen kan inneholde >*/
  public static final int MAX = 100;
  /*< Konstruktør som mottar pasientens navn og fødselsdato
    som parametre og foretar nødvendig initialisering. >*/
    public Pasient( String n, String f)
    {
    	super(n,f);

    	Resept[] resepter = new Resept[MAX];
    }




//Metoden setter en ny resept inn i pasientens resept-array.

  public boolean nyResept( Resept ny )
  {
       if( antall < MAX)
       {
		   resepter[antall++]=ny;
		   return true;
	   }
	   return false;

  }
// Metoden returnerer resepten med reseptnummer lik parameteren n.
 // Hvis en slik ikke finnes, skal metoden returnere null.
  public Resept finnResept( int n )
  {

	for(int i = 0; i < resepter.length; i ++)
	{
		if(resepter[i]==n)
		{
		return true;
	    }

	}
	return null;


  }
     /* Metoden skal returnere all informasjon om pasienten og
      vedkommendes resepter. Det skal fremgå av teksten om
      medisinene reseptene foreskriver  er utlevert eller ikke,
      samt hvor mange resepter som ikke er avhentet. */
  public String toString()
  {

  }

} // end of class Pasient
