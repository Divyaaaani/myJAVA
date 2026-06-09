improt java.util.*;
public class ShortestPath {
    public static double shortestPath(String path) {{
       int x=0, y=0;
       for (int i=0;i<path.length();i++){
        char direct=path.charAt(i);

        if (direct=='N')
            y++;
        else if(direct=='S')
            y--;
        else if(direct=='E')
            x++;    
        else if(direct=='W')
            x--;
       }
    }
    return Math.sqrt(x*x + y*y);
    public static void main(String args[]){

    }
}}
