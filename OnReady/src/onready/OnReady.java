/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Delfina
 */
public class OnReady {

    public static void main(String[] args) {
      
        
        auto uno = new auto("Peugeot","206",200000);
        uno.setPuertas(4);
        auto dos = new auto("Honda","Titan",60000);
        dos.setCilindrada(125);
        auto tres = new auto("Peugeot","208",250000);
        tres.setPuertas(5);
        auto cuatro = new auto("Yamaha","YBR",80500.50);
        cuatro.setCilindrada(160);
        
        List <auto> total = new ArrayList <>() ;
        metodos nuevo = new metodos();
        
        total.add(uno);
        total.add(dos);
        total.add(tres);
        total.add(cuatro);
        
        for(auto cada:total){
        
            System.out.print("Marca: "+cada.getMarca()+" // Modelo: "+ cada.getModelo());
            
            if (cada.getPuertas() != 0){
            System.out.print(" // Puertas: "+ cada.getPuertas()+"// Precio: $"+ cada.getPrecio()+"\n");
            }
            if (cada.getCilindrada()!= 0){
            System.out.print(" // Cilindrada: "+ cada.getCilindrada()+"cc // Precio: $"+ cada.getPrecio()+"\n");
            }
        
        }
        
      
        auto max = nuevo.Mayor(total);
        auto min = nuevo.Menor(total);
        
        
        System.out.print("\n=============================\n" +
"Vehículo más caro: "+ max.getMarca() +" "+max.getModelo() +"\n" +
"Vehículo más barato: "+ min.getMarca() +" "+min.getModelo() +"\n");
        
        nuevo.conY(total);
        List <auto> ordenado =nuevo.ordenar(total) ;
        
        System.out.print("\n=============================\n" +
"Vehículos ordenados por precio de mayor a menor:\n" +
ordenado.get(0).getMarca() +" "+ ordenado.get(0).getModelo() +"\n" +
ordenado.get(1).getMarca() +" "+ ordenado.get(1).getModelo() +"\n" +
ordenado.get(2).getMarca() +" "+ ordenado.get(2).getModelo() +"\n" +
ordenado.get(3).getMarca() +" "+ ordenado.get(3).getModelo() +"\n");
        
    }
    
    
 
     
}
      