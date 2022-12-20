public class Test {
    UserBo uBo = new UserBo();
    DDBBUsuarios user = new DDBBUsuarios();
    String mensaje = "";

    public void insertar() {
        user.setApellidos("Rovira");
        user.setContrasena("sanpedro");
        user.setEmpresa(2);
        user.setNick("Nerii");
        user.setNombre("Nerea");
        user.setNivel(1);
        mensaje = uBo.add(user);
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();

    }
}
