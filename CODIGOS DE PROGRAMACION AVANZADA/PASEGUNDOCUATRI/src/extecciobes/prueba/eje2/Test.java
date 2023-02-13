package extecciobes.prueba.eje2;

public class Test {


    public static void main(String[] args) {
        Bone e =new Bone(5,5);
        try{
            for (int i=0;i<10;i++){
                e.haceViaje();
            }

        }catch (Exceptio m){
            System.out.println(m.getMessage());
        }
    }
}
