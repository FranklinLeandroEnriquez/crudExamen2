B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
    
	Private libroService As LibroService
	Private txtId As EditText
	Private txtTitulo As EditText
	Private txtAutor As EditText
	Private txtEditorial As EditText
	Private txtAnio As EditText
	Private txtPaginas As EditText
	Private txtGeneroId As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	libroService.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("LibroPage")
	
End Sub



Private Sub btnRead_Click
	Try
		Wait For (libroService.ReadById(txtId.Text)) Complete (libro As Libro)
        
		If libro.id <> 0 Then
			txtId.Text = libro.id
			txtTitulo.Text = libro.titulo
			txtAutor.Text = libro.autor
			txtAnio.Text = libro.anio
			txtGeneroId.Text = libro.generoId
		Else
			Msgbox("No hay datos", "Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("No hay datos", "Error")
	End Try
End Sub

Private Sub btnDelete_Click
	Try
		Wait For (libroService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtTitulo.Text = ""
			txtAutor.Text = ""
			txtAnio.Text = ""
			txtGeneroId.Text = ""
            
			Msgbox("Eliminación Exitosa", "Éxito")
		Else
			Msgbox("No se encontró el registro", "Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error", "Error")
	End Try
End Sub

Private Sub btnUpdate_Click
	Try
		Dim libroToUpdate As Libro
        
		libroToUpdate.id = txtId.Text
		libroToUpdate.titulo = txtTitulo.Text
		libroToUpdate.autor = txtAutor.Text
		libroToUpdate.anio = txtAnio.Text
		libroToUpdate.generoId = txtGeneroId.Text
        
		Wait For (libroService.Update(txtId.Text, libroToUpdate)) Complete (success As Boolean)
		If success Then
			Msgbox("Actualización Exitosa", "Éxito")
		Else
			Msgbox("No se encontró el registro", "Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error", "Error")
	End Try
End Sub

Private Sub btnSave_Click
	Try
		Dim libroToCreate As Libro
        
		libroToCreate.titulo = txtTitulo.Text
		libroToCreate.autor = txtAutor.Text
		libroToCreate.anio = txtAnio.Text
		libroToCreate.generoId = txtGeneroId.Text
        
		Wait For (libroService.Create(libroToCreate)) Complete (libroResult As Libro)
		If libroResult <> Null Then
			txtId.Text = libroResult.id
			Msgbox("Creación Exitosa", "Éxito")
		Else
			Msgbox("No se pudo crear el registro", "Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error", "Error")
	End Try
End Sub


'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.