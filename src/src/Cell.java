/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author dangt
 */
public class Cell  {
    char type; //loai co [X;O]
    int row; //hang
    int col; //cot 

    public Cell(char type, int row, int col) {
        this.type = type;
        this.row = row;
        this.col = col;
    }
    
    

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

//    public Cell() {
//    }
    
    
}
