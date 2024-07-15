package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class libroservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ApiUrl As String";
libroservice._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",libroservice._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _libro) throws Exception{
try {
		Debug.PushSubsStack("Create (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "libroservice","create", __ref, _libro);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_libro);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.libroservice parent,RemoteObject __ref,RemoteObject _libro) {
this.parent = parent;
this.__ref = __ref;
this._libro = _libro;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libroservice parent;
RemoteObject _libro;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,10);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("libro", _libro);
 BA.debugLineNum = 11;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(1024);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 12;BA.debugLine="json.Initialize(CreateMap( _         \"id\": libro.";
Debug.ShouldStop(2048);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_libro.getField(true,"_id" /*RemoteObject*/ )),RemoteObject.createImmutable(("titulo")),(_libro.getField(true,"_titulo" /*RemoteObject*/ )),RemoteObject.createImmutable(("autor")),(_libro.getField(true,"_autor" /*RemoteObject*/ )),RemoteObject.createImmutable(("editorial")),(_libro.getField(true,"_editorial" /*RemoteObject*/ )),RemoteObject.createImmutable(("anio")),(_libro.getField(true,"_anio" /*RemoteObject*/ )),RemoteObject.createImmutable(("paginas")),(_libro.getField(true,"_paginas" /*RemoteObject*/ )),RemoteObject.createImmutable(("generoId")),(_libro.getField(true,"_generoid" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 21;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(1048576);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 22;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(2097152);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 23;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
Debug.ShouldStop(4194304);
_apijob.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 24;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(8388608);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 26;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libroservice", "create"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 28;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 29;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","411599891",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 30;BA.debugLine="Return Null";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 33;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(1);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 34;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(2);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(4);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 37;BA.debugLine="libro.id = map.Get(\"id\")";
Debug.ShouldStop(16);
_libro.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 38;BA.debugLine="libro.titulo = map.Get(\"titulo\")";
Debug.ShouldStop(32);
_libro.setField ("_titulo" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("titulo"))))));
 BA.debugLineNum = 39;BA.debugLine="libro.autor = map.Get(\"autor\")";
Debug.ShouldStop(64);
_libro.setField ("_autor" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("autor"))))));
 BA.debugLineNum = 40;BA.debugLine="libro.editorial = map.Get(\"editorial\")";
Debug.ShouldStop(128);
_libro.setField ("_editorial" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("editorial"))))));
 BA.debugLineNum = 41;BA.debugLine="libro.anio = map.Get(\"anio\")";
Debug.ShouldStop(256);
_libro.setField ("_anio" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("anio"))))));
 BA.debugLineNum = 42;BA.debugLine="libro.paginas = map.Get(\"paginas\")";
Debug.ShouldStop(512);
_libro.setField ("_paginas" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("paginas"))))));
 BA.debugLineNum = 43;BA.debugLine="libro.generoId = map.Get(\"generoId\")";
Debug.ShouldStop(1024);
_libro.setField ("_generoid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("generoId"))))));
 BA.debugLineNum = 45;BA.debugLine="Return libro";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_libro));return;};
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "libroservice","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.libroservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libroservice parent;
RemoteObject _id;
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,102);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 103;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(64);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 104;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(128);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 105;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
Debug.ShouldStop(256);
_apijob.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 106;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libroservice", "delete"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 108;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 109;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","411796487",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 112;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "libroservice","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="ApiUrl = \"https://apiconsumermmovil.azurewebsites";
Debug.ShouldStop(64);
__ref.setField ("_apiurl" /*RemoteObject*/ ,BA.ObjectToString("https://apiconsumermmovil.azurewebsites.net/api/Libros"));
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ReadById (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("readbyid")) { return __ref.runUserSub(false, "libroservice","readbyid", __ref, _id);}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.libroservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libroservice parent;
RemoteObject _id;
RemoteObject _libro = RemoteObject.declareNull("b4a.example.libro");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadById (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,48);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 49;BA.debugLine="Dim libro As Libro";
Debug.ShouldStop(65536);
_libro = RemoteObject.createNew ("b4a.example.libro");Debug.locals.put("libro", _libro);
 BA.debugLineNum = 50;BA.debugLine="libro.Initialize";
Debug.ShouldStop(131072);
_libro.runClassMethod (b4a.example.libro.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 52;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(524288);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 53;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 54;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(2097152);
_apijob.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 55;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libroservice", "readbyid"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 57;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 58;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","411665418",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 59;BA.debugLine="Return Null";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 62;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(536870912);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 63;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(1073741824);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(-2147483648);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 66;BA.debugLine="libro.id = map.Get(\"id\")";
Debug.ShouldStop(2);
_libro.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 67;BA.debugLine="libro.titulo = map.Get(\"titulo\")";
Debug.ShouldStop(4);
_libro.setField ("_titulo" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("titulo"))))));
 BA.debugLineNum = 68;BA.debugLine="libro.autor = map.Get(\"autor\")";
Debug.ShouldStop(8);
_libro.setField ("_autor" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("autor"))))));
 BA.debugLineNum = 69;BA.debugLine="libro.editorial = map.Get(\"editorial\")";
Debug.ShouldStop(16);
_libro.setField ("_editorial" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("editorial"))))));
 BA.debugLineNum = 70;BA.debugLine="libro.anio = map.Get(\"anio\")";
Debug.ShouldStop(32);
_libro.setField ("_anio" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("anio"))))));
 BA.debugLineNum = 71;BA.debugLine="libro.paginas = map.Get(\"paginas\")";
Debug.ShouldStop(64);
_libro.setField ("_paginas" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("paginas"))))));
 BA.debugLineNum = 72;BA.debugLine="libro.generoId = map.Get(\"generoId\")";
Debug.ShouldStop(128);
_libro.setField ("_generoid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("generoId"))))));
 BA.debugLineNum = 74;BA.debugLine="Return libro";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_libro));return;};
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _libro) throws Exception{
try {
		Debug.PushSubsStack("Update (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "libroservice","update", __ref, _id, _libro);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_libro);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.libroservice parent,RemoteObject __ref,RemoteObject _id,RemoteObject _libro) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._libro = _libro;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libroservice parent;
RemoteObject _id;
RemoteObject _libro;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (libroservice) ","libroservice",8,__ref.getField(false, "ba"),__ref,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("libro", _libro);
 BA.debugLineNum = 78;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(8192);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 79;BA.debugLine="json.Initialize(CreateMap( _         \"id\": libro.";
Debug.ShouldStop(16384);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_libro.getField(true,"_id" /*RemoteObject*/ )),RemoteObject.createImmutable(("titulo")),(_libro.getField(true,"_titulo" /*RemoteObject*/ )),RemoteObject.createImmutable(("autor")),(_libro.getField(true,"_autor" /*RemoteObject*/ )),RemoteObject.createImmutable(("editorial")),(_libro.getField(true,"_editorial" /*RemoteObject*/ )),RemoteObject.createImmutable(("anio")),(_libro.getField(true,"_anio" /*RemoteObject*/ )),RemoteObject.createImmutable(("paginas")),(_libro.getField(true,"_paginas" /*RemoteObject*/ )),RemoteObject.createImmutable(("generoId")),(_libro.getField(true,"_generoid" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 88;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(8388608);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 89;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(16777216);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 90;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
Debug.ShouldStop(33554432);
_apijob.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 91;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(67108864);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 93;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libroservice", "update"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 95;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 96;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","411730963",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 99;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}