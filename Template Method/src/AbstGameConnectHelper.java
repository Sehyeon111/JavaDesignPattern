
public abstract class AbstGameConnectHelper {

	protected abstract String doSecurity(String string);
	abstract boolean authentication(String id, String password);
	abstract int authorization(String username);
	abstract String connection(String info);
}
