package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class libro_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public id As Int";
libro._id = RemoteObject.createImmutable(0);__ref.setField("_id",libro._id);
 //BA.debugLineNum = 3;BA.debugLine="Public titulo As String";
libro._titulo = RemoteObject.createImmutable("");__ref.setField("_titulo",libro._titulo);
 //BA.debugLineNum = 4;BA.debugLine="Public autor As String";
libro._autor = RemoteObject.createImmutable("");__ref.setField("_autor",libro._autor);
 //BA.debugLineNum = 5;BA.debugLine="Public editorial As String";
libro._editorial = RemoteObject.createImmutable("");__ref.setField("_editorial",libro._editorial);
 //BA.debugLineNum = 6;BA.debugLine="Public anio As Int";
libro._anio = RemoteObject.createImmutable(0);__ref.setField("_anio",libro._anio);
 //BA.debugLineNum = 7;BA.debugLine="Public paginas As Int";
libro._paginas = RemoteObject.createImmutable(0);__ref.setField("_paginas",libro._paginas);
 //BA.debugLineNum = 8;BA.debugLine="Public generoId As Int";
libro._generoid = RemoteObject.createImmutable(0);__ref.setField("_generoid",libro._generoid);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (libro) ","libro",6,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "libro","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}