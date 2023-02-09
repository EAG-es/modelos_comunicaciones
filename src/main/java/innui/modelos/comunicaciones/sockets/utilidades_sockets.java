/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innui.modelos.comunicaciones.sockets;

import innui.modelos.errores.oks;
import java.net.ServerSocket;

/**
 *
 * @author emilio
 */
public class utilidades_sockets {

    public static int encontrar_puerto_libre(int puerto_de_inicio, oks ok, Object... extra_array) throws Exception {
        int i = puerto_de_inicio;
        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(i)) {
                break;
            } catch (Exception e) {
                i = i + 1;
            }
        }
        return i;
    }
}
