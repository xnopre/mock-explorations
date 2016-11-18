package xnopre.mockVerify;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class DriverTest {

	@Test
	public void should_send_frame_to_open_gate() {

		PortComConnector portComConnectorMock = mock(PortComConnector.class);
		Driver driver = new Driver(portComConnectorMock, new Encoder());

		driver.openGate(2);

		verify(portComConnectorMock).send("OG2");
	}

}
