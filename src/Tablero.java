/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexis
 */
 import java.util.Random;
public class Tablero {
    int filas;
    int columnas;
    char [][]matriz;
    int cerezas;
    Coordenadas c;

    public Tablero(int rows, int cols) {

        this.filas = rows;
        this.columnas = cols;
        matriz = new char[this.filas][this.columnas];
        this.cerezas = 0;
        cargaCerezas();

    }

    public Tablero() {
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public Coordenadas getC() {
        return c;
    }

    public void setC(Coordenadas c) {
        this.c = c;
    }

    public int getCerezas(){
        return this.cerezas;
    }

    public void setCerezas(int cerezas){
        this.cerezas = cerezas;
    }

    public void cargaCerezas () {
        Random flag = new Random();
        boolean estado;
        for (int i = 0; i < this.filas; i ++){
            for (int j = 0; j < this.columnas; j ++){
                estado = flag.nextBoolean();
                if(estado){
                  matriz [i][j] = '1';
                  cerezas += 1;
                }
                else
                  matriz [i][j] = '0';
            }
        }
    }
}
