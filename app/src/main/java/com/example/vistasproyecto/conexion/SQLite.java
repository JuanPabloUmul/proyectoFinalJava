package com.example.vistasproyecto.conexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLite extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NOMBRE = "proyectofinal";
    private static final String TABLE_PRODUCTO = "t_producto";
    private static final String TABLE_CLIENTE = "t_cliente";
    private static final String TABLE_FACTURACION = "t_facturacion";
    private static final String TABLE_USUARIO = "t_usuario";
    private static final String TABLE_DETALLE = "t_detalle";
    private static final String TABLE_PUNTOS = "t_puntos";
    private static final String TABLE_ESTADO = "t_estado";



    public SQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NOMBRE,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase baseDeDatos) {
    baseDeDatos.execSQL("CREATE TABLE "+TABLE_PRODUCTO+"(id Integer primary key autoincrement, " +
                                                        "nombre text, numero_serie text, precio real, cantidad Integer," +
                                                        "estado Integer references TABLE_ESTADO (id_estado), categoria text, foto blob, qrcode blob )");

        baseDeDatos.execSQL("CREATE TABLE "+TABLE_CLIENTE+"(id_cliente Integer primary key autoincrement, " +
                "nombre_cliente text, apellido_cliente text, correo_cliente text, direccion_cliente text," +
                "telefono_cliente text, dpi_cliente text, idpuntos_cliente Integer references TABLE_PUNTOS (id_puntos), nit_cliente text, genero text )");

        baseDeDatos.execSQL("CREATE TABLE "+TABLE_FACTURACION+"(id_facturacion Integer primary key autoincrement, " +
                "cantidad_facura Integer, monto_factura real, fecha_factura text, nit_facturacion text," +
                "id_cajero Integer references TABLE_USUARIO (id_usuario), id_cliente Integer references TABLE_CLIENTE (id_cliente), idpuntos_factura Integer references TABLE_PUNTOS (id_puntos),latitud text, longitud text )");

        baseDeDatos.execSQL("CREATE TABLE "+TABLE_USUARIO+"(id_usuario Integer primary key autoincrement, " +
                "nombre_usuario text, pwd_usuario text, user_usuario text, correo_usuario text," +
                "telefono_usuario text, rol_usuario text, fechanac_usuario text, direccion_usuario text, dpi_usuario text," +
                "apellido_usuario text, latitud_usuario text, longitud_usuario text, genero text )");

        baseDeDatos.execSQL("CREATE TABLE "+TABLE_DETALLE+"(id_detalle Integer primary key autoincrement, " +
                "numserie_detalle text references TABLE_PRODUCTO (numero_serie) , precioprod_detalle real references TABLE_PRODUCTO (precio), cantidad_detalle Integer, idprod_detalle Integer references TABLE_PRODUCTO (id)," +
                "idfac_detalle Integer references TABLE_FACTURACION (id_facturacion))");

        baseDeDatos.execSQL("CREATE TABLE "+TABLE_PUNTOS+"(id_puntos Integer primary key autoincrement, " +
                "dpicliente_puntos text references TABLE_CLIENTE (dpi_cliente), id_cajero Integer references TABLE_USUARIO (id_usuario), latitud_puntos text, longitud_puntos text," +
                "numero_puntos Integer, fecha_puntos text)");

        baseDeDatos.execSQL("CREATE TABLE "+TABLE_ESTADO+"(id_estado Integer primary key autoincrement, " +
                "descripcion_estado text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
