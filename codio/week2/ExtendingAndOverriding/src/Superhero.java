public class Superhero extends Person {
        private String secretIdentity;

        public Superhero(String na, int a, String o, String s) {
            super(na, a, o);
            secretIdentity = s;
        }

        public String getSecretIdentity() {
            return secretIdentity;
        }

        public void setSecretIdentity(String newIdentity) {
            secretIdentity = newIdentity;
        }

}
