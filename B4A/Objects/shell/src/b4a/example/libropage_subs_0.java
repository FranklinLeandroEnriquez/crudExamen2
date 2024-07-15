package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class libropage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "libropage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"LibroPage\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("LibroPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "libropage","btndelete_click", __ref); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.libropage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libropage parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,51);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 52;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 53;BA.debugLine="Wait For (libroService.Delete(txtId.Text)) Compl";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libropage", "btndelete_click"), __ref.getField(false,"_libroservice" /*RemoteObject*/ ).runClassMethod (b4a.example.libroservice.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 54;BA.debugLine="If success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 55;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 56;BA.debugLine="txtTitulo.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txttitulo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 57;BA.debugLine="txtAutor.Text = \"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtautor" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 58;BA.debugLine="txtAnio.Text = \"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtanio" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 59;BA.debugLine="txtGeneroId.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtgeneroid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 61;BA.debugLine="Msgbox(\"Eliminación Exitosa\", \"Éxito\")";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Eliminación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 63;BA.debugLine="Msgbox(\"No se encontró el registro\", \"Error\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontró el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 67;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","411272208",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 68;BA.debugLine="Msgbox(\"Error\", \"Error\")";
Debug.ShouldStop(8);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _btnread_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("btnread_click")) { __ref.runUserSub(false, "libropage","btnread_click", __ref); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.libropage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libropage parent;
RemoteObject _libro = RemoteObject.declareNull("b4a.example.libro");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,31);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 32;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 33;BA.debugLine="Wait For (libroService.ReadById(txtId.Text)) Com";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libropage", "btnread_click"), __ref.getField(false,"_libroservice" /*RemoteObject*/ ).runClassMethod (b4a.example.libroservice.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_libro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("libro", _libro);
;
 BA.debugLineNum = 35;BA.debugLine="If libro.id <> 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_libro.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 36;BA.debugLine="txtId.Text = libro.id";
Debug.ShouldStop(8);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_libro.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="txtTitulo.Text = libro.titulo";
Debug.ShouldStop(16);
__ref.getField(false,"_txttitulo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_libro.getField(true,"_titulo" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="txtAutor.Text = libro.autor";
Debug.ShouldStop(32);
__ref.getField(false,"_txtautor" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_libro.getField(true,"_autor" /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="txtAnio.Text = libro.anio";
Debug.ShouldStop(64);
__ref.getField(false,"_txtanio" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_libro.getField(true,"_anio" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="txtGeneroId.Text = libro.generoId";
Debug.ShouldStop(128);
__ref.getField(false,"_txtgeneroid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_libro.getField(true,"_generoid" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 42;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 46;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","411206671",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 47;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _btnsave_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("btnsave_click")) { __ref.runUserSub(false, "libropage","btnsave_click", __ref); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.libropage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libropage parent;
RemoteObject _librotocreate = RemoteObject.declareNull("b4a.example.libro");
RemoteObject _libroresult = RemoteObject.declareNull("b4a.example.libro");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,95);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 96;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 97;BA.debugLine="Dim libroToCreate As Libro";
Debug.ShouldStop(1);
_librotocreate = RemoteObject.createNew ("b4a.example.libro");Debug.locals.put("libroToCreate", _librotocreate);
 BA.debugLineNum = 99;BA.debugLine="libroToCreate.titulo = txtTitulo.Text";
Debug.ShouldStop(4);
_librotocreate.setField ("_titulo" /*RemoteObject*/ ,__ref.getField(false,"_txttitulo" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 100;BA.debugLine="libroToCreate.autor = txtAutor.Text";
Debug.ShouldStop(8);
_librotocreate.setField ("_autor" /*RemoteObject*/ ,__ref.getField(false,"_txtautor" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 101;BA.debugLine="libroToCreate.anio = txtAnio.Text";
Debug.ShouldStop(16);
_librotocreate.setField ("_anio" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtanio" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 102;BA.debugLine="libroToCreate.generoId = txtGeneroId.Text";
Debug.ShouldStop(32);
_librotocreate.setField ("_generoid" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtgeneroid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 104;BA.debugLine="Wait For (libroService.Create(libroToCreate)) Co";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libropage", "btnsave_click"), __ref.getField(false,"_libroservice" /*RemoteObject*/ ).runClassMethod (b4a.example.libroservice.class, "_create" /*RemoteObject*/ ,(Object)(_librotocreate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_libroresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("libroResult", _libroresult);
;
 BA.debugLineNum = 105;BA.debugLine="If libroResult <> Null Then";
Debug.ShouldStop(256);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_libroresult)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 106;BA.debugLine="txtId.Text = libroResult.id";
Debug.ShouldStop(512);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_libroresult.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="Msgbox(\"Creación Exitosa\", \"Éxito\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Creación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 109;BA.debugLine="Msgbox(\"No se pudo crear el registro\", \"Error\")";
Debug.ShouldStop(4096);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 113;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","411403282",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 114;BA.debugLine="Msgbox(\"Error\", \"Error\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _btnupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("btnupdate_click")) { __ref.runUserSub(false, "libropage","btnupdate_click", __ref); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.libropage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.libropage parent;
RemoteObject _librotoupdate = RemoteObject.declareNull("b4a.example.libro");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,72);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 73;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 74;BA.debugLine="Dim libroToUpdate As Libro";
Debug.ShouldStop(512);
_librotoupdate = RemoteObject.createNew ("b4a.example.libro");Debug.locals.put("libroToUpdate", _librotoupdate);
 BA.debugLineNum = 76;BA.debugLine="libroToUpdate.id = txtId.Text";
Debug.ShouldStop(2048);
_librotoupdate.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 77;BA.debugLine="libroToUpdate.titulo = txtTitulo.Text";
Debug.ShouldStop(4096);
_librotoupdate.setField ("_titulo" /*RemoteObject*/ ,__ref.getField(false,"_txttitulo" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 78;BA.debugLine="libroToUpdate.autor = txtAutor.Text";
Debug.ShouldStop(8192);
_librotoupdate.setField ("_autor" /*RemoteObject*/ ,__ref.getField(false,"_txtautor" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 79;BA.debugLine="libroToUpdate.anio = txtAnio.Text";
Debug.ShouldStop(16384);
_librotoupdate.setField ("_anio" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtanio" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 80;BA.debugLine="libroToUpdate.generoId = txtGeneroId.Text";
Debug.ShouldStop(32768);
_librotoupdate.setField ("_generoid" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtgeneroid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 82;BA.debugLine="Wait For (libroService.Update(txtId.Text, libroT";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "libropage", "btnupdate_click"), __ref.getField(false,"_libroservice" /*RemoteObject*/ ).runClassMethod (b4a.example.libroservice.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_librotoupdate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 83;BA.debugLine="If success Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"Actualización Exitosa\", \"Éxito\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualización Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 86;BA.debugLine="Msgbox(\"No se encontró el registro\", \"Error\")";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontró el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 90;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","411337746",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 91;BA.debugLine="Msgbox(\"Error\", \"Error\")";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
libropage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",libropage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
libropage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",libropage._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private libroService As LibroService";
libropage._libroservice = RemoteObject.createNew ("b4a.example.libroservice");__ref.setField("_libroservice",libropage._libroservice);
 //BA.debugLineNum = 6;BA.debugLine="Private txtId As EditText";
libropage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",libropage._txtid);
 //BA.debugLineNum = 7;BA.debugLine="Private txtTitulo As EditText";
libropage._txttitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttitulo",libropage._txttitulo);
 //BA.debugLineNum = 8;BA.debugLine="Private txtAutor As EditText";
libropage._txtautor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtautor",libropage._txtautor);
 //BA.debugLineNum = 9;BA.debugLine="Private txtEditorial As EditText";
libropage._txteditorial = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txteditorial",libropage._txteditorial);
 //BA.debugLineNum = 10;BA.debugLine="Private txtAnio As EditText";
libropage._txtanio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtanio",libropage._txtanio);
 //BA.debugLineNum = 11;BA.debugLine="Private txtPaginas As EditText";
libropage._txtpaginas = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtpaginas",libropage._txtpaginas);
 //BA.debugLineNum = 12;BA.debugLine="Private txtGeneroId As EditText";
libropage._txtgeneroid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtgeneroid",libropage._txtgeneroid);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (libropage) ","libropage",7,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "libropage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="libroService.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_libroservice" /*RemoteObject*/ ).runClassMethod (b4a.example.libroservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="Return Me";
Debug.ShouldStop(131072);
if (true) return __ref;
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}