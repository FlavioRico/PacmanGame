import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Random;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PacmanServer implements Pacman{

    Tablero tablero;
    ArrayList<Jugador> jugadores ;

    public PacmanServer () {
        this.tablero = new Tablero(20, 20);
        jugadores = new ArrayList();
    }

    public static void main(String[] args){

    }

    @Override
    public Tablero agregarJugador(String nameUser) throws RemoteException {
        Random numero = new Random();
        Jugador player = new Jugador();
        player.setNombre(nameUser);
        player.setPuntaje(0.0);
        player.setX(numero.nextInt(tablero.getColumnas + 1));
        player.setY(numero.nextInt(tablero.getFilas + 1));
        player.setAvatar(numero.nextInt(91 - 65) + 65);
        jugadores.add(player);
        if(tablero.matriz[player.getY][player.getX] == '1'){
          player.setPuntaje(player.getPuntaje() + 1);
          tablero.getMatriz()[player.getY][player.getX] = player.getAvatar();
        }
        else
          tablero.getMatriz()[player.getY][player.getX] = player.getAvatar();


        return tablero;
    }

    @Override
    public void movimientoPacman(Jugador jugador) throws RemoteException {

    }

    @Override
    public Tablero obtenerEstado() throws RemoteException {
        return null;
    }
}
