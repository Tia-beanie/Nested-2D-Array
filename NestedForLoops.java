public class NestedForLoops {
    
    public static void main(String[] args){

        String[][] fancyColors = {{"Red", "Blue", "Green"},
                                  {"Cyna", "Magenta", "Turqiouse"}};

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.println(fancyColors[row][col]);
            }
        }

        System.out.println("-------------------");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 6; j++){
                System.out.println("i: " + i + ", j: " + j);
            
            }
        }

    }
}
