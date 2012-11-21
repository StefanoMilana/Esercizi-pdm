package com.example.esercitazione_22_11_2012;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    @Override/**Metodo di callback, e si tratta dell'operazione invocata in corrispondenza della creazione dell'activity e che contiene le principali operazioni di inizializzazione*/
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);/**invochiamo i metodi base*/
        setContentView(R.layout.activity_main);/**Questo metodo ci permette di far riferimento a una risorsa definita nell'apposita cartella */
    
        Button uno = (Button) findViewById(R.id.button1);/**Con questo metodo facciamo riferimento al componente Button(in questo caso 1 ,poi 2 , fino a 5 )*/
        uno.setOnClickListener(new OnClickListener() {/**Questa e' l'interfaccia che gestirà l'evento , e questo codice sarà attivato quando sarà attivto il bottone*/
			
			/**Il comando findViewBiId ricercano nel layout caricato 
			 * un componente avente l'ID specificato come argomento */
        	public void onClick(View v) {
				Intent primo = new Intent(MainActivity.this , Primo.class);/**Qui lancio un activity di cui conosco la classe*/
				startActivity(primo);
				
			}
		});
        
    Button due = (Button) findViewById(R.id.button2);
	due.setOnClickListener(new OnClickListener() {
		
		
		public void onClick(View v) {
			
			Intent secondo = new Intent(MainActivity.this,Secondo.class);
			startActivity(secondo);
		}
	});
	
    Button tre = (Button) findViewById(R.id.button3);
	tre.setOnClickListener(new OnClickListener() {
		
		
		public void onClick(View v) {
			
			Intent terzo = new Intent(MainActivity.this,Terzo.class);
			startActivity(terzo);
		}
	});
	  Button quattro = (Button) findViewById(R.id.button4);
		quattro.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				
				Intent four = new Intent(MainActivity.this,Quarto.class);
				startActivity(four);
			}
		});
		 Button cinque = (Button) findViewById(R.id.button5);
			cinque.setOnClickListener(new OnClickListener() {
				
				
				public void onClick(View v) {
					
					Intent quintoq = new Intent(MainActivity.this,Quinto.class);
					startActivity(quintoq);
				}
			});
			
    
    }

        
    	public boolean onCreateOptionsMenu(Menu menu) {
    		// Inflate the menu; this adds items to the action bar if it is present.
    		getMenuInflater().inflate(R.menu.activity_main, menu);
    		return true;
    	}

    }

