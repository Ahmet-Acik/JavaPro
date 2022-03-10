package day17_BranchingStatements_While_DoWhile_Loops;

public class EU8FrequencyOfCharacter {

    public static void main(String[] args) {

        /*
        String str = "AAABBBBBBBBBC";
        char ch = 'B';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (ch == eachChar) {
                frequency++;

            }
         }
        System.out.print( frequency);

         */

        String strJava = "JavaJavaJavaJava";
        int frequencyOfJava = 0;

        for (int i =0; i <=strJava.length()-4; i++){  //-4 is the length of the word we are searching for (java) . 
            String sbStrJava = strJava.substring(i, i+4);

            if (sbStrJava.equalsIgnoreCase("java")) {
                frequencyOfJava++;
            }
        }
        System.out.println("frequencyOfJava = " + frequencyOfJava);
        



        String str3 = "hi have are you high higher high ";
        
                int numberOfHi = 0;
        
        for (int i =0; i <= str3.length()-2; i++){
            
            String subStrHi = str3.substring(i, i+2);
            if (subStrHi.equalsIgnoreCase("hi")) {
                numberOfHi++;
                
            }
        }
        System.out.println("numberOfHi = " + numberOfHi);




        String str5 = "Ahmet Mehmet metin melik";
        int numberOfMe= 0;

        for (int i =0; i <=str5.length()-2; i++) {

            String subStrMe =str5.substring(i, i+2);

            if (subStrMe.equalsIgnoreCase("me")) {
                numberOfMe++;

            }
        }
        System.out.println("numberOfMe = " + numberOfMe);

        }
        
        
    }


