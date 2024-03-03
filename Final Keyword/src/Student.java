public class Student {


    //final keyword
    final String NAME ="John"; // we can't change the value declared with final keyword


    //blank final keyword
    final int ID; // to set a value of blank final, we need to use constructor
    Student(){
        ID=123;
    }


    // Static blank final
    static final int PHONE; // to set a static value of blank final, we need to use static block
    static{
        PHONE=84843847;
    }
}
