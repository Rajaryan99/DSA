public class findSortestDir {

    public static float findSorttestPath(String str){
        int x=0; 
        int y=0;

        for(int i=0; i< str.length(); i++){
            char dir = str.charAt(i);

            //SOUTH
            if(dir == 'S'){
                y--;
            } 

            //NORTH
            else if(dir == 'N'){
                y++;
            }

            //west
            else if(dir == 'W'){
                x--;
            }

            //East
            else{
                x++;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(findSorttestPath(path));
    }
}
