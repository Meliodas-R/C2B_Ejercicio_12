package com.eon.PL;

import com.eon.Entities.Maquina;
import com.eon.Entities.Moneda;
import com.eon.Entities.Refresco;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Maquina maquina = new Maquina();
        maquina = puestaEnMarcha(maquina);

        boolean salir = false;
        boolean salirSubmenu = false;
        int opcionElegida;
        int opcionElegidaSubmenu;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\n\nMAQUINA EXPENDEDORA");
            System.out.println("===================");
            System.out.println("0. Salir.");
            System.out.println("1. Agua.");
            System.out.println("2. Kas limon.");
            System.out.println("3. Kas naranja.");
            System.out.println("4. Coca-Cola.");
            System.out.println("5. Nestea.");
            System.out.println("6. Pepsi.");
            System.out.println("7. Aquarius.");
            System.out.println("8. Aquarius naranja.");
            System.out.println("9. Fanta naranja.");
            System.out.println("10. Fanta limon.");
            System.out.println("11. Añadir monedas.");
            System.out.println("Seleccione una opción: ");
            opcionElegida = teclado.nextInt();

            switch (opcionElegida) {

                case 0:
                    salir = true;
                    break;

                case 1:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de una botella de agua es de " + maquina.getRefrescos().get(0).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(0).getCantidad() + " botella/s de agua en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(0).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 2:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de un kas limon es de " + maquina.getRefrescos().get(1).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(1).getCantidad() + " lata/s de kas limon en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(1).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 3:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de un kas naranja es de " + maquina.getRefrescos().get(2).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(2).getCantidad() + " lata/s de kas naranja en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(2).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 4:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de una Coca-Cola es de " + maquina.getRefrescos().get(3).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(3).getCantidad() + " lata/s de Coca-Cola en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(3).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 5:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de un nestea es de " + maquina.getRefrescos().get(4).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(4).getCantidad() + " lata/s de nestea en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(4).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 6:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de una pepsi es de " + maquina.getRefrescos().get(5).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(5).getCantidad() + " lata/s de pepsi en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(5).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 7:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de un aquarius es de " + maquina.getRefrescos().get(6).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(6).getCantidad() + " lata/s de aquarius en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(6).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 8:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de un aquarius naranja es de " + maquina.getRefrescos().get(7).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(7).getCantidad() + " lata/s de aquarius naranja en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(7).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 9:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de una fanta naranja es de " + maquina.getRefrescos().get(8).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(8).getCantidad() + " lata/s de fanta naranja en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(8).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 10:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver precio.");
                        System.out.println("2. Ver stock producto.");
                        System.out.println("3. Comprar.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                System.out.println("El precio de una fanta limon es de " + maquina.getRefrescos().get(9).getPrecio() + "€");
                                break;
                            case 2:
                                System.out.println("Quedan " + maquina.getRefrescos().get(9).getCantidad() + " lata/s de fanta limon en stock.");
                                break;
                            case 3:
                                maquina.getRefrescos().get(9).entregarRefresco();
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;

                case 11:

                    while (salirSubmenu != true) {
                        System.out.println("0. Volver al menu anterior.");
                        System.out.println("1. Ver dinero disponible.");
                        System.out.println("2. Introducir dinero.");
                        System.out.println("Seleccione una opción: ");
                        opcionElegidaSubmenu = teclado.nextInt();

                        switch (opcionElegidaSubmenu) {

                            case 0:
                                salirSubmenu = true;
                                break;
                            case 1:
                                calcularDineroUsuario(maquina);
                                break;
                            case 2:
                                System.out.println("Monedas de 2€");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(200), teclado.nextInt()));
                                System.out.println("Monedas de 1€");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(100), teclado.nextInt()));
                                System.out.println("Monedas de 50 centimos");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(50), teclado.nextInt()));
                                System.out.println("Monedas de 20 centimos€");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(20), teclado.nextInt()));
                                System.out.println("Monedas de 10 centimos");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(10), teclado.nextInt()));
                                System.out.println("Monedas de 5 centimos");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(5), teclado.nextInt()));
                                System.out.println("Monedas de 2 centimos");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(2), teclado.nextInt()));
                                System.out.println("Monedas de 1 centimo");
                                maquina.agregarMonedaUsuario(new Moneda(BigDecimal.valueOf(1), teclado.nextInt()));
                                break;
                        }

                    }

                    salirSubmenu = false;
                    break;
            }

        } while (salir != true);

    }

    public static void mostrar(Maquina maquina) {

        Iterator<Refresco> it = maquina.getRefrescos().iterator();

        while (it.hasNext()) {
            Refresco refresco = it.next();
            System.out.println("Nombre: " + refresco.getNombre());
            System.out.println(" Cantidad: " + refresco.getCantidad());
            System.out.println(" Precio: " + refresco.getPrecio());
        }
    }

    public static Maquina puestaEnMarcha(Maquina maquina) {

        maquina.agregarRefresco(new Refresco("Agua", 10, BigDecimal.valueOf(0.50)));
        maquina.agregarRefresco(new Refresco("Kas limon", 10, BigDecimal.valueOf(0.60)));
        maquina.agregarRefresco(new Refresco("Kas naranja", 10, BigDecimal.valueOf(0.60)));
        maquina.agregarRefresco(new Refresco("Coca-Cola", 10, BigDecimal.valueOf(0.80)));
        maquina.agregarRefresco(new Refresco("Nestea", 10, BigDecimal.valueOf(0.75)));
        maquina.agregarRefresco(new Refresco("Pepsi", 10, BigDecimal.valueOf(0.80)));
        maquina.agregarRefresco(new Refresco("Aquarius", 10, BigDecimal.valueOf(0.90)));
        maquina.agregarRefresco(new Refresco("Aquarius naranja", 10, BigDecimal.valueOf(0.90)));
        maquina.agregarRefresco(new Refresco("Fanta naranja", 10, BigDecimal.valueOf(0.89)));
        maquina.agregarRefresco(new Refresco("Fanta limon", 10, BigDecimal.valueOf(0.89)));

        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(200), 10));
        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(100), 10));
        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(50), 10));
        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(20), 10));
        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(10), 10));
        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(5), 10));
        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(2), 10));
        maquina.agregarMonedaMaquina(new Moneda(BigDecimal.valueOf(1), 10));

        return maquina;
    }

    public static void calcularDineroUsuario(Maquina maquina) {
        maquina.getMonedasUsuario();
        
        Iterator<Moneda> it = maquina.getMonedasUsuario().iterator();
        BigDecimal dineroTotal = null;

        while (it.hasNext()) {
            Moneda moneda = it.next();
            System.out.println("Nombre: " + moneda.getValor());
            System.out.println("Cantidad: " + moneda.getCantidad());
            dineroTotal = moneda.getValor().multiply(BigDecimal.valueOf(moneda.getCantidad()));
        }
        
        System.out.println(dineroTotal);
    }

}
