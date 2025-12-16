/* 

= → simple assignment

+= → add and assign

-= → subtract and assign

*= → multiply and assign

/= → divide and assign

%= → modulus and assign


++a → pre-increment: add 1, then use value

a++ → post-increment: use value, then add 1

--a → pre-decrement

a-- → post-decrement

== → equals

!= → not equals

> → greater than

< → less than

>= → greater or equal

<= → less or equal

&& → AND (both must be true)

|| → OR (any true makes it true)

! → NOT (reverses value)

& → AND

| → OR

^ → XOR

~ → NOT

<< → left shift

>> → right shift

>>> → unsigned right shift


*/

class Operators{
    public static void main(String []args){
       
       int A = 7;
       int B = 9;
       boolean shadil = true;
       int C = A+B;
       int d = A-C;
       int e= A*2;
       int f = A/A;
       int g = A%B;
       if(A>=0 && A<=8){
        System.out.println("this one" + shadil);
        System.out.println("this one" + C);
        System.out.println("this one" + d);
        System.out.println("this one" + e);
        System.out.println("this one" + f);
        System.out.println("this one" + g);

       }
       
    }
}