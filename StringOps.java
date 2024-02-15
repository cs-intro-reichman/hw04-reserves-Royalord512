public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
        //capVowelsLowRest tester
        //System.out.println(capVowelsLowRest("vowels are fun"));


        //camelCase tester
        System.out.println(camelCase("Hello World"));

        //allOfIndex tester
        //int[] print = allIndexOf("Hello world",'d');
        //for (int i = 0; i < print.length; i++) {
          //  System.out.print(print[i] + " ");
        //}
    }

    public static String capVowelsLowRest (String string) {
        String improved = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'u' ||
                string.charAt(i) == 'e' || string.charAt(i) == 'o' ||
                string.charAt(i) == 'i')
                    improved += (char) (string.charAt(i) - 32);  
            else if (string.charAt(i) == 'A' || string.charAt(i) == 'U' ||
                    string.charAt(i) == 'E' || string.charAt(i) == 'O' ||
                    string.charAt(i) == 'I')
                        improved += (string.charAt(i));
            else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
                improved += (char) (string.charAt(i) + 32);
            else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
                improved += (char) (string.charAt(i));
            else if (string.charAt(i) == ' ')
                improved += (string.charAt(i));
                
        }
        return improved;
    }

    public static String camelCase (String string) {
        String camelCase = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
                camelCase += string.charAt(i);
            else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
                camelCase += (char) (string.charAt(i) + 32);

            while (string.charAt(i) == ' ' && camelCase != "") {
                i++;
                if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
                    camelCase += (char) (string.charAt(i) - 32);
                else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
                    camelCase += string.charAt(i);
            }
            
        }

        return camelCase;
    }

    public static int[] allIndexOf (String string, char chr) {
        int chrCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) chrCounter++;
        }

        int[] array = new int[chrCounter];

        int arrayCounter = 0;
        for (int i = 0; arrayCounter < chrCounter; i++) {
            array[arrayCounter] = (string.substring(i).indexOf(chr) + i);
            i += string.substring(i).indexOf(chr);
            arrayCounter++;
        }
        
        return array;
    }
}
