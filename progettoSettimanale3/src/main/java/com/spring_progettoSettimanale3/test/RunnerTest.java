package com.spring_progettoSettimanale3.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.spring_progettoSettimanale3.model.CentroControllo;
import com.spring_progettoSettimanale3.model.Sonda;

public class RunnerTest {
	
	  @Test
	    public void testObserver() {
	        Sonda sonda = new Sonda(1, 1, 1, 1);
	        CentroControllo centroControllo = new CentroControllo();
	        sonda.addObserver(centroControllo);

	        sonda.setLivelloFumo(4);
	        String expectedUrl = "http:/host/alarm?idsonda=" + sonda.getIdSonda() + "&lat=" + sonda.getLatitudine() + "&lon=" + sonda.getLatitudine() + "&smokelevel=" + sonda.getLivelloFumo();
	        assertEquals("richiesta di allarme inviata con il seguente url: " + expectedUrl, centroControllo.getLastMessage());
	        
	    }

}
