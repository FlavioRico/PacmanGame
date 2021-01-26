import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Pacman extends Remote {

    public Tablero agregarJugador (String nameUser) throws RemoteException;
    public void movimientoPacman (Jugador jugador) throws RemoteException;
    public Tablero obtenerEstado () throws RemoteException;

}
