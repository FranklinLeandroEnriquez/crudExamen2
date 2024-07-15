
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class libro {
    public static RemoteObject myClass;
	public libro() {
	}
    public static PCBA staticBA = new PCBA(null, libro.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _titulo = RemoteObject.createImmutable("");
public static RemoteObject _autor = RemoteObject.createImmutable("");
public static RemoteObject _editorial = RemoteObject.createImmutable("");
public static RemoteObject _anio = RemoteObject.createImmutable(0);
public static RemoteObject _paginas = RemoteObject.createImmutable(0);
public static RemoteObject _generoid = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"anio",_ref.getField(false, "_anio"),"autor",_ref.getField(false, "_autor"),"editorial",_ref.getField(false, "_editorial"),"generoId",_ref.getField(false, "_generoid"),"id",_ref.getField(false, "_id"),"paginas",_ref.getField(false, "_paginas"),"titulo",_ref.getField(false, "_titulo")};
}
}