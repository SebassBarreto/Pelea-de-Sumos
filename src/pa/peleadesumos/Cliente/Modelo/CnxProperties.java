package pa.peleadesumos.Cliente.Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author 
 */
public class CnxProperties {
    
    private String[] kimarites;
    private String nombreCategoria;
    
    public void cargarKimarites(String ruta, String categoriaId) throws IOException{
        
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(ruta);
        
        props.load(fis);
        fis.close();
        
        String km = props.getProperty("categoria."+categoriaId+".kimarites");
        kimarites = km.split(",");
        nombreCategoria = props.getProperty("categoria."+categoriaId+".nombre");
    }
    
    
    public String[] getKimarites(){
        return kimarites;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }
    
    
}
