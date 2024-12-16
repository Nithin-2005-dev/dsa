package Recursion.BackTracking;

public class SimpleMaze {
    public static void main(String[] args) {
        solveMazeRouteDia(3,3,"");
    }
    static int solveMaze(int pr,int pc){
        if(pr==1 && pc==1){
            return 1;
        }
        int count=0;
        if(pr>1){
            count+=solveMaze(pr-1,pc);
        }
        if(pc>1){
            count+=solveMaze(pr,pc-1);
        }
        return count;
    }

    static void solveMazeRoute(int pr,int pc,String p){
        if(pr==1 && pc==1){
            System.out.println(p);
            return;
        }
        if(pr>1){
            solveMazeRoute(pr-1,pc,p+"D");
        } if(pc>1){
            solveMazeRoute(pr,pc-1,p+"R");
        }
    }
    static void solveMazeRouteDia(int pr,int pc,String p){
        if(pr==1 && pc==1){
            System.out.println(p);
            return;
        }
        if(pr>1 && pc>1){
            solveMazeRouteDia(pr-1,pc-1,p+"C");
        }
        if(pr>1){
            solveMazeRouteDia(pr-1,pc,p+"D");
        } if(pc>1){
            solveMazeRouteDia(pr,pc-1,p+"R");
        }
    }
}
