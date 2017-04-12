package tw.org.iii.Home.se8;

public interface ClientListener {
	void clientAdded(ClientEvent event);    // 新增Client會呼叫這個方法
    void clientRemoved(ClientEvent event); // 移除Client會呼叫這個方法

}
