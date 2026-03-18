package pa.peleadesumos.Servidor.Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Conecta con el archivo de propiedades
 * @author Asus
 */
public class CnxProperties {
    
    private File archivo;

    public CnxProperties(File archivo) {
        this.archivo = archivo;
    }
    
    /**
     * Metodo que conecta con el archivo de propiedades
     * @return Properties
     */
    public Properties conexion(){
        
        try{
            if(archivo == null){
                throw new IllegalStateException("No se ha asociado un archivo properties");
            }
            
            if(!archivo.exists() || !archivo.isFile()){
                throw new IllegalStateException("El archivo .properties no existe o no es válido: " + archivo);
            }
            
            Properties props = new Properties();
            
            try(FileInputStream aux = new FileInputStream(archivo)){
                props.load(aux);
                return props;
            }
        } catch(IOException ioe){
             throw new RuntimeException("Error al cargar el archivo properties: " + archivo,ioe);
        }
       
    }
    
    /**
     * Metodo para obtener el puerto
     * @return puerto del servidor
     */
    public int getPuerto(){
            Properties props = conexion();
            return Integer.parseInt(props.getProperty("PUERTO_SERVIDOR"));
        }
    
    /**
     * Obtiene el archivo
     * @return archivo
     */
    public File getArchivo(){
        return archivo;
    }
    
    /**
     * Asignar un archivo
     * @param archivo
     */
    public void setArchivo(File archivo){
        this.archivo = archivo;
    }
    
}
