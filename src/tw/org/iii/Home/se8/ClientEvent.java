package tw.org.iii.Home.se8;

public class ClientEvent {
	private Client client;
	public ClientEvent(Client client) {
		this.client = client;
	}
	
	public String getName() {
        return client.name;
    }
	
	public String getIp() {
        return client.ip;
    }

}
