package accesodatos;

public interface IAccesoDatos {

    int MAX_REGISTRO = 10; //aunque no lo defina es static y final

//métodos, son abstractos y públicos por defecto
    void insertar();

    void listar();

    void actualizar();
    
    void eliminar();

}
