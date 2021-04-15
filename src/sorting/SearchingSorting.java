/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SearchingSorting {
    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++){
            int key = data[i];
            int j = i - 1;
            while ((j >= 0) && (data[j] > key)) {
                
                
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
        
    }
    public static void tampil(int a[]) {
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        } 
        System.out.println();
    }
    
    public static void main(String[] args) {
        int data[] = {25, 7, 9, 13, 3};
               int dicari;
        boolean ketemu =false;
        Scanner scan = new Scanner(System.in); 
        System.out.println("isi data adalah: ");
        tampil(data);
        
        System.out.println("Isi data setelah di sorting :");
        insertionSort(data);
        tampil(data);
        
        System.out.println("");
        
        System.out.print("Masukan data yang dicari : ");
        dicari = scan.nextInt();
    
        for (int i = 0; i < data.length; i++){
        if (dicari == data[i]){
            ketemu = true;
            System.out.print("Data " + dicari +" berada pada index ke - " + i);
        }
        
            
    }
    System.out.println();
    
    if(ketemu == true){
        System.out.println("data ditemukan");
    }else{
        System.out.println("data tidak ditemukan");
              
                }
    System.out.println(" Sugeng Sulistianto ");
    }
    
}
