package org.example.tasks;

public class ESEL {
    public static void main(String[] args) {
        String sequence = "34678324532735387732984763287456438756324877353676535324873275984356437645324632" +
            "09857430735398564357636765523498732743248753676563245735363287463253274324873298" +
            "56437632154326498324564376532874732492174032548632544521987462365324329503214632" +
            "97453294703246328745329750326532";
        int count = countESEL(sequence);
        System.out.println("Количество ESEL в последовательности: " + count);
    }

    public static int countESEL(String sequence) {
        int count = 0;
        String target = "7353";
        int i = 0;
        while (i <= sequence.length() - target.length()) {
            i = sequence.indexOf(target, i);
            if (i == -1) break;
            int j = i + target.length();
            int multiplier = 1;
            while (j < sequence.length() && sequence.charAt(j) == '0') {
                multiplier *= 10;
                j++;
            }
            if (multiplier > 100) {
                multiplier = 100;
            }
            count += multiplier;
            i = j;
        }
        return count;
    }
}
