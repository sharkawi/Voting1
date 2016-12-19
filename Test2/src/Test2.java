import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.geom.Rectangle2D;


public class Test2 {
	public String Return1 = "No Data";
	
	
	public static Boolean runSystemCommand3(String command) {
		Boolean Return2 = false;

		try {
			
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
			//	System.out.println(s);
			if (s.toLowerCase().contains("(0% loss)") == true) 
				Return2 = true;
			//System.out.println("loop: " + Return2);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Exit: " + Return2);
		return Return2;
	}
	public static void main(String[] args) {
		// Set Variables
		Boolean Feedback1 = false;
		String[] IPlist;
		IPlist = new String[5];
		IPlist[0] = "google.com";
		IPlist[1] = "4.2.2.1";
		System.out.println("First: " + IPlist[0]);
		System.out.println("Second: " + IPlist[1]);
		
		Boolean[] IPlistResponse;
		IPlistResponse = new Boolean[5];
		
		
		//Test basic functionality
		System.out.println("Hello, World");
		
		//Create class
		//Class2.MyMethod3();
		Test2 rsc1 = new Test2();
		
		//String ip2 = "google.com";
		//runSystemCommand3("ping " + ip2);
		//System.out.println("blank");
		//System.out.println(Return2);
		
		//Testing drawing
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 300, 300);;
		window.getContentPane().add(new MyCanvas());
		window.setVisible(true);
		//window.setColor(Color.RED);
		
		//Feedback1 = rsc1.runSystemCommand3("ping " + ip2);
		for(int i=0; i<2;i++) {
		IPlistResponse[i] = rsc1.runSystemCommand3("ping " + IPlist[i]);
		System.out.println("Did " + IPlist[i] + " respond? " + IPlistResponse[i]);
		}
		
		//System.out.println(rsc1.Return2);
	}

}
