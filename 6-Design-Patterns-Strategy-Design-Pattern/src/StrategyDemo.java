
public class StrategyDemo {

	public static void main(String[] args) {
		StrategySwapper context = new StrategySwapper();
		context.setStrategy(new BluetoothStrategy());
		context.connect("Nick's phone");

		context.setStrategy(new AuxStrategy());
		context.connect("Jordan's phone");

		context.setStrategy(new HdmiStrategy());
		context.connect("Piers' phone");

	}

}

//class BluetoothStrategy {
//    public void connectToBluetooth(String phone) {
//        System.out.println(String.format("Connecting with %s through Bluetooth...", phone));
//        System.out.println("Bluetooth connected.");
//    }
//}
//class AuxStrategy {
//    public void connectToAux(String phone) {
//        System.out.println(String.format("Connecting with %s via aux cable...", phone));
//        System.out.println("Aux connected.");
//    }
//}
//
//class HdmiStrategy {
//    public void connectToHdmi(String phone) {
//        System.out.println(String.format("Connecting to %s via HDMI audio...", phone));
//        System.out.println("HDMI audio connected.");
//    }
//}

interface ConnectionStrategy {
	public void connectTo(String phone);
}

class BluetoothStrategy implements ConnectionStrategy {
	@Override
	public void connectTo(String phone) {
		System.out.println(String.format("Connecting with %s through Bluetooth...", phone));
		System.out.println("Bluetooth connected.");
	}
}

class AuxStrategy implements ConnectionStrategy {
	@Override
	public void connectTo(String phone) {
		System.out.println(String.format("Connecting with %s via aux cable...", phone));
		System.out.println("Aux connected.");
	}
}

class HdmiStrategy implements ConnectionStrategy {
	@Override
	public void connectTo(String phone) {
		System.out.println(String.format("Connecting to %s via HDMI audio...", phone));
		System.out.println("HDMI audio connected.");
	}
}

class StrategySwapper {
	ConnectionStrategy strategy;

	public void setStrategy(ConnectionStrategy strategy) {
		this.strategy = strategy;
	}

	public void connect(String phoneName) {
		strategy.connectTo(phoneName);
	}
}