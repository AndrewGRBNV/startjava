class Variable {
    public static void main(String[] args) {
        byte cores = 8;
        short ramSize = 8192;
        int freq = 2600;
        long hardDisk = 46511104;
        float flashSize = 128;
        double monitorSize = 21;
        char generation = '8';
        boolean intel = true;

        System.out.println("число ядер процессора " + cores);
        System.out.println("Объём оперативной памяти " + ramSize);
        System.out.println("Частота процессора " + freq);
        System.out.println("Объём жёсткого диска " + hardDisk + " Байт");
        System.out.println("Объём flash накопителя " + flashSize + " Гбайт");
        System.out.println("Диагональ монитора " + monitorSize + " дюймов");
        System.out.println("Поколение процессора " + generation);
        System.out.println("Intel " + intel);
    }
}