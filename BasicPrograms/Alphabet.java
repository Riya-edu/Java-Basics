public class Alphabet {
    public static void main(String[] args) {
        for(int i = 0; i < 1; i++){
            System.out.println();
           for(char j = 'a'; j <= 'z'; j++){
            System.out.print(j + " ");
            }
           }

           //Split function removes the word defined
           String trial = "This is a String to try Split";
           String [] s1 = trial.split("String");
           for(String s: s1){
               System.out.print(s);

            /*String trial_slice = "This is a String to try Slice";
            String [] s2 = trial_slice.slice();
            for(String ss: s1){
                 System.out.print(s);
            */
                 }
    }
}

