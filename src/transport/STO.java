package transport;

import java.util.Queue;

public class STO {
private Transport transport;
Queue<Transport> queue;

    public STO(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void addCarQueue(Transport transport) {
        if (transport.getClass() != Bus.class) {
            queue.add(transport);
        }
    }

    public void goCarInspection() {
        queue.remove();
    }

}
