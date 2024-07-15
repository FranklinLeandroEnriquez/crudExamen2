B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private generoService As GeneroService
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtDescripcion As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	generoService.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("GeneroPage")
End Sub



'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnRead_Click
	Try
		Wait For (generoService.ReadById(txtId.Text)) Complete (genero As Genero)
	
		If genero.id <> 0 Then
			txtId.Text = genero.id
			txtNombre.Text = genero.nombre
			txtDescripcion.Text = genero.descripcion
		
		Else
			Msgbox("No hay datos","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("No hay datos","Error")
	End Try
	
	
End Sub

Private Sub btnDelete_Click
	Try
		Wait For (generoService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtNombre.Text = ""
			txtDescripcion.Text = ""
			
			Msgbox("Eliminación Exitosa","Éxito")
		Else
			Msgbox("No se encontro el registro","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
	
End Sub

Private Sub btnUpdate_Click
	Try
		Dim generoUpdate As Genero
		
		generoUpdate.id = txtId.Text
		generoUpdate.nombre = txtNombre.Text
		generoUpdate.descripcion = txtDescripcion.Text
		
		Wait For (generoService.Update(txtId.Text, generoUpdate)) Complete (success As Boolean)
		If success Then
			Msgbox("Actualización Exitosa","Éxito")
		Else
			Msgbox("No se encontro el registro","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
End Sub

Private Sub btnSave_Click
	Try
		Dim generoToCreate As Genero
		
		generoToCreate.nombre = txtNombre.Text
		generoToCreate.descripcion = txtDescripcion.Text
		
		Wait For (generoService.Create(generoToCreate)) Complete (generoResult As Genero)
		If generoResult <> Null Then
			txtId.Text = generoResult.id
			Msgbox("Creación Exitosa","Éxito")
		Else
			Msgbox("No se pudo crear el registro","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
	
End Sub