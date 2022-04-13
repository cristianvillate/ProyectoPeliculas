package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.excepciones.LecturaDatosEx;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public interface IAccesoDatos {

    public boolean existe(String nombreArchivo) throws AccesoDatosEx;

    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    public void crear(String nombreArchivo) throws AccesoDatosEx;

    public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
