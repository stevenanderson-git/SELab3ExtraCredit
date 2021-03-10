public class Hello {
    public static void main(String[] argv) {
		//Collaborating Comment by Jim
		//This is hello2!
        String name = "World";
        if(argv.length != 0){
            name = argv[0];
        }
        System.out.println("Hello, " + name + "!");
    }
}