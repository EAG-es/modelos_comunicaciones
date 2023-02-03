/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innui.modelos.comunicaciones.sockets;

import innui.bases;
import innui.modelos.errores.oks;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/**
 *
 * @author emilio
 */
public class sslsocket_factory_sin_validaciones extends bases {
    public SSLSocketFactory inicial_SSLSocketFactory;
    public SSLSocketFactory temporal_SSLSocketFactory;
    public HostnameVerifier hostnameVerifier = null;

    public boolean restaurar_SSLSocketFactory(oks ok, Object ... extras_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        if (inicial_SSLSocketFactory != null) {
            HttpsURLConnection.setDefaultSSLSocketFactory(inicial_SSLSocketFactory);
        }
        temporal_SSLSocketFactory = null;
        return ok.es;
    }
    public boolean restaurar_HostnameVerifier(oks ok, Object ... extras_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        if (hostnameVerifier != null) {
            HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
        }
        return ok.es;
    }
    
    
}
