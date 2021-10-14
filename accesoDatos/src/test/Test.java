
package test;

import accesodatos.*;


public class Test {
    public static void main(String[] args) {
        //Implementaciones de MySQL y ORACLE
        IAccesoDatos datos= new ImplementacionMysql(); 
        datos.listar();
        
    }
}
