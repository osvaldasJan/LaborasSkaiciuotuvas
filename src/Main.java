import java.util.Locale;
import java.util.Scanner;

/*
Sukurti programą, kuri skaičiuotų šias operacijas (* / + -). Vartotojas įveda
2 skaičius ir operacijos ženklą. Pagal įvestą ženklą, atliekama operacija.
Jeigu įvedamas kitoks ženklas, parašote, kad operacija negalima.
Dalybai naudojate tipą double. Jeigu dalyba iš 0 - parašote, kad dalyba iš 0 negalima.
Po atliktų skaičiavimų, programa paklausia ar dar norite toliau skaičiuoti.
Jeigu taip, toliau tęsiamas skaičiavimas, jeigu ne- programa baigia darbą.
 */

public class Main {

    public static void main(String[] args) {
        double input1, input2;
        double result;
        String continueLoop, operation;
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

        try {
            do {
                System.out.println("Įveskite pirmąjį sveiką skaičių");
                input1 = keyboard.nextInt();

                System.out.println("Įveskite antrąjį sveiką skaičių");
                input2 = keyboard.nextInt();

                System.out.println("Įveskite norimą atlikti operaciją: suma '+'," +
                        " atimtis '-', sandauga '*', dalmuo '/'");
                operation = keyboard.next();

                    switch (operation) {
                        case "+":
                            result = input1 + input2;
                            System.out.print("Skaičių " + (int)input1 + " ir " +
                                    (int)input2 +" suma yra lygi " + (int) result + ". ");
                            break;
                        case "-":
                            result = input1 - input2;
                            System.out.print("Skaičių " + (int)input1 + " ir " +
                                    (int)input2 + " skirtumas yra lygus " + (int) result + ". ");
                            break;
                        case "*":
                            result = input1 * input2;
                            System.out.print("Skaičių " + (int)input1 + " ir " +
                                    (int)input2 + " sandauga yra lygi " + (int) result + ". ");
                            break;
                        case "#":
                                for (int i = 13; i < 26; i++) {
                                    if (input2 ==0) {
                                        System.out.println(input1 + " * " + input2 + " + (" + input2 + " - " + input1 + ") / " +
                                                input1 + " * " + i + " = " +"Dalyba iš nulio negalima. ");
                                    } else {
                                        result = input1 * input2 + (input2 - input1) / input1 * i;
                                        if (result < 6) {
                                            System.out.println(input1 + " * " + input2 + " + (" + input2 + " - " + input1 + ") / " +
                                                    input1 + " * " + i + " = " + result + " < 6");
                                        } else if (result == 6) {
                                            System.out.println(input1 + " * " + input2 + " + (" + input2 + " - " + input1 + ") / " +
                                                    input1 + " * " + i + " = " + result + " == 6");
                                        } else
                                            System.out.println(input1 + " * " + input2 + " + (" + input2 + " - " + input1 + ") / " +
                                                    input1 + " * " + i + " = " + result + " > 6");
                                    }
                                }
                            break;
                        case "/":
                            result = input1 / input2;
                            if (input2 ==0) {
                                System.out.print("Dalyba iš nulio negalima. ");
                            }   else {
                                System.out.print("Skaičių " + (int)input1 + " ir " +
                                        (int)input2 + " dalmuo yra lygus " + result + ". ");
                            }
                            break;
                        default:
                            System.out.print("Operacija negalima. ");
                    }

                System.out.println("Ar norite tęsti? ");
                continueLoop = keyboard.next();

            } while (continueLoop.equalsIgnoreCase("taip"));

        }
        catch(Exception e){
            System.out.println("Klaida: Įvestas blogas skaičius");
        }
        System.out.println("Programa baigia darbą"); ///
    }
}

