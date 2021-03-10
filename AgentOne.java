package jadeTest;

import java.util.ArrayList;
import java.util.List;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;


public class Primero extends Agent {

	@Override
	protected void setup() {
		addBehaviour(new OneShotBehaviour() {
			
			@Override
			public void action() {
				// TODO Auto-generated method stub
				//send a message to the other agent
				
				AID remoteAMSDestiny = new AID("A2@192.168.18.36:1564/JADE", AID.ISGUID);
	            remoteAMSDestiny.addAddresses("http://192.168.18.36:6911/acc");
	            
				ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
						
				msg.setContent("My address: http://192.168.18.6:7911/acc");
				msg.addReceiver(remoteAMSDestiny);
				send(msg);
				
			}
		});
	}
	
}
