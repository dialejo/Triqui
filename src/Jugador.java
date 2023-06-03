
public class Jugador {
	
	//Variables
    //Simbolo escogido por el jugador X o O
	public String simbolo; 
	//Accumulated score
	public int puntaje; 
	//Nombre del jugador
	public String nombre;
	/*
     * Default constructor
     * inicializa la variable y su nombre dejandolo vacio
     */
	
public Jugador() {
        this.simbolo = Box.SIMBOLO_O;
        this.nombre = "";
}
    /*
     * Default constructor
     * inicia el simbolo y el nombre como parametro
     */
    public Jugador(String a, String c) {
        this.simbolo = c;
        this.nombre = a;
    }
}
