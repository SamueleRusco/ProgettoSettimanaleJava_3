package com.spring_progettoSettimanale3.model;

import com.spring_progettoSettimanale3.model.Observer;


import lombok.Data;


@Data
public class CentroControllo implements Observer{
	  private String ultimoMessaggio;
	  private String urlPrevisto;
	    
	  @Override
	  public void update(int idSonda, double latitudine, double longitudine, int livelloFumo) {
        if (livelloFumo > 5) {
            String url = "http:/host/alarm?idsonda=" + idSonda + "&lat=" + latitudine + "&lon=" + longitudine + "&smokelevel=" + livelloFumo;
            ultimoMessaggio="richiesta di allarme inviata con il seguente url: " + url;
            System.out.println(ultimoMessaggio);          
        } else {
        	System.out.println("nessun messaggio è stato lanciato");
        }
    }
    
    public String getLastMessage() {
        return ultimoMessaggio;
    }

    public String getExpectedUrl() {
        return urlPrevisto;
    }

	

	
    
    

	
}



    
