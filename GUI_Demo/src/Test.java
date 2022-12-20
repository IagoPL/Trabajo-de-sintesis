public class Test {
    UserBo uBo = new UserBo();
    DDBBUsuarios user = new DDBBUsuarios();
    String mensaje = "";

    public void insertar() {
        user.setApellidos("lujano");
        user.setContrasena("perrito124");
        user.setEmpresa(123);
        user.setNick("JordiEvole");
        user.setNombre("holu");
        user.setNivel(1);
        mensaje = uBo.add(user);
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();
    }
}
