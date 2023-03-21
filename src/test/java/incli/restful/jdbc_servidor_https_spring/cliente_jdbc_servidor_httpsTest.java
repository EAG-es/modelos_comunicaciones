package incli.restful.jdbc_servidor_https_spring;

import innui.modelos.errores.oks;
import innui.modelos.jdbc.sql_comandos;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author emilio
 */
public class cliente_jdbc_servidor_httpsTest {
    
    public cliente_jdbc_servidor_httpsTest() {
    }

    /**
     * Test of iniciar method, of class cliente_jdbc_servidor_https_borrar.
     */
    @Ignore
    public void testIniciar() throws Exception {
        System.out.println("iniciar");
        String uri_sin_ruta_tex = "";
        String usuario = "";
        String contraseña = "";
        oks ok = null;
        Object[] extra_array = null;
        cliente_jdbc_servidor_https_spring instance = new cliente_jdbc_servidor_https_spring();
        boolean expResult = false;
        boolean result = instance.iniciar(uri_sin_ruta_tex, usuario, contraseña, ok, extra_array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Ignore
    public sql_comandos _crear_auto() throws Exception {
        sql_comandos sql_comando = new sql_comandos();
        oks ok = new oks();
        Object[] extra_array = null;
        sql_comando.clase_driver_jdbc = "com.mysql.cj.jdbc.Driver";
        sql_comando.clase_driver_jdbc_uri_conexion = "jdbc:mysql://localhost:3306/personas?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String comando = "insert into personas (nombre, apellidos"
        + ", sexo, fecha_nacimiento, email, telefono, direccion_nombre"
        + ", direccion_numero, direccion_piso"
        + ", direccion_puerta, ciudad, codigo_postal"
        + ", provincia_o_estado, pais, contraseña, fecha_inicio_validez, comentarios"
        + ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
        sql_comando.crear_clave_nueva_columnas_lista(ok, "id_persona");
        assertTrue(ok.es);
        sql_comando.crear_iniciar(comando, ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("Pepe", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("Pótamo Circense", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("XY", ok, extra_array);
        assertTrue(ok.es);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 10, 1);
        sql_comando.crear_poner_valor(calendar.getTime(), ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("email@email.com", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("555667788", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("Calle Dirección", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor(10, ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor(1, ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("A", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("Ciudad", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor(10001, ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("Provincia", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("País", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("contraseña", ok, extra_array);
        assertTrue(ok.es);
        calendar.set(2023, 03, 20, 11, 23);
        sql_comando.crear_poner_valor(calendar.getTime(), ok, extra_array);
        assertTrue(ok.es);
        sql_comando.crear_poner_valor("Comentario\nmultilínea", ok, extra_array);
        assertTrue(ok.es);
        return sql_comando;
    }
    /**
     * Test of crear method, of class cliente_jdbc_servidor_https_borrar.
     */
    @Ignore
    public void testCrear_auto() throws Exception {
        System.out.println("crear_auto");
        sql_comandos sql_comando = null;
        sql_comandos sql_comando_resultado;
        oks ok = new oks();
        Object[] extra_array = null;
        cliente_jdbc_servidor_https_spring cliente_jdbc_servidor_https_spring = new cliente_jdbc_servidor_https_spring();
        boolean expResult = true;
        sql_comando = _crear_auto();
        cliente_jdbc_servidor_https_spring.iniciar("https://localhost:1024", "personas", "sanosrep", ok, extra_array);
        assertTrue(ok.es);
        // cliente_jdbc_servidor_https.prueba(ok, extra_array);
        sql_comando_resultado = cliente_jdbc_servidor_https_spring.crear_auto(sql_comando, ok, extra_array);
        assertTrue(ok.es);
    }
    
    @Test
    public void testLeer() throws Exception {
        System.out.println("leer");
        sql_comandos sql_comando = new sql_comandos();
        oks ok = new oks();
        Object[] extra_array = null;
        sql_comandos sql_comando_resultado;
        cliente_jdbc_servidor_https_spring cliente_jdbc_servidor_https_spring = new cliente_jdbc_servidor_https_spring();
        sql_comando.clase_driver_jdbc = "com.mysql.cj.jdbc.Driver";
        sql_comando.clase_driver_jdbc_uri_conexion = "jdbc:mysql://localhost:3306/personas?zeroDateTimeBehavior=CONVERT_TO_NULL";
        sql_comando.leer_crear_lectura_columnas_lista(ok, "id_persona", "nombre", "apellidos"
        , "sexo", "fecha_nacimiento", "email", "telefono", "direccion_nombre"
        , "direccion_numero", "direccion_parte_extra_numero", "direccion_piso"
        , "direccion_puerta", "direccion_parte_extra_puerta", "ciudad", "codigo_postal"
        , "provincia_o_estado", "pais", "contraseña", "fecha_inicio_validez", "comentarios");
        String comando = "select <columnas> from personas order by apellidos limit ?, ?";
        sql_comando.leer_iniciar(comando, ok, extra_array);
        assertTrue(ok.es);
        int pagina_inicio_num = 0;
        sql_comando.leer_poner_valor(pagina_inicio_num, ok, extra_array);
        assertTrue(ok.es);
        int pagina_tam = 3;
        sql_comando.leer_poner_valor(pagina_tam, ok, extra_array);
        assertTrue(ok.es);
        cliente_jdbc_servidor_https_spring.iniciar("https://localhost:1024", "personas", "sanosrep", ok, extra_array);
        assertTrue(ok.es);
        sql_comando_resultado = cliente_jdbc_servidor_https_spring.leer(sql_comando, ok, extra_array);
        assertTrue(ok.es);
    }

    /**
     * Test of borrar method, of class clabs.
     */
    @Ignore
    public void testBorrar() throws Exception {
        System.out.println("borrar");
        sql_comandos sql_comando = new sql_comandos();
        oks ok = new oks();
        Object[] extra_array = null;
        boolean expResult = true;
        cliente_jdbc_servidor_https_spring cliente_jdbc_servidor_https_spring = new cliente_jdbc_servidor_https_spring();
        sql_comando.clase_driver_jdbc = "com.mysql.cj.jdbc.Driver";
        sql_comando.clase_driver_jdbc_uri_conexion = "jdbc:mysql://localhost:3306/personas?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String comando = "delete from personas";
        sql_comando.borrar_iniciar(comando, ok, extra_array);
        assertTrue(ok.es);
        cliente_jdbc_servidor_https_spring.iniciar("https://localhost:1024", "personas", "sanosrep", ok, extra_array);
        assertTrue(ok.es);
        boolean result = cliente_jdbc_servidor_https_spring.borrar(sql_comando, ok, extra_array);
        assertEquals(expResult, result);
    }
    
    @Ignore
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        sql_comandos sql_comando = new sql_comandos();
        oks ok = new oks();
        Object[] extra_array = null;
        boolean expResult = true;
        cliente_jdbc_servidor_https_spring cliente_jdbc_servidor_https_spring = new cliente_jdbc_servidor_https_spring();
        sql_comando.clase_driver_jdbc = "com.mysql.cj.jdbc.Driver";
        sql_comando.clase_driver_jdbc_uri_conexion = "jdbc:mysql://localhost:3306/personas?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String comando = "update personas set nombre = ?, apellidos = ?,"
        + " email = ?, telefono = ?"
        + " where nombre = ?" ;
        sql_comando.actualizar_iniciar(comando, ok, extra_array);
        assertTrue(ok.es);
        sql_comando.actualizar_poner_valor("José", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.actualizar_poner_valor("Samo Rico", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.actualizar_poner_valor("josesamorico@email.es", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.actualizar_poner_valor("555000001", ok, extra_array);
        assertTrue(ok.es);
        sql_comando.actualizar_poner_valor("Pepe", ok, extra_array);
        assertTrue(ok.es);
        cliente_jdbc_servidor_https_spring.iniciar("https://localhost:1024", "personas", "sanosrep", ok, extra_array);
        assertTrue(ok.es);
        boolean result = cliente_jdbc_servidor_https_spring.actualizar(sql_comando, ok, extra_array);
        assertEquals(expResult, result);
    }
}
