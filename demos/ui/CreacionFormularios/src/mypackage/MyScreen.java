package mypackage;
import net.rim.device.api.system.Bitmap;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.BitmapField;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.EditField;
import net.rim.device.api.ui.component.SeparatorField;
import net.rim.device.api.ui.container.HorizontalFieldManager;
import net.rim.device.api.ui.container.MainScreen;
public final class MyScreen extends MainScreen implements FieldChangeListener
{
	ButtonField btnRegistrarse ;
	EditField edtNombre ;
	EditField edtApellido;
	EditField edtEmail;
    BitmapField btfldLogo; 
    public MyScreen()
    {             
        setTitle("Demostracion de Formularios");
        Bitmap btmImagen =  Bitmap.getBitmapResource("logo.png");
        btfldLogo = new BitmapField(btmImagen,FIELD_HCENTER);
        edtNombre =   new EditField("Nombre: * ","");
        edtApellido = new EditField("Apellido: ","");
        edtEmail = new EditField("E-mail: * ","");
        HorizontalFieldManager hfManager =  new HorizontalFieldManager(FIELD_HCENTER);
        btnRegistrarse =  new ButtonField("Registrarse",ButtonField.CONSUME_CLICK);
        btnRegistrarse.setChangeListener(this);
        add(btfldLogo);
        add(edtNombre);
        add(edtApellido);
        add(edtEmail);
        add(new SeparatorField());
        hfManager.add(btnRegistrarse);        
        add(hfManager);
      }
	public void fieldChanged(Field field, int context) {
		if(field == btnRegistrarse)
		{
			Registrar();
		}
	}
	public void Registrar() {
		if(edtNombre.getText().length() <= 0 || edtEmail.getText().length() <= 0 )
		{
			Dialog.inform("Por favor, complete los campos obligatorios.");
		}	
		else
		{
			RegistroSatisfactorio registro  = new RegistroSatisfactorio(edtNombre.getText(),edtApellido.getText());
			UiApplication.getUiApplication().pushScreen(registro);
		}
	}
}
