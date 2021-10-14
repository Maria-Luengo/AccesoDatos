/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author Alumno Mañana
 */
public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Instrtando desde Oracle");    }

    @Override
    public void listar() {
        System.out.println("Listando desde Oracle");    
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Oracle");    
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Oracle");    
    }
    
}
