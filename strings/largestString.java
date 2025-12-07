public class largestString {
    public static void main(String[] args) {
        String frutes[] = {"apple", "banana", "mango", "kivi", "orange"};

        String largest = frutes[0];

        for(int i=1; i<frutes.length; i++){
            if(largest.compareTo(frutes[i]) < 0){
                largest=  frutes[i];
            }
        }

        System.out.println(largest);
    }
}
