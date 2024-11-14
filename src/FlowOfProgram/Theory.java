package FlowOfProgram;

public class Theory {
    public static void main(String[] args) {
        System.out.println("This file contains the theory of flow of program");
        //symbols
        /*
        start/stop-->oval
        input/output-->parallelogram
        processing-->rectangle
        condition-->diamond
         */
        /*
        Q.Take a name and output Hello Name

        start->input->store input+name->output->stop
         */
        /*
        Q.Take input of a salary.If the salary if greater than 10,000
        add bonus as 2000,otherwise add bonus as 1000.
                             print salary+2000->stop
                             ^ salary>10000
        start->salary input->|
                             v salary<10000
                             print salary+1000->stop
         */
    }
}
