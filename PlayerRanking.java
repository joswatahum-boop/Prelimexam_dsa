/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author User
 */
public class PlayerRanking {
    
    // Merge Sort
    static void mergeSort(Player[] players, int left, int right){
        if (left < right){
            int mid = (left + right) / 2;
            
            mergeSort(players, left, mid);
            mergeSort(players, mid + 1, right);
            
            merge(players, left, mid, right);
        }
    }
    // Merge two sorted parts
    static void merge(Player[] players, int left, int mid, int right){
        Player[] temp = new Player[right - left + 1];
        
        int i = left;
        int j = mid + 1;
        int k = 0;
        
        //Highest score firts
        while (i <= mid && j <= right){
            if (players[i].score >= players[j].score){
                temp[k++] = players[i++];
            }else{
                temp[k++] = players[j++];
            }
        }
        while (i <= mid){
            temp[k++] = players[j++];
        }
        while (j <= right){
            temp[k++] = players[j++];
        }
        
        for (i = 0; i < temp.length; i++){
            players[left + 1] = temp[1];
        }
    }
    
    public static void main(String[] args){
        
        Player[] players = {
            new Player("Simblante",25),
            new Player("Capispisan",75),
            new Player("Dela cruz",35),
            new Player("Miguel",45),
             new Player("Rosales",45)
        };
        
        //Sort players
        mergeSort(players, 0, players.length - 1);
        
        //Display ranking
        System.out.println("PLAYER RANKING");
        System.out.println("--------------");
        
        for (int i= 0; i< players.length; i++)
            
            System.out.println();
                (i + 1) + ". "
    }
    
}
