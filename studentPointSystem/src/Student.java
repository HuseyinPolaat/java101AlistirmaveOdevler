public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }
    }

    public void addBulkOpinionNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.opinionNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.opinionNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.opinionNote = kimya;
        }
    }

    public void calcNote() {
        this.mat.note = (this.mat.examNote * 0.80) + (this.mat.opinionNote * 0.20);
        this.fizik.note = (this.mat.examNote * 0.70) + (this.mat.opinionNote * 0.30);
        this.kimya.note = (this.mat.examNote * 0.60) + (this.mat.opinionNote * 0.40);
    }

    public void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Ortalama : " + this.avarage);
        if (this.isPass) {
            System.out.println("Sınıfı Geçti. ");
        } else {
            System.out.println("Sınıfta Kaldı.");
        }

        /*
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
         */
    }

    public void calcAvarage() {
        calcNote();
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}