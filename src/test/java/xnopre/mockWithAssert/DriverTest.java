package xnopre.mockWithAssert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static xnopre.mockWithAssert.GateState.State.OPENED;

import org.junit.Test;

public class DriverTest {

	@Test
	public void should_not_throw_exception_if_OK() {

		PortComConnector portComConnectorMock = mock(PortComConnector.class);
		Driver driver = new Driver(portComConnectorMock, new Encoder());

		when(portComConnectorMock.send(anyString())).thenReturn("OK");

		GateState gateState = driver.openGate(2);

		assertThat(gateState).isEqualTo(new GateState(2, OPENED));
	}

}
