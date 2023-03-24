package incli.restful.jdbc_servidor_https_spring;

import innui.modelos.comunicaciones.sockets.sslcontext_cliente_sin_verificar_hostnames;
import innui.modelos.errores.oks;
import innui.modelos.jdbc.sql_comandos;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import java.net.URI;
import org.glassfish.jersey.client.ClientProperties;

/**
 * Jersey REST client generated for REST resource:ProductoFacadeREST
 * [inser.restful.restful_crud.producto]<br>
 * USAGE:
 * <pre>
 *        Producto client = new Producto();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author informatica
 */
public class cliente_jdbc_servidor_https_spring {
    public static String k_path_restful = "/restful"; 
    public static String k_path = k_path_restful + "/jdbc_servidor_https_spring"; 
    public static String k_path_crear = "/crear"; 
    public static String k_path_crear_auto = "/crear/auto"; 
    public static String k_path_leer = "/leer"; 
    public static String k_path_actualizar = "/actualizar"; 
    public static String k_path_borrar = "/borrar"; 
    public static String jdbc_servidor_usuario_tex = "jdbc.usuario";
    public static String jdbc_servidor_clave_tex = "jdbc.clave";        
    public URI uri_sin_ruta;
    public String jdbc_usuario;
    public String jdbc_contraseña;
    public Client client;
    // Si es null, no se evita la verificación de hostname
    public sslcontext_cliente_sin_verificar_hostnames sslcontext_cliente_sin_verificar_hostname = new sslcontext_cliente_sin_verificar_hostnames();
    
    public boolean iniciar(String uri_sin_ruta_tex, String usuario, String contraseña
            , oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        try {
            URI uri = new URI(uri_sin_ruta_tex);
            uri_sin_ruta = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), null, null, null);
            jdbc_usuario = usuario;
            jdbc_contraseña = contraseña;
            if (sslcontext_cliente_sin_verificar_hostname != null) {
                sslcontext_cliente_sin_verificar_hostname.evitar_excepcion_no_name_matching();
                client = ClientBuilder.newBuilder().sslContext(sslcontext_cliente_sin_verificar_hostnames.getSSLContext()).build();
            } else {
                client = ClientBuilder.newBuilder().build();
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }

    public String prueba(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        String resultado = null;
        try {
            URI uri;
            int status;
            Response response;
            Entity entity;
            uri = uri_sin_ruta.resolve(k_path + "/prueba");
            WebTarget webTarget = client.target(uri);
            webTarget.property(ClientProperties.FOLLOW_REDIRECTS, Boolean.TRUE);
            Builder builder = webTarget.request();
            MultivaluedMap<String, Object> multivaluedMap = new MultivaluedHashMap();
            multivaluedMap.add(jdbc_servidor_usuario_tex, jdbc_usuario);
            multivaluedMap.add(jdbc_servidor_clave_tex, jdbc_contraseña);
            builder = builder.headers(multivaluedMap);
            builder = builder.accept(MediaType.TEXT_PLAIN);
            entity = jakarta.ws.rs.client.Entity.entity("", MediaType.TEXT_PLAIN);
            response = builder.post(entity);
            status = response.getStatus();
            if (status < 200 || status >= 300) {
                ok.setTxt(response.readEntity(String.class));
                resultado = null;
            } else {
                resultado = response.readEntity(String.class);
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return resultado;
    }
    /**
     * Cliente del servidor restful: jdbc_servidor_https_spring para la creación de registros con clave automática
     * @param sql_comando
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public sql_comandos crear_auto(sql_comandos sql_comando, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        sql_comandos sql_comando_resultado = null;
        try {
            URI uri;
            int status;
            Response response;
            Entity entity;
            uri = uri_sin_ruta.resolve(k_path + k_path_crear_auto);
            WebTarget webTarget = client.target(uri);
            webTarget.property(ClientProperties.FOLLOW_REDIRECTS, Boolean.TRUE);
            Builder builder = webTarget.request();
            MultivaluedMap<String, Object> multivaluedMap = new MultivaluedHashMap();
            multivaluedMap.add(jdbc_servidor_usuario_tex, jdbc_usuario);
            multivaluedMap.add(jdbc_servidor_clave_tex, jdbc_contraseña);
            builder = builder.headers(multivaluedMap);
            builder = builder.accept(MediaType.APPLICATION_JSON);
            entity = jakarta.ws.rs.client.Entity.entity(sql_comando, MediaType.APPLICATION_JSON);
            response = builder.post(entity);
            status = response.getStatus();
            if (status < 200 || status >= 300) {
                ok.setTxt(response.readEntity(String.class));
                sql_comando_resultado = null;
            } else {
                sql_comando_resultado = response.readEntity(sql_comandos.class);
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return sql_comando_resultado;
    }
    /**
     * Cliente del servidor restful: jdbc_servidor_https_spring para la creación de registros
     * @param sql_comando
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear(sql_comandos sql_comando, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        try {
            URI uri;
            int status;
            Response response;
            Entity entity;
            uri = uri_sin_ruta.resolve(k_path + k_path_crear);
            WebTarget webTarget = client.target(uri);
            webTarget.property(ClientProperties.FOLLOW_REDIRECTS, Boolean.TRUE);
            Builder builder = webTarget.request();
            MultivaluedMap<String, Object> multivaluedMap = new MultivaluedHashMap();
            multivaluedMap.add(jdbc_servidor_usuario_tex, jdbc_usuario);
            multivaluedMap.add(jdbc_servidor_clave_tex, jdbc_contraseña);
            builder = builder.headers(multivaluedMap);
            builder = builder.accept(MediaType.APPLICATION_JSON);
            entity = jakarta.ws.rs.client.Entity.entity(sql_comando, MediaType.APPLICATION_JSON);
            response = builder.post(entity);
            status = response.getStatus();
            if (status < 200 || status >= 300) {
                ok.setTxt(response.readEntity(String.class));
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    /**
     * Cliente del servidor restful: jdbc_servidor_https_spring para la lectura de registros
     * @param sql_comando
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public sql_comandos leer(sql_comandos sql_comando, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        sql_comandos sql_comando_resultado = null;
        try {
            URI uri;
            int status;
            Response response;
            Entity entity;
            uri = uri_sin_ruta.resolve(k_path + k_path_leer);
            WebTarget webTarget = client.target(uri);
            webTarget.property(ClientProperties.FOLLOW_REDIRECTS, Boolean.TRUE);
            Builder builder = webTarget.request();
            MultivaluedMap<String, Object> multivaluedMap = new MultivaluedHashMap();
            multivaluedMap.add(jdbc_servidor_usuario_tex, jdbc_usuario);
            multivaluedMap.add(jdbc_servidor_clave_tex, jdbc_contraseña);
            builder = builder.headers(multivaluedMap);
            builder = builder.accept(MediaType.APPLICATION_JSON);
            entity = jakarta.ws.rs.client.Entity.entity(sql_comando, MediaType.APPLICATION_JSON);
            response = builder.post(entity);
            status = response.getStatus();
            if (status < 200 || status >= 300) {
                ok.setTxt(response.readEntity(String.class));
                sql_comando_resultado = null;
            } else {
                sql_comando_resultado = response.readEntity(sql_comandos.class);
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return sql_comando_resultado;
    }
    /**
     * Cliente del servidor restful: jdbc_servidor_https_spring para la actualización de registros
     * @param sql_comando
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean actualizar(sql_comandos sql_comando, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        try {
            URI uri;
            int status;
            Response response;
            Entity entity;
            uri = uri_sin_ruta.resolve(k_path + k_path_actualizar);
            WebTarget webTarget = client.target(uri);
            webTarget.property(ClientProperties.FOLLOW_REDIRECTS, Boolean.TRUE);
            Builder builder = webTarget.request();
            MultivaluedMap<String, Object> multivaluedMap = new MultivaluedHashMap();
            multivaluedMap.add(jdbc_servidor_usuario_tex, jdbc_usuario);
            multivaluedMap.add(jdbc_servidor_clave_tex, jdbc_contraseña);
            builder = builder.headers(multivaluedMap);
            builder = builder.accept(MediaType.APPLICATION_JSON);
            entity = jakarta.ws.rs.client.Entity.entity(sql_comando, MediaType.APPLICATION_JSON);
            response = builder.post(entity);
            status = response.getStatus();
            if (status < 200 || status >= 300) {
                ok.setTxt(response.readEntity(String.class));
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    /**
     * Cliente del servidor restful: jdbc_servidor_https_spring para el borrado de registros
     * @param sql_comando
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean borrar(sql_comandos sql_comando, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        try {
            URI uri;
            int status;
            Response response;
            Entity entity;
            uri = uri_sin_ruta.resolve(k_path + k_path_borrar);
            WebTarget webTarget = client.target(uri);
            webTarget.property(ClientProperties.FOLLOW_REDIRECTS, Boolean.TRUE);
            Builder builder = webTarget.request();
            MultivaluedMap<String, Object> multivaluedMap = new MultivaluedHashMap();
            multivaluedMap.add(jdbc_servidor_usuario_tex, jdbc_usuario);
            multivaluedMap.add(jdbc_servidor_clave_tex, jdbc_contraseña);
            builder = builder.headers(multivaluedMap);
            builder = builder.accept(MediaType.APPLICATION_JSON);
            entity = jakarta.ws.rs.client.Entity.entity(sql_comando, MediaType.APPLICATION_JSON);
            response = builder.post(entity);
            status = response.getStatus();
            if (status < 200 || status >= 300) {
                ok.setTxt(response.readEntity(String.class));
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
}
