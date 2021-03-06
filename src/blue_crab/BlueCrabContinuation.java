package blue_crab;

import java.io.File;

import rice.Continuation;
import rice.p2p.past.*;

public abstract class BlueCrabContinuation<R, E extends Exception> implements Continuation<R, E>{
	protected boolean received_response = false;
	protected boolean success = false;
	protected PastContent result;
	protected File resultFile;
	
	public boolean receivedResponse(){
		return this.received_response;
	}
	
	public boolean wasSuccessful() {
		return this.success;
	}
	
	public PastContent getResult() {
		return this.result;
	}
}
