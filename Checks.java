/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

/**
 *
 * @author Seth
 */
public class Checks {
    int PlayerCount;
    int AICount;
    int capture_count;
    int movecount;
    boolean Stalemate;
    boolean Win;
    boolean AvailableMove;
    boolean checkCapture;
    
    
    public void checkWin(){
        if(AICount == 0 || PlayerCount == 0){
            Win = true;
        }
        else if(Stalemate == true){
            Win = true;
        }
        else{
            Win = false;
        }
    }
    public void checkStalemate(){
        if(AvailableMove == false){
            Stalemate = true;
        }
        else{
            Stalemate = false;
        }
    }
    public boolean checkAvailableMove(){
        if(movecount > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkCapture(){
        if(capture_count > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void getCaptureCount(ChessPieces[][] inBoard, int player){
        ChessPieces[][] board = inBoard;
        movecount = 0;
        capture_count = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(board[i][j].getPlayer() == player){
                    movecount += board[i][j].MovesPossible(board, i, j);
                    capture_count += board[i][j].CapturesPossible(board, i, j);
                    
                }
            }
        }
        if(movecount > 0 || capture_count > 0){
            AvailableMove = true;
        }
        
    }
}
