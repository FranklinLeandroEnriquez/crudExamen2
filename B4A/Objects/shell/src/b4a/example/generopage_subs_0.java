package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class generopage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "generopage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 17;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Root = Root1";
Debug.ShouldStop(131072);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"GeneroPage\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("GeneroPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("btnDelete_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "generopage","btndelete_click", __ref); return;}
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
public ResumableSub_btnDelete_Click(b4a.example.generopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.generopage parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,48);
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
 BA.debugLineNum = 49;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 50;BA.debugLine="Wait For (generoService.Delete(txtId.Text)) Comp";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "generopage", "btndelete_click"), __ref.getField(false,"_generoservice" /*RemoteObject*/ ).runClassMethod (b4a.example.generoservice.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 51;BA.debugLine="If success Then";
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
 BA.debugLineNum = 52;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 53;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 54;BA.debugLine="txtDescripcion.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 56;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Eliminación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontro el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
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
 BA.debugLineNum = 62;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","410289166",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 63;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btnRead_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btnread_click")) { __ref.runUserSub(false, "generopage","btnread_click", __ref); return;}
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
public ResumableSub_btnRead_Click(b4a.example.generopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.generopage parent;
RemoteObject _genero = RemoteObject.declareNull("b4a.example.genero");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,27);
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
 BA.debugLineNum = 28;BA.debugLine="Try";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 29;BA.debugLine="Wait For (generoService.ReadById(txtId.Text)) Co";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "generopage", "btnread_click"), __ref.getField(false,"_generoservice" /*RemoteObject*/ ).runClassMethod (b4a.example.generoservice.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_genero = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("genero", _genero);
;
 BA.debugLineNum = 31;BA.debugLine="If genero.id <> 0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_genero.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 32;BA.debugLine="txtId.Text = genero.id";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_genero.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtNombre.Text = genero.nombre";
Debug.ShouldStop(1);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_genero.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="txtDescripcion.Text = genero.descripcion";
Debug.ShouldStop(2);
__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_genero.getField(true,"_descripcion" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 37;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 41;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","410223630",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 42;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("btnSave_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("btnsave_click")) { __ref.runUserSub(false, "generopage","btnsave_click", __ref); return;}
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
public ResumableSub_btnSave_Click(b4a.example.generopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.generopage parent;
RemoteObject _generotocreate = RemoteObject.declareNull("b4a.example.genero");
RemoteObject _generoresult = RemoteObject.declareNull("b4a.example.genero");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,89);
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
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="Dim generoToCreate As Genero";
Debug.ShouldStop(67108864);
_generotocreate = RemoteObject.createNew ("b4a.example.genero");Debug.locals.put("generoToCreate", _generotocreate);
 BA.debugLineNum = 93;BA.debugLine="generoToCreate.nombre = txtNombre.Text";
Debug.ShouldStop(268435456);
_generotocreate.setField ("_nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 94;BA.debugLine="generoToCreate.descripcion = txtDescripcion.Text";
Debug.ShouldStop(536870912);
_generotocreate.setField ("_descripcion" /*RemoteObject*/ ,__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 96;BA.debugLine="Wait For (generoService.Create(generoToCreate))";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "generopage", "btnsave_click"), __ref.getField(false,"_generoservice" /*RemoteObject*/ ).runClassMethod (b4a.example.generoservice.class, "_create" /*RemoteObject*/ ,(Object)(_generotocreate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_generoresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("generoResult", _generoresult);
;
 BA.debugLineNum = 97;BA.debugLine="If generoResult <> Null Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_generoresult)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 98;BA.debugLine="txtId.Text = generoResult.id";
Debug.ShouldStop(2);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_generoresult.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Creación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 101;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 105;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","410420240",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 106;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("btnUpdate_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("btnupdate_click")) { __ref.runUserSub(false, "generopage","btnupdate_click", __ref); return;}
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
public ResumableSub_btnUpdate_Click(b4a.example.generopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.generopage parent;
RemoteObject _generoupdate = RemoteObject.declareNull("b4a.example.genero");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,68);
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
 BA.debugLineNum = 69;BA.debugLine="Try";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 70;BA.debugLine="Dim generoUpdate As Genero";
Debug.ShouldStop(32);
_generoupdate = RemoteObject.createNew ("b4a.example.genero");Debug.locals.put("generoUpdate", _generoupdate);
 BA.debugLineNum = 72;BA.debugLine="generoUpdate.id = txtId.Text";
Debug.ShouldStop(128);
_generoupdate.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 73;BA.debugLine="generoUpdate.nombre = txtNombre.Text";
Debug.ShouldStop(256);
_generoupdate.setField ("_nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 74;BA.debugLine="generoUpdate.descripcion = txtDescripcion.Text";
Debug.ShouldStop(512);
_generoupdate.setField ("_descripcion" /*RemoteObject*/ ,__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 76;BA.debugLine="Wait For (generoService.Update(txtId.Text, gener";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "generopage", "btnupdate_click"), __ref.getField(false,"_generoservice" /*RemoteObject*/ ).runClassMethod (b4a.example.generoservice.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_generoupdate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 77;BA.debugLine="If success Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 78;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualización Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 80;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
Debug.ShouldStop(32768);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontro el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
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
 BA.debugLineNum = 84;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","410354704",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
generopage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",generopage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
generopage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",generopage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private generoService As GeneroService";
generopage._generoservice = RemoteObject.createNew ("b4a.example.generoservice");__ref.setField("_generoservice",generopage._generoservice);
 //BA.debugLineNum = 5;BA.debugLine="Private txtId As EditText";
generopage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",generopage._txtid);
 //BA.debugLineNum = 6;BA.debugLine="Private txtNombre As EditText";
generopage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",generopage._txtnombre);
 //BA.debugLineNum = 7;BA.debugLine="Private txtDescripcion As EditText";
generopage._txtdescripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtdescripcion",generopage._txtdescripcion);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (generopage) ","generopage",4,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "generopage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="generoService.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_generoservice" /*RemoteObject*/ ).runClassMethod (b4a.example.generoservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 13;BA.debugLine="Return Me";
Debug.ShouldStop(4096);
if (true) return __ref;
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}