
// class Start {}

// class Start {
//     public static void main(String[] args) {}
// }

// class Start {
//     public static void main(String[] args) {
//         System.out.print("Hello, World!");
//     }
// }

// class Start {
//     public static void main(String[] args) {
//         String salutation = "Hello, World!";
//         System.out.print(salutation);
//     }
// }

class Start {
    public static String getSalutation() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        String salutation = getSalutation();
        System.out.print(salutation);
    }
}