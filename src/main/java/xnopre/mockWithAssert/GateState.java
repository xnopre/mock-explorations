package xnopre.mockWithAssert;

public class GateState {
	enum State {
		OPENED, CLOSED
	};

	public State state;
	public int gateNumber;

	public GateState(int gateNumber, State state) {
		this.state = state;
		this.gateNumber = gateNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gateNumber;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GateState other = (GateState) obj;
		if (gateNumber != other.gateNumber)
			return false;
		if (state != other.state)
			return false;
		return true;
	}

}
