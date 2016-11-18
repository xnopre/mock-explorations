package xnopre.fullMock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class DriverTest {

	@Test
	public void should_send_frame_to_open_gate__full_mock() {

		PortComConnector portComConnectorMock = mock(PortComConnector.class);
		Encoder encoderMock = mock(Encoder.class);
		Driver driver = new Driver(portComConnectorMock, encoderMock);

		when(encoderMock.encodeToOpenGate(2)).thenReturn("toto");

		driver.openGate(2);

		verify(portComConnectorMock).send("toto");
	}
}
