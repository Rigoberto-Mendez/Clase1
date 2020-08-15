/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author Rigoberto Mendez
 */
public class Clase1 {

   
    
    
    public static void main(String[] args) {
//        funcionesMatematicasSuma Funciones = new funcionesMatematicasSuma();
//        System.out.println(Funciones.divicion());  

      coche miCarro = new coche ("NISSAN",2020,"AZUL");
      coche tuCarro = new coche ("HONDA",2020,"BLANCO");
      coche CarroConMasParametros = new coche ("HONDA",2020,"BLANCO",4);
      
          System.out.println(tuCarro.toString());
          System.out.println(miCarro.toString());
          System.out.println(CarroConMasParametros.toString());
      
    }
    
}
