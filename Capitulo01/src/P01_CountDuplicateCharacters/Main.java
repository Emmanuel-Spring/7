package P01_CountDuplicateCharacters;
/** Titulo
 *
 * @version 08/10/2021
 * @author Emmanuel Nieto Muñoz
 * @see <a href = "https://www.packtpub.com/product/java-coding-problems/9781789801415" /> Java Coding Problems </a>
 */

public class Main {

    private static final String TEXT = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you.";

    // Ӝ -> Unicode: \u04DC, Code Point: 1244
    // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
    // 🎼 -> \uD83C\uDFBC, Code Point: 127932
    // 😍 ->\uD83D\uDE0D, Code Point: 128525

    private static final String TExt_CP = TEXT + "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";


    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT + "\n");


    }

}
