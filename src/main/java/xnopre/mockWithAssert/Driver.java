package xnopre.mockWithAssert;

import xnopre.mockWithAssert.GateState.State;

public class Driver {

	private PortComConnector portComConnector;
	private Encoder encoder;

	public Driver(PortComConnector portComConnector, Encoder encoder) {
		this.portComConnector = portComConnector;
		this.encoder = encoder;
	}

	public GateState openGate(int i) {
		// String result = connector.transmit(encoder.encodeToOpenGate(i) );
		// if (!result.equals("OK")) {
		// throw new RuntimeException();
		// }
		return new GateState(i, State.OPENED);
	}

}
