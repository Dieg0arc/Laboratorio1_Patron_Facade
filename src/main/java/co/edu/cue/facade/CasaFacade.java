package co.edu.cue.facade;

public class CasaFacade {
    private SistemaDeIluminacion iluminacion;
    private SistemaDeClimatizacion climatizacion;
    private SistemaDeSeguridad seguridad;
    private SistemaDeEntretenimiento entretenimiento;

    public CasaFacade() {
        this.iluminacion = new SistemaDeIluminacion();
        this.climatizacion = new SistemaDeClimatizacion();
        this.seguridad = new SistemaDeSeguridad();
        this.entretenimiento = new SistemaDeEntretenimiento();
    }

    public void modoNoche() {
        iluminacion.apagarLuces();
        climatizacion.encenderAireAcondicionado();
        seguridad.activarSistema();
        entretenimiento.apagarTelevisor();
        System.out.println("Modo noche activado.");
    }

    public void modoDia() {
        iluminacion.encenderLuces();
        climatizacion.apagarAireAcondicionado();
        seguridad.desactivarSistema();
        entretenimiento.encenderTelevisor();
        System.out.println("Modo día activado.");
    }
}
