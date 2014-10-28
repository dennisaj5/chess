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
    boolean Stalemate;
    boolean Win;
    boolean AvailableMove;
    
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
}
