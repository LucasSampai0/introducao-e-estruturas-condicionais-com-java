public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        /*
        if (plano == "B"){
            System.out.println("100 minutos de ligação");
        }
        else if(plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram de graça");
        }
        else if(plano =="T"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram de graça");
            System.out.println("5Gb Youtube");
        }
        */

        switch (plano){
            case "T":
            System.out.println("5Gb Youtube");
            break;
            case "M":
            System.out.println("Whats e Instagram de graça");
            break;
            case "B":
            System.out.println("100 minutos de ligação");
        }
    }
}
