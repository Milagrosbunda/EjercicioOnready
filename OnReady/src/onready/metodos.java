/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;

import java.util.List;

/**
 *
 * @author Delfina
 */
public class metodos {
    
    public void main(String[] args) {}
    
       public auto Mayor(List<auto> total){
    
        double mayor=0;
        auto caro = total.get(0);
        for(auto cada:total){
        if(cada.getPrecio()>mayor){
         mayor=cada.getPrecio();
         caro = cada;
         }
        }
    return caro;
    }
    
     public auto Menor(List<auto> total){
    
        double menor=1000000000;
        auto barato = total.get(0);
        for(auto cada:total){
        if(cada.getPrecio()<menor){
         menor=cada.getPrecio();
         barato = cada;
         }
        }
    return barato;
    }
    
     public void conY(List<auto> total){
    
           for(auto cada:total){
         for(int i=0; i<cada.getModelo().length()-1;i++){
             String y = "yY";
             if(cada.getModelo().charAt(i)==y.charAt(0) || cada.getModelo().charAt(i)==y.charAt(1)){
                 System.out.print("\nVehículo que contiene en el modelo la letra ‘Y’: "+cada.getMarca()+" "+cada.getModelo()+" $"+cada.getPrecio());
             }
         }
        }
    }
     
     public List<auto> ordenar(List<auto> total){
      
         for(int i =0; i<total.size()-1;i++){
           for(int j=0;j< total.size()-1-i;j++){
              if (total.get(j).getPrecio()<total.get(j+1).getPrecio()){
                 auto aux = total.get(j);
                 total.set(j, total.get(j+1));
                 total.set(j+1, aux);
              }
           }}
         
         return total;
     }

        
    }

