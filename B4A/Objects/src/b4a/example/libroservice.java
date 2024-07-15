package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class libroservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.libroservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.libroservice.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.libroservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="libroservice";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.libroservice parent,b4a.example.libroservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.libroservice __ref;
b4a.example.libroservice parent;
int _id;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="libroservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
_apijob._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "libroservice", "delete"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("411796487","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=11796491;
 //BA.debugLineNum = 11796491;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readbyid(b4a.example.libroservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="libroservice";
if (Debug.shouldDelegate(ba, "readbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readbyid", new Object[] {_id}));}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.libroservice parent,b4a.example.libroservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.libroservice __ref;
b4a.example.libroservice parent;
int _id;
b4a.example.libro _libro = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="libroservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim libro As Libro";
_libro = new b4a.example.libro();
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="libro.Initialize";
_libro._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
_apijob._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "libroservice", "readbyid"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("411665418","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=11665424;
 //BA.debugLineNum = 11665424;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="libro.id = map.Get(\"id\")";
_libro._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=11665427;
 //BA.debugLineNum = 11665427;BA.debugLine="libro.titulo = map.Get(\"titulo\")";
_libro._titulo /*String*/  = BA.ObjectToString(_map.Get((Object)("titulo")));
RDebugUtils.currentLine=11665428;
 //BA.debugLineNum = 11665428;BA.debugLine="libro.autor = map.Get(\"autor\")";
_libro._autor /*String*/  = BA.ObjectToString(_map.Get((Object)("autor")));
RDebugUtils.currentLine=11665429;
 //BA.debugLineNum = 11665429;BA.debugLine="libro.editorial = map.Get(\"editorial\")";
_libro._editorial /*String*/  = BA.ObjectToString(_map.Get((Object)("editorial")));
RDebugUtils.currentLine=11665430;
 //BA.debugLineNum = 11665430;BA.debugLine="libro.anio = map.Get(\"anio\")";
_libro._anio /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("anio"))));
RDebugUtils.currentLine=11665431;
 //BA.debugLineNum = 11665431;BA.debugLine="libro.paginas = map.Get(\"paginas\")";
_libro._paginas /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("paginas"))));
RDebugUtils.currentLine=11665432;
 //BA.debugLineNum = 11665432;BA.debugLine="libro.generoId = map.Get(\"generoId\")";
_libro._generoid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("generoId"))));
RDebugUtils.currentLine=11665434;
 //BA.debugLineNum = 11665434;BA.debugLine="Return libro";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_libro));return;};
RDebugUtils.currentLine=11665435;
 //BA.debugLineNum = 11665435;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.libroservice __ref,b4a.example.libro _libro) throws Exception{
RDebugUtils.currentModule="libroservice";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_libro}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_libro);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.libroservice parent,b4a.example.libroservice __ref,b4a.example.libro _libro) {
this.parent = parent;
this.__ref = __ref;
this._libro = _libro;
this.__ref = parent;
}
b4a.example.libroservice __ref;
b4a.example.libroservice parent;
b4a.example.libro _libro;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="libroservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="json.Initialize(CreateMap( _         \"id\": libro.";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(_libro._id /*int*/ ),(Object)("titulo"),(Object)(_libro._titulo /*String*/ ),(Object)("autor"),(Object)(_libro._autor /*String*/ ),(Object)("editorial"),(Object)(_libro._editorial /*String*/ ),(Object)("anio"),(Object)(_libro._anio /*int*/ ),(Object)("paginas"),(Object)(_libro._paginas /*int*/ ),(Object)("generoId"),(Object)(_libro._generoid /*int*/ )}));
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
_apijob._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json.ToString());
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "libroservice", "create"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=11599890;
 //BA.debugLineNum = 11599890;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11599891;
 //BA.debugLineNum = 11599891;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("411599891","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=11599899;
 //BA.debugLineNum = 11599899;BA.debugLine="libro.id = map.Get(\"id\")";
_libro._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=11599900;
 //BA.debugLineNum = 11599900;BA.debugLine="libro.titulo = map.Get(\"titulo\")";
_libro._titulo /*String*/  = BA.ObjectToString(_map.Get((Object)("titulo")));
RDebugUtils.currentLine=11599901;
 //BA.debugLineNum = 11599901;BA.debugLine="libro.autor = map.Get(\"autor\")";
_libro._autor /*String*/  = BA.ObjectToString(_map.Get((Object)("autor")));
RDebugUtils.currentLine=11599902;
 //BA.debugLineNum = 11599902;BA.debugLine="libro.editorial = map.Get(\"editorial\")";
_libro._editorial /*String*/  = BA.ObjectToString(_map.Get((Object)("editorial")));
RDebugUtils.currentLine=11599903;
 //BA.debugLineNum = 11599903;BA.debugLine="libro.anio = map.Get(\"anio\")";
_libro._anio /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("anio"))));
RDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="libro.paginas = map.Get(\"paginas\")";
_libro._paginas /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("paginas"))));
RDebugUtils.currentLine=11599905;
 //BA.debugLineNum = 11599905;BA.debugLine="libro.generoId = map.Get(\"generoId\")";
_libro._generoid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("generoId"))));
RDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="Return libro";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_libro));return;};
RDebugUtils.currentLine=11599908;
 //BA.debugLineNum = 11599908;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.libroservice __ref,int _id,b4a.example.libro _libro) throws Exception{
RDebugUtils.currentModule="libroservice";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_libro}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_libro);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.libroservice parent,b4a.example.libroservice __ref,int _id,b4a.example.libro _libro) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._libro = _libro;
this.__ref = parent;
}
b4a.example.libroservice __ref;
b4a.example.libroservice parent;
int _id;
b4a.example.libro _libro;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="libroservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="json.Initialize(CreateMap( _         \"id\": libro.";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(_libro._id /*int*/ ),(Object)("titulo"),(Object)(_libro._titulo /*String*/ ),(Object)("autor"),(Object)(_libro._autor /*String*/ ),(Object)("editorial"),(Object)(_libro._editorial /*String*/ ),(Object)("anio"),(Object)(_libro._anio /*int*/ ),(Object)("paginas"),(Object)(_libro._paginas /*int*/ ),(Object)("generoId"),(Object)(_libro._generoid /*int*/ )}));
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
_apijob._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json.ToString());
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "libroservice", "update"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=11730962;
 //BA.debugLineNum = 11730962;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11730963;
 //BA.debugLineNum = 11730963;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("411730963","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=11730967;
 //BA.debugLineNum = 11730967;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.libroservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="libroservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="ApiUrl = \"https://apiconsumermmovil.azurewebsites";
__ref._apiurl /*String*/  = "https://apiconsumermmovil.azurewebsites.net/api/Libros";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.libroservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="libroservice";
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="End Sub";
return "";
}
}