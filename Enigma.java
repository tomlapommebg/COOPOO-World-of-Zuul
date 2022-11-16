import java.util.HashMap;

/**
 * Décrivez votre classe Enigma ici.
 *
 * @author (Bineta)
 * @version (un numéro de version ou une date)
 */
public class Enigma
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String enigm ;
    private String question;
    private String answer;
    /**
     * Constructeur d'objets de classe Enigma
     */
    public Enigma(String enigm, String question, String answer)
    {
        // initialisation des variables d'instance
        this.enigm=enigm;
        this.question=question;
        this.answer=answer;
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String getQuestion()
    {
        // Insérez votre code ici
        return this.question;
    }
    
    
    public String getAnswer()
    {
        return this.answer;
    }
    
    public void setAnswer(String answer)
    {
        this.answer=answer;
    }
    

}
