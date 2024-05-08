import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "Opening sentence is the body of email and the body of email will include several paragraphs. It also \n" +
                "provides the necessary background or supporting detail. You should limit yourself to several bullet \n" +
                "points or a few, short paragraphs. Only provide the minimum information needed to explain the issue or \n" +
                "ask the question. Ensure you provide brief explanation of the five key questions; What? When? Where? \n" +
                "How? Why? If you need more than a page of detail, consider attaching the detail in a Word document or \n" +
                "set a meeting to discuss. When the Email has a file attachment, ensure you refer to it in the message, \n" +
                "what it contains, and any actions needed. Be polite, professional, and respectful when presenting issues \n" +
                "or asking questions. Avoid sarcasm, jokes, humor, or tone that can be misinterpreted.";




        ArrayList<String> sentences = new ArrayList<>();
        String text1[] = text.split(" ");

        System.out.println(text1[0]);
        for (String s:text1){
            System.out.println(s);
        }

        for (String s:text1){
            sentences.add(s);
        }
        System.out.println();

        System.out.println("Total words:");
        System.out.println(sentences.size());
        System.out.println();

        Set<Character>UniqueWords=new HashSet<>();
        for(String s:sentences){
            for (char ch:s.toCharArray()){
                if(Character.isLetter(ch)){
                    UniqueWords.add(Character.toLowerCase(ch));
                    }


            }
        }
        System.out.println("Total unique Words:");
        System.out.println(UniqueWords.size());
        System.out.println();

        String text2[]=text.split("\\.");
        for (String s:text2){
            sentences.add(s);
            System.out.println(s);
        }


    }
}






