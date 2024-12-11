package Complexities.RecurrsiveAlgorithms;

public class Theory {
    //at the same time no two functions calls which are in the same level of recursion will be in the stack
    //so the space complexity will be the height of the tree
    //two types of recursion:-
    //1)linear
    //2)divide and conquer

    /*
    divide and conquer recurrence:-
    form:
    T(x)=a1T(b1x+g1(x))+a2T(b2x+g2(x))+...+akT(bkx+gk(x))+g(x)  for x>=x0

    how to actually solve to get the complexity?
    1)plug and chug
    2)master's theorem
    3)akra bazzi formula

    akra bazzi formula:

    T(x)=0(x^p+x^p*1ʃx[g(u)/u^(p+1)]dx
     where p=a1b1^p+a2b2^p+....+akbk^p=1

     if you are not able to find p:

     */

    /*
    linear recurrence relation:-
    f(x)=a1f(x-1)+a2f(x-2)+...+akf(x-k)
    solution:
    1)put f(n)=a^n for some constant a
    2)f(n)=c1a1^n+c2a2^n
    3)number of roots=number of answers
    so find c1 and c2 with base conditions
    4)if the recurrence relation is non-homogenous then put g(x)=0 and solve it first take g(x) on one side and find particular solution.
    if g(x)=x^2 given a polynomial of degree 2 then guess polynomial of degree 2

    how do we guess particular solution?
    ->if g(n) is exponential guess of same type
    eg:g(n)=2^n+3^n
       f(n)=a*2^n+b*3^n
    ->if guess fails increase the degree of the guess
     */
}
