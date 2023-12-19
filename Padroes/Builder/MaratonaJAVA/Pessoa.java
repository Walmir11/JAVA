package PadroesProjeto.Builder.MaratonaJAVA;

public class Pessoa {

    private String firstname;
    private String lastName;
    private String userName;
    private String email;

    private Pessoa(String firstname, String lastName, String userName, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    public static class PersonBiulder{
        private String firstname;
        private String lastName;
        private String userName;
        private String email;

        public PersonBiulder firstname(String firstname){
            this.firstname = firstname;
            return this;
        }

        public PersonBiulder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBiulder userName(String userName){
            this.userName = userName;
            return this;
        }

        public PersonBiulder email(String email){
            this.email = email;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(firstname,lastName,userName,email);
        }
    }


}
