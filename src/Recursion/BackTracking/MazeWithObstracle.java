package Recursion.BackTracking;

public class MazeWithObstracle {
    public static void main(String[] args) {
        boolean[][] maze=new boolean[3][3];
//        maze[0][0]=true;
        solveMazeAllPaths(maze,0,0,"");
    }
    static void solveMaze(boolean[][] maze,int r,int c,String p){
        if(r== maze.length-1 && c== maze.length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]){
            return;
        }
        if(r< maze.length-1 && c< maze.length-1){
            solveMaze(maze,r+1,c+1,p+"C");
        }
        if(r< maze.length-1){
            solveMaze(maze,r+1,c,p+"D");
        } if(c< maze.length-1){
            solveMaze(maze,r,c+1,p+"R");
        }
    }
    //this problem can be solved with backtracking
    //to solve this problem we have to mark the visited cells
    //once the recursion went to visited cell it should return
    //this process is called backtracking
    static void solveMazeAllPaths(boolean[][] maze,int r,int c,String p){
        if(r== maze.length-1 && c== maze.length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]){
            return;
        }
        maze[r][c]=true;
        if(r< maze.length-1){
            solveMazeAllPaths(maze,r+1,c,p+"D");
        } if(c< maze.length-1){
            solveMazeAllPaths(maze,r,c+1,p+"R");
        }
        if(r>0){
            solveMazeAllPaths(maze,r-1,c,p+"U");
        } if(c>0){
            solveMazeAllPaths(maze,r,c-1,p+"L");
        }
        maze[r][c]=false;
    }
}
