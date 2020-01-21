public class User
{
    //All final attributes
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String telefono;
    private final String direccion;

    private User(UserBuilder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.edad = builder.edad;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
    }


    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "User: "+this.nombre +", "+this.apellido +", "+this.edad +", "+this.telefono +", "+this.direccion;
    }

    public static class UserBuilder
    {
        private final String nombre;
        private final String apellido;
        private int edad;
        private String telefono;
        private String direccion;

        public UserBuilder(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }
        public UserBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }
        public UserBuilder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }
        public UserBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }
        public User build() {
            User user =  new User(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(User user) {

        }
    }
}
