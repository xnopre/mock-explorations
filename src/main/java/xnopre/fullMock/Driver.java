package xnopre.fullMock;

public class Driver {

	private PortComConnector portComConnector;
	private Encoder encoder;

	public Driver(PortComConnector portComConnector, Encoder encoder) {
		this.portComConnector = portComConnector;
		this.encoder = encoder;
	}

	public void openGate(int i) {
		portComConnector.send(encoder.encodeToOpenGate(i));
	}

}
