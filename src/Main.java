import java.util.Scanner; 

public class Main {

    final static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        testWifi();
        testPrinter();
    }

    static void greet(){

    System.out.println("Hello! My name is " + "ChatBot" + ".");

    System.out.println("I was created in " + "2023" + ".");

    System.out.println("Please, remind me your name.");

    }

    static void remindName(){
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Tell me the remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; That's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number that you want");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++){
            System.out.printf(" %d!\n", i);
        }
    }

    static void testWifi() {
    System.out.println("Welcome to Networking Chatbot");
    System.out.println("Is Wifi working? - 2 to Exit");
    System.out.println("1. Try Turning off router and restarting it.\n" +
                        "2. Wifi Working.|n" +
                        "3. Check Max Users on router. \n" +
                        "4. Check all Cables and accessabilities options");

    while (true) {

        Scanner in = new Scanner(System.in);
        System.out.print("");
        int num = Integer.parseInt(in.next());
            if(num == 2) {
                System.out.println("||==========================================||");
                System.out.println("|       Congrats on getting WIFI Working     |");
                System.out.println("||==========================================||");
                break;
            }
            else {
                System.out.println("||==========================================||");
                System.out.println("||==========================================||");
                System.out.println("Please, try again.");
                System.out.println("Is Wifi working? - 2 to Exit");
                System.out.println("1. Try Turning off router and restarting it.\n" +
                                "2. Wifi Working.\n" +
                                "3. Check Max Users on router. \n" +
                                "4. Check all Cables and accessabilities options");
                System.out.println("||==========================================||");
            }
        }

    }

    static void testPrinter() {
    System.out.println("Welcome to Networking Chatbot");
    System.out.println("Is printer working? - 2 to Exit");
    System.out.println("1. Try Turning off printer and restarting it.\n" +
                        "2. Printer Working.|n" +
                        "3. Check paper tray. \n" +
                        "4. Check all Cables and network settings. \n" +
                        "5. Check ink and toner levels.");

    while (true) {

        Scanner in = new Scanner(System.in);
        System.out.print("");
        int num = Integer.parseInt(in.next());
            if(num == 2) {
                System.out.println("||==========================================||");
                System.out.println("|   * Congrats on getting Printer Working * |");
                System.out.println("||==========================================||");
                break;
            }
            else {
                System.out.println("||==========================================||");
                System.out.println("||==========================================||");
                System.out.println("Please, try again.");
                System.out.println("1. Try Turning off printer and restarting it.\n" +
                        "2. Printer Working.|n" +
                        "3. Check paper tray. \n" +
                        "4. Check all Cables and network settings. \n" +
                        "5. Check ink and toner levels.");
                System.out.println("||==========================================||");
            }
        }

    }


}


