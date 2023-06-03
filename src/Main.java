import javax.swing.JOptionPane;

public class Main {
	 public static final String[] SELECT_VALUES = {"SI", "NO"};
	 
	 public static void main(String[] args) {
	        boolean game = true;
	        String np1 = "", np2 = "", p1Simbolo = "", p2Simbolo = "";
	        while(game) {
	        	JOptionPane.showMessageDialog(null, "...:::bienvenido a Poli triqui:::...");
	        boolean correctData = false;
	        // la siguiente seccion valida la data de los participantes
	        // no sera permitido dejar data vacia
	        
	        while(!correctData) {
	        	np1 = JOptionPane.showInputDialog(null, "entre el nombre del primer jugador",
	        			"Poli Triqui", JOptionPane.QUESTION_MESSAGE);
	        	if((np1 = np1.toUpperCase().trim()).isEmpty())
	        		JOptionPane.showMessageDialog(null, "Error. no puedes dejar vacio este nombre",
	        				"Error", JOptionPane.ERROR_MESSAGE);
	                    correctData = true;
	            }
	        correctData = false;
	        while(!correctData) {
	        	np2 = JOptionPane.showInputDialog(null, "entre el nombre del segundo jugador",
	        			"Poli Triqui", JOptionPane.QUESTION_MESSAGE);
	        	if((np2 = np2.toUpperCase().trim()).isEmpty())
	        		JOptionPane.showMessageDialog(null, "Error. no puedes dejar vacio este nombre",
	        				"Error", JOptionPane.ERROR_MESSAGE);
	        	else {
	        		if(np2.equals(np1))
	        			JOptionPane.showMessageDialog(null, "Error. el nombre del los jugadores no puede ser igual",
	        					"Error", JOptionPane.ERROR_MESSAGE);
            		else
            		    correctData = true;
	        		}
	        	}
	        correctData = false;
	        p1Simbolo = (String) JOptionPane.showInputDialog(null, np1 + " escoge tu simbolo X o O",
	        		"Poli Triqui", JOptionPane.QUESTION_MESSAGE, null,
	        		new String[] {Box.SIMBOLO_X, Box.SIMBOLO_O}, Box.SIMBOLO_X);
	        boolean answer = true;
	        while(answer) {
	        	p2Simbolo = (String) JOptionPane.showInputDialog(null, np2 + " escoge tu simbolo X o O",
	        			"Poli Triqui", JOptionPane.QUESTION_MESSAGE, null,
	        			new String[] {Box.SIMBOLO_X, Box.SIMBOLO_O}, Box.SIMBOLO_X);
	        	if(p1Simbolo.equalsIgnoreCase(p2Simbolo))
	        		JOptionPane.showMessageDialog(null, np2 + " escoge el otro " +
	        	((p2Simbolo.equals(Box.SIMBOLO_X)) ? Box.SIMBOLO_O : Box.SIMBOLO_X) + " por favor");
	        	else
	        		answer = false;
	        }
	        Jugador p1 = new Jugador(np1, p1Simbolo);
	        Jugador p2 = new Jugador(np2, p2Simbolo);
	        Jugador currentJugador = Triqui.getFirstJugador(p1, p2);
	        
	        Triqui triqui = new Triqui(p1,p2);
	        String tSymbol = currentJugador.simbolo;
	        int position = -1;
	        while(!triqui.isTriqui(tSymbol) && !(triqui.isTie())) {
	        	tSymbol = currentJugador.simbolo;
	        	JOptionPane.showMessageDialog(null, "turno jugador : " +
	        	currentJugador.nombre + ", simbolo: " + tSymbol);
	        	JOptionPane.showMessageDialog(null, triqui.paintTablero());
	        	position = (Integer) JOptionPane.showInputDialog(null,
	        			currentJugador.nombre + " entre position [1..9]",
	        			"Poli Triqui", JOptionPane.QUESTION_MESSAGE, null,
	        			new Integer[] {1,2,3,4,5,6,7,8,9},"0");
	        	if(triqui.assignSymbolBox(position, tSymbol)) {
	        		if(!triqui.isTriqui(tSymbol))
	        			currentJugador = triqui.getCurrentJugador(currentJugador);
	        		else {
	        			JOptionPane.showMessageDialog(null,
	        					"...:::Felicitaciones:::..." + currentJugador.nombre +
	        					" Ganaste ");
	        			break;
	        			} 
	        		}
	        	}
	        if(!triqui.isTriqui(tSymbol) && triqui.isTie()) {
	        	JOptionPane.showMessageDialog(null, "Empate...");
	        	}
	        JOptionPane.showMessageDialog(null, triqui.paintTablero());
	        String cont = (String) JOptionPane.showInputDialog(null,
	        		"quieres jugar un juego nuevo?", "Polo Triqui",
	        		JOptionPane.QUESTION_MESSAGE, null, Main.SELECT_VALUES,
	        		Main.SELECT_VALUES[0]);
	        if(cont.equals(Main.SELECT_VALUES[0]))
	        	game = true;
	        else
	        	game = false;
	        }
	 }
}
