package pa.peleadesumos.Cliente.Modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Asus
 */
public class CnxProperties {
    
    private String[] kimarites;
    
    public void cargarKimarites(String ruta) throws IOException{
        
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(ruta);
        
        props.load(fis);
        fis.close();
        
        kimarites = new String[props.size()];
        for(int i = 0; i<=props.size(); i++){
            kimarites[i] = props.getProperty("tecnica"+(i+1));
        }
    }
    
    public String[] getKimarites(){
        return kimarites;
    }
    
}
