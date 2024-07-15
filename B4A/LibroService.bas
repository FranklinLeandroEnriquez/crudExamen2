B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Public ApiUrl As String
End Sub

' Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ApiUrl = "https://apiconsumermmovil.azurewebsites.net/api/Libros"
End Sub

Public Sub Create(libro As Libro) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap( _
        "id": libro.id, _
        "titulo": libro.titulo, _
        "autor": libro.autor, _
        "editorial": libro.editorial, _
        "anio": libro.anio, _
        "paginas": libro.paginas, _
        "generoId": libro.generoId))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PostString(ApiUrl, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	libro.id = map.Get("id")
	libro.titulo = map.Get("titulo")
	libro.autor = map.Get("autor")
	libro.editorial = map.Get("editorial")
	libro.anio = map.Get("anio")
	libro.paginas = map.Get("paginas")
	libro.generoId = map.Get("generoId")

	Return libro
End Sub

Public Sub ReadById(id As Int) As ResumableSub
	Dim libro As Libro
	libro.Initialize

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Download(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	libro.id = map.Get("id")
	libro.titulo = map.Get("titulo")
	libro.autor = map.Get("autor")
	libro.editorial = map.Get("editorial")
	libro.anio = map.Get("anio")
	libro.paginas = map.Get("paginas")
	libro.generoId = map.Get("generoId")

	Return libro
End Sub

Public Sub Update(id As Int, libro As Libro) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap( _
        "id": libro.id, _
        "titulo": libro.titulo, _
        "autor": libro.autor, _
        "editorial": libro.editorial, _
        "anio": libro.anio, _
        "paginas": libro.paginas, _
        "generoId": libro.generoId))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PutString(ApiUrl & "/" & id, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Delete(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub