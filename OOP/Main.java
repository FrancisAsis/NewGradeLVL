package OOP;

       class SchoolID {

        String studentName;
        String LRN;
        String gradeSection;
         

        void tapToEnter() {
            System.out.println(studentName + "tapped in at the gate.");
        }

        void showInfo () {
            System.out.println(studentName + " | LRN:  " + LRN 
                + "|" + gradeSection
            );
        }

    }



    public class Main{

        public static void main(String[] args) {
            SchoolID myID = new SchoolID();
            myID.studentName = "Juan Dela Cruz";
            myID.LRN = "123456789012";
            myID.gradeSection = "Grade 12 - TVL";

            myID.showInfo();
            myID.tapToEnter();

            
            

        }
    }











