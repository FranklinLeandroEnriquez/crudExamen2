B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apijob As HttpJob
	Public ApiUrl As String
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ApiUrl = "https://apiconsumermmovil.azurewebsites.net/api/Generos"
End Sub

public Sub Create(genero As Genero) As ResumableSub
	Dim json As String
	
	json = "{'nombre':'"&genero.nombre&"','descripcion':'"&genero.descripcion&"'}"
	
	apijob.Initialize("", Me)
	apijob.PostString(ApiUrl,json)
	apijob.GetRequest.SetContentType("application/json")
	
	wait for (apijob) JobDone(resultado As HttpJob)
	
	If resultado.Success <> True Then
		Return Null
	End If
	
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject
		
	genero.id = map.Get("id")
	genero.nombre = map.Get("nombre")
	genero.descripcion = map.Get("descripcion")
	
	Return genero
End Sub

Public Sub ReadById(id As Int) As ResumableSub
	Dim genero As Genero
	genero.Initialize
	
	apijob.Initialize("", Me)
	apijob.Download( ApiUrl & "/" & id)
	Wait For (apijob) JobDone( resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		
		genero.id = map.Get("id")
		genero.nombre = map.Get("nombre")
		genero.descripcion = map.Get("descripcion")
	End If
	
	Return genero
End Sub


Public Sub Update(id As Int, genero As Genero) As ResumableSub
	Dim json As String
	
	json = "{'id':"& genero.id &",'nombre':'"&genero.nombre&"','descripcion':'"&genero.descripcion&"'}"
	
	apijob.Initialize("", Me)
	apijob.PutString(ApiUrl & "/" & id,json)
	apijob.GetRequest.SetContentType("application/json")
	
	wait for (apijob) JobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	apijob.Initialize("", Me)
	apijob.Delete( ApiUrl & "/" & id)
	Wait For (apijob) JobDone( resultado As HttpJob)
	Return resultado.Success
End Sub