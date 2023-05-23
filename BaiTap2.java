package test.at.pkgclass;

import java.util.Scanner;

public class BT2_Slot5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
    int[] arr = new int[n];
        // nhap so 
        System.out.println("Nhap so : ");
        for(int i = 0; i < n; i++){
         arr[i] = sc.nextInt();
        }
        // in so trong mang
        System.out.println("Mang bao gom : ");
        for(int i = 0; i < n; i++){
         System.out.print(arr[i] + " ");
        }
        // sap xep
        int test;
    for(int i = 0; i<n; i++){
      for(int j = i + 1 ; j<n;j++){
      if(arr[i] > arr[j]) {
         test = arr[i];
         arr[i] = arr[j];
         arr[j] = test;
      }
    }    
  }
    // in ra sau sap xep
    System.out.print("ket qua: ");
     for(int i=0; i<n; i++){
         System.out.print(arr[i]);
     }   
    } 
} 

