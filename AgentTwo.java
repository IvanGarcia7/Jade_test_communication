package jadeTest;

import javax.swing.JOptionPane;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.*;

public class Segundo extends Agent {
	
	@Override
	protected void setup() {
		addBehaviour(new CyclicBehaviour() {
			@Override
			public void action() {
				//Receive the other agent message
				ACLMessage msg = receive();
				if(msg!=null) {
					JOptionPane.showMessageDialog(null, "Información recivida "+msg.getContent());
					
				}else block();
			}
		});
	}

}
