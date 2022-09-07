/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

/**
 *
 * @author ANGELITA
 */
public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
      }

    @Override
    public void listar() {
        System.out.println("listar desde MySql");
          }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde MySql");
         }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySql");
     }
    
}
