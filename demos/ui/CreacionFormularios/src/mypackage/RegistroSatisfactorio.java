package mypackage;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.component.SeparatorField;
import net.rim.device.api.ui.container.MainScreen;

public class RegistroSatisfactorio extends MainScreen implements FieldChangeListener {
	LabelField lblTitulo;
	LabelField lblMensaje;
	ButtonField btnSalir;
	String nombre;
	String apellido;
	public RegistroSatisfactorio(String nombre,String apellido) {
		super(MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR);
		this.apellido = apellido;
		this.nombre = nombre;
		MostrarMensaje();
	}
	private void MostrarMensaje() {
		lblTitulo =  new LabelField("Bienvenido "+ nombre + ",\n");
		lblMensaje =  new LabelField("Estimado, has sido registrado satisfactoriamente.");
		btnSalir =  new ButtonField("Salir");
		add(lblTitulo);
		add(new SeparatorField());
		add(lblMensaje);
		add(btnSalir);
	}
	public void fieldChanged(Field field, int context) {
		if(btnSalir == field)
			UiApplication.getUiApplication().popScreen(this);
	}
}
