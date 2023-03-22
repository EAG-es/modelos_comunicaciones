package innui.modelos.modelos_comunicaciones;

import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.modelos;
import static java.lang.System.exit;
import java.util.ResourceBundle;

/**
 *
 * @author emilio
 */
public class modelos_comunicaciones extends iniciales {
    /**
     * Inicio de la aplicación
     * @param args 
     */
    public static void main(String[] args) {
        oks ok = new oks();
        try {
            ResourceBundle in = null;
            modelos_comunicaciones modelo_comunicacion = null;
            try {
                modelo_comunicacion = new modelos_comunicaciones();
                modelo_comunicacion.run(ok);
            } catch (Exception e) {
                ok.setTxt(e);
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }    
    /**
     * Inicio de la aplicación desde un objeto instanciado
     * @param ok Comunicar resultados
     * @param extras_array Opción de añadir parámetros en el futuro.
     * @return true si todo va bien
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean run(oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return ok.es; }
            iniciar(ok);
            if (ok.es) {
                oks ok_fin = new oks();
                terminar(ok_fin);
                if (ok_fin.es == false) {
                    ok.setTxt(ok.getTxt(), ok_fin.getTxt());
                }
            }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean iniciar(oks ok, Object... extra_array) throws Exception {
        // Iniciar clase principal de la librería
        if (ok.es == false) { return false; }
        _iniciar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return false; }
        _iniciar_desde_clase(this.getClass(), ok);
        return ok.es;
    }

    @Override
    public boolean terminar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        if (ok.es == false) { return false; }
        _terminar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return false; }
        _terminar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    
}
