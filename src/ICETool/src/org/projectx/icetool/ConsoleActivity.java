package org.projectx.icetool;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ConsoleActivity extends Activity {
	TextView consoleTextView = null;
    public void onCreate(Bundle savedInstanceState) {
    	ICETool ap = null;
        super.onCreate(savedInstanceState);
        consoleTextView = new TextView(this);
        consoleTextView.setText("");
        consoleTextView.setMovementMethod(new ScrollingMovementMethod());
        setContentView(consoleTextView);        
        ap = ICETool.getInstance();
        ap.setConsoleView(consoleTextView);
        consoleTextView.setText(getResources().getText(R.string.app_name) + " " +
        		ICETool.getInstance().ICETOOL_VERSION +
        		" by " +
        		getResources().getText(R.string.app_author) + "\n"                                
        		);	
            	
    }
}
