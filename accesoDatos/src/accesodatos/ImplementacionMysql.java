
package accesodatos;

/*me encuentro justo antes de la BBDD, 
vamos a definir los comportamientos de los métodos CRUD*/
public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde SQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde SQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde SQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde SQL");
    }
    
}