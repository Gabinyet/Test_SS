// CLASIFICA PERSONAS SEGÚN EDAD Y SEXO

public class LeerPersonas {

    static class Persona {

        String sexo;
        int edad;

        public Persona(String sexo, int edad) {

            this.sexo = sexo;
            this.edad = edad;

        }
    }

    public static void main(String[] args) { // definimos el vector de 50 personas
        Persona[] ppl = new Persona[50];

        ppl[0] = new Persona("F", 25);
        ppl[1] = new Persona("F", 30);
        ppl[2] = new Persona("F", 35);
        ppl[3] = new Persona("F", 20);
        ppl[4] = new Persona("M", 40);
        ppl[5] = new Persona("F", 45);
        ppl[6] = new Persona("F", 50);
        ppl[7] = new Persona("F", 55);
        ppl[8] = new Persona("F", 60);
        ppl[9] = new Persona("F", 65);
        ppl[10] = new Persona("F", 70);
        ppl[11] = new Persona("F", 75);
        ppl[12] = new Persona("M", 80);
        ppl[13] = new Persona("F", 85);
        ppl[14] = new Persona("F", 90);
        ppl[15] = new Persona("F", 95);
        ppl[16] = new Persona("M", 23);
        ppl[17] = new Persona("F", 28);
        ppl[18] = new Persona("M", 33);
        ppl[19] = new Persona("F", 37);
        ppl[20] = new Persona("M", 42);
        ppl[21] = new Persona("F", 47);
        ppl[22] = new Persona("M", 54);
        ppl[23] = new Persona("F", 59);
        ppl[24] = new Persona("M", 64);
        ppl[25] = new Persona("F", 69);
        ppl[26] = new Persona("F", 5);
        ppl[27] = new Persona("F", 10);
        ppl[28] = new Persona("M", 15);
        ppl[29] = new Persona("F", 12);
        ppl[30] = new Persona("F", 18);
        ppl[31] = new Persona("F", 22);
        ppl[32] = new Persona("F", 27);
        ppl[33] = new Persona("F", 32);
        ppl[34] = new Persona("F", 10);
        ppl[35] = new Persona("F", 15);
        ppl[36] = new Persona("M", 20);
        ppl[37] = new Persona("F", 8);
        ppl[38] = new Persona("F", 13);
        ppl[39] = new Persona("F", 18);
        ppl[40] = new Persona("M", 23);
        ppl[41] = new Persona("F", 28);
        ppl[42] = new Persona("M", 13);
        ppl[43] = new Persona("F", 18);
        ppl[44] = new Persona("F", 17);
        ppl[45] = new Persona("F", 22);
        ppl[46] = new Persona("M", 16);
        ppl[47] = new Persona("F", 21);
        ppl[48] = new Persona("M", 19);
        ppl[49] = new Persona("F", 24);

        //clasificación 
        int Mayores18 = 0; //mayores de edad
        int Menores18 = 0; //menores de edad
        int MujeresMenor = 0; //mujeres menores de edad
        int HombresMayor = 0; // mayores de edad
        int MujeresTotal = 0; //mujeres en total

        for (int i = 0; i < 50; i = i + 1) {
            if (ppl[i].edad >= 18) {
                Mayores18 = Mayores18 + 1;
                if (ppl[i].sexo.equalsIgnoreCase("M")) {
                    HombresMayor = HombresMayor + 1;
                }
            } else {
                Menores18 = Menores18 + 1;
                if (ppl[i].sexo.equalsIgnoreCase("F")) {
                    MujeresMenor = MujeresMenor + 1;
                }
            }

            if (ppl[i].sexo.equalsIgnoreCase("F")) {
                MujeresTotal = MujeresTotal + 1;
            }
        }

        float MujeresxCien = (MujeresTotal * 100) / 50;
        float MayoresxCien = (Mayores18 * 100) / 50;

        System.out.println("Cantidad de personas mayores de edad (18 años o más): " + Mayores18);
        System.out.println("Cantidad de personas menores de edad: " + Menores18);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + HombresMayor);
        System.out.println("Cantidad de personas femeninas menores de edad: " + MujeresMenor);
        System.out.println("Porcentaje de personas mayores de edad respecto al total: " + MayoresxCien + "%");
        System.out.println("Porcentaje de mujeres respecto al total: " + MujeresxCien + "%");
    }
}
